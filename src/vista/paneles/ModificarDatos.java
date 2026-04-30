
package vista.paneles;
import modelo.Partido;
import vista.componentes.Estilo;

/**
 *
 * @author cielo
 */
public class ModificarDatos extends javax.swing.JPanel {

    /**
     * Creates new form ModificarDatos
     */
    public ModificarDatos() {
        initComponents();
            Estilo.aplicarSubtitulo(lblModifique);
            Estilo.aplicarTexto(lblNombrePartido);
            Estilo.aplicarTexto(lblCantVotos);
            Estilo.aplicarSeparadorTitulo(sepTituloForm);
            Estilo.aplicarTextField(txtNombrePartido);
            Estilo.aplicarTextField(txtCantVotos);
            Estilo.aplicarBoton(btnCargar);
            Estilo.aplicarCard(this);
    }
    
    public javax.swing.JComboBox<String> getCmbPartidos() { return cmbPartidos; }
    public javax.swing.JTextField getTxtNombrePartido() { return txtNombrePartido; }
    public javax.swing.JTextField getTxtCantVotos() { return txtCantVotos; }
    public javax.swing.JButton getBtnCargar() { return btnCargar; }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargar = new javax.swing.JButton();
        lblModifique = new javax.swing.JLabel();
        lblNombrePartido = new javax.swing.JLabel();
        txtNombrePartido = new javax.swing.JTextField();
        lblCantVotos = new javax.swing.JLabel();
        txtCantVotos = new javax.swing.JTextField();
        sepTituloForm = new javax.swing.JSeparator();
        cmbPartidos = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(500, 500));

        btnCargar.setText("Cargar");

        lblModifique.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblModifique.setText("Modifique los datos del partido seleccionado");
        lblModifique.setInheritsPopupMenu(false);

        lblNombrePartido.setText("Nombre de partido");
        lblNombrePartido.setInheritsPopupMenu(false);

        txtNombrePartido.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblCantVotos.setText("Cantidad de votos");
        lblCantVotos.setInheritsPopupMenu(false);

        txtCantVotos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCantVotos)
                            .addComponent(btnCargar)
                            .addComponent(lblModifique)
                            .addComponent(sepTituloForm, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombrePartido)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCantVotos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                .addComponent(txtNombrePartido, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(cmbPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModifique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepTituloForm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNombrePartido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombrePartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblCantVotos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCargar)
                .addGap(71, 71, 71)
                .addComponent(cmbPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JComboBox<String> cmbPartidos;
    private javax.swing.JLabel lblCantVotos;
    private javax.swing.JLabel lblModifique;
    private javax.swing.JLabel lblNombrePartido;
    private javax.swing.JSeparator sepTituloForm;
    private javax.swing.JTextField txtCantVotos;
    private javax.swing.JTextField txtNombrePartido;
    // End of variables declaration//GEN-END:variables
}
