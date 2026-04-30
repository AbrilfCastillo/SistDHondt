package controladores;

import modelo.Partido;
import modelo.dao.ConexionDAO;
import vista.paneles.BajaPartido;
import vista.paneles.CargarPartido;
import vista.paneles.ModificarDatos;

import javax.swing.*;
import java.util.List;

// Controla las funciones de los partidos (cargar, modificar, dar de baja)

public class ControladorPartido {

    private CargarPartido vistaCargar;
    private ModificarDatos vistaModificar;
    private BajaPartido vistaBaja;

    // Listas para recuperar el objeto Partido por índice desde los combos
    private List<Partido> listaModificar;
    private List<Partido> listaBaja;

    public ControladorPartido(CargarPartido vistaCargar, ModificarDatos vistaModificar, BajaPartido vistaBaja) {
        this.vistaCargar = vistaCargar;
        this.vistaModificar = vistaModificar;
        this.vistaBaja = vistaBaja;

        iniciarEventos();
    }

    private void iniciarEventos() {

        // Evento cargar
        vistaCargar.getBtnCargar().addActionListener(e -> cargarPartido());

        // Evento modificar: al seleccionar se completan los campos
        vistaModificar.getCmbPartidos().addActionListener(e -> autocompletarModificar());
        vistaModificar.getBtnCargar().addActionListener(e -> modificarPartido());

        // Evento dar de baja
        vistaBaja.getBtnDarBaja().addActionListener(e -> darDeBaja());

        // Validar que solo se escriban números en el campo votos de cargar
        vistaCargar.getTxtCantVotos().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                if (!Character.isDigit(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        });

        // Validar que solo se escriban números en el campo votos de modificar
        vistaModificar.getTxtCantVotos().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                if (!Character.isDigit(evt.getKeyChar())) {
                    evt.consume();
                }
            }
        });
    }

    // Cargar partido

    private void cargarPartido() {
        String nombre = vistaCargar.getTxtNombrePartido().getText().trim();
        String votosStr = vistaCargar.getTxtCantVotos().getText().trim();

        // Valida que los campos no estén vacíos
        if (nombre.isEmpty() || votosStr.isEmpty()) {
            JOptionPane.showMessageDialog(vistaCargar, "No puede haber casillas vacías.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int votos = Integer.parseInt(votosStr.replace(".", ""));

            // Si los votos son negativos, mensaje de error
            if (votos < 0) {
                JOptionPane.showMessageDialog(vistaCargar, "La cantidad de votos debe ser un número entero positivo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            ConexionDAO.nuevoPartido(nombre, votos);
            JOptionPane.showMessageDialog(vistaCargar, "Guardado", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vistaCargar, "No es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        limpiarCargar();
        refrescarCombos();
        vistaCargar.getTxtNombrePartido().requestFocus();
    }

    // Completa los campos al seleccionar partido en el combo de modificar

    private void autocompletarModificar() {
        int indice = vistaModificar.getCmbPartidos().getSelectedIndex();

        // índice 0 es el placeholder "(Seleccionar)"
        if (indice <= 0 || listaModificar == null) {
            vistaModificar.getTxtNombrePartido().setText("");
            vistaModificar.getTxtCantVotos().setText("");
            return;
        }

        Partido seleccionado = listaModificar.get(indice - 1);
        vistaModificar.getTxtNombrePartido().setText(seleccionado.getNombre());
        vistaModificar.getTxtCantVotos().setText(String.valueOf(seleccionado.getVotos()));
    }

    // Modificar partido

    private void modificarPartido() {
        int indice = vistaModificar.getCmbPartidos().getSelectedIndex();

        // índice 0 es el placeholder "(Seleccionar)"
        if (indice <= 0 || listaModificar == null) {
            JOptionPane.showMessageDialog(vistaModificar, "Seleccioná un partido para modificar.", "Sin selección", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Partido seleccionado = listaModificar.get(indice - 1);

        String nombre = vistaModificar.getTxtNombrePartido().getText().trim();
        String votosStr = vistaModificar.getTxtCantVotos().getText().trim();

        // Valida que los campos no estén vacíos
        if (nombre.isEmpty() || votosStr.isEmpty()) {
            JOptionPane.showMessageDialog(vistaModificar, "No puede haber casillas vacías.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int votos = Integer.parseInt(votosStr);
            if (votos < 0) throw new NumberFormatException();
            
            ConexionDAO.actualizarPartido(seleccionado.getId(), nombre, votos);
            JOptionPane.showMessageDialog(vistaModificar, "Partido actualizado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vistaModificar, "La cantidad de votos debe ser un número entero positivo.", "Dato inválido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        refrescarCombos();
    }

    // Dar de baja

    private void darDeBaja() {
        int indice = vistaBaja.getCmbPartidos().getSelectedIndex();

        // índice 0 es el placeholder "(Seleccionar)"
        if (indice <= 0 || listaBaja == null) {
            JOptionPane.showMessageDialog(vistaBaja, "Seleccioná un partido para dar de baja.", "Sin selección", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Partido seleccionado = listaBaja.get(indice - 1);

        int confirmar = JOptionPane.showConfirmDialog(vistaBaja,
                "¿Estás segura de que querés eliminar \"" + seleccionado.getNombre() + "\"?",
                "Confirmar baja", JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            ConexionDAO.eliminarPartido(seleccionado.getId());
            JOptionPane.showMessageDialog(vistaBaja, "Partido eliminado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            refrescarCombos();
        }
    }

    // Carga los partidos de la BD en los combos de Modificar y Baja

    public void refrescarCombos() {
        List<Partido> lista = ConexionDAO.mostrarPartidos();

        listaModificar = lista;
        listaBaja = lista;

        // Combo Modificar
        DefaultComboBoxModel<String> modeloMod = new DefaultComboBoxModel<>();
        modeloMod.addElement("(Seleccionar)");
        for (Partido p : lista) modeloMod.addElement(p.toString());
        vistaModificar.getCmbPartidos().setModel(modeloMod);

        // Combo Baja
        DefaultComboBoxModel<String> modeloBaja = new DefaultComboBoxModel<>();
        modeloBaja.addElement("(Seleccionar)");
        for (Partido p : lista) modeloBaja.addElement(p.toString());
        vistaBaja.getCmbPartidos().setModel(modeloBaja);

        // Limpiar campos de modificar al refrescar
        vistaModificar.getTxtNombrePartido().setText("");
        vistaModificar.getTxtCantVotos().setText("");
    }

    private void limpiarCargar() {
        vistaCargar.getTxtNombrePartido().setText("");
        vistaCargar.getTxtCantVotos().setText("");
    }
}