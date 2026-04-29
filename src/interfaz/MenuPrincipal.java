/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
/**
 *
 * @author cielo
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        Estilo.aplicarTitulo(lblTituloForm);
        Estilo.aplicarSeparadorTitulo(sepMenu);
        
        //Clases de interfaz
        Inicio o1 = new Inicio();
        CargarPartido o2 = new CargarPartido();
        ModificarDatos o3 = new ModificarDatos();
        BajaPartido o4 = new BajaPartido();
        InformeCargos o5 = new InformeCargos();
        InformeDivision o6 = new InformeDivision();
        InformePartidos o7 = new InformePartidos();

        //Las agrego al pnlFormularios
        pnlFormularios.add(o1, "pnlInicio");
        pnlFormularios.add(o2, "pnlCargarPartido");
        pnlFormularios.add(o3, "pnlModificarDatos");
        pnlFormularios.add(o4, "pnlBajaPartido");
        pnlFormularios.add(o5, "pnlInformeCargos");
        pnlFormularios.add(o6, "pnlInformeDivision");
        pnlFormularios.add(o7, "pnlInformePartidos");
        
        //Panel de inicio
        CardLayout card = (CardLayout) pnlFormularios.getLayout();
        card.show(pnlFormularios, "pnlInicio");
        lblTituloForm.setText("Inicio");
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new Degradado();
        pnlTop = new javax.swing.JPanel();
        lblTituloMenu = new javax.swing.JLabel();
        sepMenu = new javax.swing.JSeparator();
        pnlBotones = new javax.swing.JPanel();
        lblPartidos = new javax.swing.JLabel();
        btnCargarPartido = new BotonMenu("Cargar");
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15));
        btnModificarPartido = new BotonMenu("Modificar");
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15));
        btnBajaPartido = new BotonMenu("Dar de Baja");
        lblInformes = new javax.swing.JLabel();
        btnInfCargos = new BotonMenu("Cargos");
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15));
        btnInfDivision = new BotonMenu("Division de votos");
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 15));
        btnInfPartidos = new BotonMenu("Partidos");
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 15), new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 15));
        btnReset = new javax.swing.JButton();
        pnlContenido = new javax.swing.JPanel();
        pnlTopContenido = new javax.swing.JPanel();
        lblTituloForm = new javax.swing.JLabel();
        pnlEspacioTitulo = new javax.swing.JPanel();
        sepTitulo = new javax.swing.JSeparator();
        pnlFormularios = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        pnlMenu.setMaximumSize(new java.awt.Dimension(220, 0));
        pnlMenu.setMinimumSize(new java.awt.Dimension(220, 0));
        pnlMenu.setOpaque(false);
        pnlMenu.setPreferredSize(new java.awt.Dimension(220, 0));
        pnlMenu.setLayout(new java.awt.BorderLayout());

        pnlTop.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 10, 0, 10));
        pnlTop.setOpaque(false);
        pnlTop.setPreferredSize(new java.awt.Dimension(0, 80));
        pnlTop.setLayout(new javax.swing.BoxLayout(pnlTop, javax.swing.BoxLayout.Y_AXIS));

        lblTituloMenu.setBackground(new java.awt.Color(255, 255, 255));
        lblTituloMenu.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTituloMenu.setForeground(new java.awt.Color(228, 232, 242));
        lblTituloMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTituloMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo.png"))); // NOI18N
        lblTituloMenu.setText("<html>Sistema<br>D'Hondt</html>");
        lblTituloMenu.setIconTextGap(10);
        pnlTop.add(lblTituloMenu);

        sepMenu.setBackground(new java.awt.Color(154, 171, 198));
        sepMenu.setForeground(new java.awt.Color(136, 158, 191));
        sepMenu.setMinimumSize(new java.awt.Dimension(50, 0));
        sepMenu.setName(""); // NOI18N
        sepMenu.setPreferredSize(new java.awt.Dimension(180, 2));
        pnlTop.add(sepMenu);

        pnlMenu.add(pnlTop, java.awt.BorderLayout.NORTH);

        pnlBotones.setOpaque(false);
        pnlBotones.setLayout(new javax.swing.BoxLayout(pnlBotones, javax.swing.BoxLayout.Y_AXIS));

        lblPartidos.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblPartidos.setForeground(new java.awt.Color(255, 255, 255));
        lblPartidos.setText("Partidos");
        lblPartidos.setToolTipText("");
        lblPartidos.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));
        lblPartidos.setInheritsPopupMenu(false);
        pnlBotones.add(lblPartidos);

        btnCargarPartido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnCargarPartido.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarPartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/agregarNotFocus.png"))); // NOI18N
        btnCargarPartido.setText("Cargar");
        btnCargarPartido.setBorderPainted(false);
        btnCargarPartido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarPartido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCargarPartido.setIconTextGap(15);
        btnCargarPartido.setMaximumSize(new java.awt.Dimension(200, 45));
        btnCargarPartido.setMinimumSize(new java.awt.Dimension(200, 45));
        btnCargarPartido.setPreferredSize(new java.awt.Dimension(200, 45));
        btnCargarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarPartidoActionPerformed(evt);
            }
        });
        pnlBotones.add(btnCargarPartido);
        pnlBotones.add(filler2);

        btnModificarPartido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnModificarPartido.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarPartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/modificarNotfocus.png"))); // NOI18N
        btnModificarPartido.setText("Modificar");
        btnModificarPartido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarPartido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarPartido.setIconTextGap(15);
        btnModificarPartido.setMaximumSize(new java.awt.Dimension(200, 45));
        btnModificarPartido.setMinimumSize(new java.awt.Dimension(200, 45));
        btnModificarPartido.setPreferredSize(new java.awt.Dimension(200, 45));
        btnModificarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPartidoActionPerformed(evt);
            }
        });
        pnlBotones.add(btnModificarPartido);
        pnlBotones.add(filler1);

        btnBajaPartido.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnBajaPartido.setForeground(new java.awt.Color(255, 255, 255));
        btnBajaPartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/bajaNotfocus.png"))); // NOI18N
        btnBajaPartido.setText("Dar de baja");
        btnBajaPartido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBajaPartido.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBajaPartido.setIconTextGap(15);
        btnBajaPartido.setMaximumSize(new java.awt.Dimension(200, 45));
        btnBajaPartido.setMinimumSize(new java.awt.Dimension(200, 45));
        btnBajaPartido.setPreferredSize(new java.awt.Dimension(200, 45));
        btnBajaPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaPartidoActionPerformed(evt);
            }
        });
        pnlBotones.add(btnBajaPartido);

        lblInformes.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblInformes.setForeground(new java.awt.Color(255, 255, 255));
        lblInformes.setText("Informes");
        lblInformes.setToolTipText("");
        lblInformes.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 10, 0));
        lblInformes.setInheritsPopupMenu(false);
        pnlBotones.add(lblInformes);

        btnInfCargos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnInfCargos.setForeground(new java.awt.Color(255, 255, 255));
        btnInfCargos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/informeCargosNotFocus.png"))); // NOI18N
        btnInfCargos.setText("Cargos");
        btnInfCargos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfCargos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInfCargos.setIconTextGap(15);
        btnInfCargos.setMaximumSize(new java.awt.Dimension(200, 45));
        btnInfCargos.setMinimumSize(new java.awt.Dimension(200, 45));
        btnInfCargos.setPreferredSize(new java.awt.Dimension(200, 45));
        btnInfCargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfCargosActionPerformed(evt);
            }
        });
        pnlBotones.add(btnInfCargos);
        pnlBotones.add(filler5);

        btnInfDivision.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnInfDivision.setForeground(new java.awt.Color(255, 255, 255));
        btnInfDivision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/informeDivisionNotFocus.png"))); // NOI18N
        btnInfDivision.setText("Division de votos");
        btnInfDivision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfDivision.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInfDivision.setIconTextGap(15);
        btnInfDivision.setMaximumSize(new java.awt.Dimension(200, 45));
        btnInfDivision.setMinimumSize(new java.awt.Dimension(200, 45));
        btnInfDivision.setPreferredSize(new java.awt.Dimension(200, 45));
        btnInfDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfDivisionActionPerformed(evt);
            }
        });
        pnlBotones.add(btnInfDivision);
        pnlBotones.add(filler3);

        btnInfPartidos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnInfPartidos.setForeground(new java.awt.Color(255, 255, 255));
        btnInfPartidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/informePartidosNotfocus.png"))); // NOI18N
        btnInfPartidos.setText("Partidos");
        btnInfPartidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfPartidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInfPartidos.setIconTextGap(15);
        btnInfPartidos.setMaximumSize(new java.awt.Dimension(200, 45));
        btnInfPartidos.setMinimumSize(new java.awt.Dimension(200, 45));
        btnInfPartidos.setPreferredSize(new java.awt.Dimension(200, 45));
        btnInfPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfPartidosActionPerformed(evt);
            }
        });
        pnlBotones.add(btnInfPartidos);
        pnlBotones.add(filler4);

        btnReset.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/resetNotFocus.png"))); // NOI18N
        btnReset.setText("Resetear datos");
        btnReset.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 18, 0, 0));
        btnReset.setBorderPainted(false);
        btnReset.setContentAreaFilled(false);
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReset.setIconTextGap(15);
        btnReset.setMaximumSize(new java.awt.Dimension(200, 45));
        btnReset.setMinimumSize(new java.awt.Dimension(200, 45));
        btnReset.setPreferredSize(new java.awt.Dimension(200, 45));
        pnlBotones.add(btnReset);

        pnlMenu.add(pnlBotones, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlMenu, java.awt.BorderLayout.WEST);

        pnlContenido.setBackground(new java.awt.Color(241, 240, 245));
        pnlContenido.setDoubleBuffered(false);
        pnlContenido.setLayout(new java.awt.BorderLayout());

        pnlTopContenido.setBackground(new java.awt.Color(241, 240, 245));
        pnlTopContenido.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 0, 20));
        pnlTopContenido.setPreferredSize(new java.awt.Dimension(0, 80));
        pnlTopContenido.setLayout(new javax.swing.BoxLayout(pnlTopContenido, javax.swing.BoxLayout.Y_AXIS));

        lblTituloForm.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblTituloForm.setForeground(new java.awt.Color(61, 75, 102));
        lblTituloForm.setText("Cargar datos de partidos");
        lblTituloForm.setInheritsPopupMenu(false);
        pnlTopContenido.add(lblTituloForm);

        pnlEspacioTitulo.setMinimumSize(new java.awt.Dimension(0, 1));
        pnlEspacioTitulo.setOpaque(false);
        pnlEspacioTitulo.setPreferredSize(new java.awt.Dimension(0, 5));
        pnlEspacioTitulo.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnlEspacioTituloLayout = new javax.swing.GroupLayout(pnlEspacioTitulo);
        pnlEspacioTitulo.setLayout(pnlEspacioTituloLayout);
        pnlEspacioTituloLayout.setHorizontalGroup(
            pnlEspacioTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1479, Short.MAX_VALUE)
        );
        pnlEspacioTituloLayout.setVerticalGroup(
            pnlEspacioTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        pnlTopContenido.add(pnlEspacioTitulo);

        sepTitulo.setForeground(new java.awt.Color(233, 233, 240));
        sepTitulo.setPreferredSize(new java.awt.Dimension(180, 2));
        pnlTopContenido.add(sepTitulo);

        pnlContenido.add(pnlTopContenido, java.awt.BorderLayout.NORTH);

        pnlFormularios.setBackground(new java.awt.Color(241, 240, 245));
        pnlFormularios.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        pnlFormularios.setToolTipText("");
        pnlFormularios.setLayout(new java.awt.CardLayout());
        pnlContenido.add(pnlFormularios, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlContenido, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarPartidoActionPerformed
        CardLayout card = (CardLayout) pnlFormularios.getLayout();
        card.show(pnlFormularios, "pnlCargarPartido");
        lblTituloForm.setText("Cargar Partidos");
        pnlFormularios.revalidate();
        pnlFormularios.repaint();
    }//GEN-LAST:event_btnCargarPartidoActionPerformed

    private void btnModificarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPartidoActionPerformed
        CardLayout card = (CardLayout) pnlFormularios.getLayout();
        card.show(pnlFormularios, "pnlModificarDatos");
        lblTituloForm.setText("Modificar Partido");
        pnlFormularios.revalidate();
        pnlFormularios.repaint();
    }//GEN-LAST:event_btnModificarPartidoActionPerformed

    private void btnBajaPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaPartidoActionPerformed
        CardLayout card = (CardLayout) pnlFormularios.getLayout();
        card.show(pnlFormularios, "pnlBajaPartido");
        lblTituloForm.setText("Dar de baja partido");
        pnlFormularios.revalidate();
        pnlFormularios.repaint();
    }//GEN-LAST:event_btnBajaPartidoActionPerformed

    private void btnInfCargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfCargosActionPerformed
        CardLayout card = (CardLayout) pnlFormularios.getLayout();
        card.show(pnlFormularios, "pnlInformeCargos");
        lblTituloForm.setText("Informe de cargos");
        pnlFormularios.revalidate();
        pnlFormularios.repaint();
    }//GEN-LAST:event_btnInfCargosActionPerformed

    private void btnInfDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfDivisionActionPerformed
        CardLayout card = (CardLayout) pnlFormularios.getLayout();
        card.show(pnlFormularios, "pnlInformeDivision");
        lblTituloForm.setText("Informe de división de votos");
        pnlFormularios.revalidate();
        pnlFormularios.repaint();
    }//GEN-LAST:event_btnInfDivisionActionPerformed

    private void btnInfPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfPartidosActionPerformed
        CardLayout card = (CardLayout) pnlFormularios.getLayout();
        card.show(pnlFormularios, "pnlInformePartidos");
        lblTituloForm.setText("Informe de partidos");
        pnlFormularios.revalidate();
        pnlFormularios.repaint();
    }//GEN-LAST:event_btnInfPartidosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBajaPartido;
    private javax.swing.JButton btnCargarPartido;
    private javax.swing.JButton btnInfCargos;
    private javax.swing.JButton btnInfDivision;
    private javax.swing.JButton btnInfPartidos;
    private javax.swing.JButton btnModificarPartido;
    private javax.swing.JButton btnReset;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.JLabel lblInformes;
    private javax.swing.JLabel lblPartidos;
    private javax.swing.JLabel lblTituloForm;
    private javax.swing.JLabel lblTituloMenu;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlEspacioTitulo;
    private javax.swing.JPanel pnlFormularios;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JPanel pnlTopContenido;
    private javax.swing.JSeparator sepMenu;
    private javax.swing.JSeparator sepTitulo;
    // End of variables declaration//GEN-END:variables
}
