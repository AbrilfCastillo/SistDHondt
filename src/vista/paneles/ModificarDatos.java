
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

        lblModifique = new javax.swing.JLabel();
        sepTituloForm = new javax.swing.JSeparator();
        txtCantVotos = new javax.swing.JFormattedTextField();
        lblNombrePartido = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        lblCantVotos = new javax.swing.JLabel();
        txtNombrePartido = new javax.swing.JTextField();
        cmbPartidos = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(500, 500));

        lblModifique.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblModifique.setText("Modifique los datos del partido seleccionado");
        lblModifique.setInheritsPopupMenu(false);

        txtCantVotos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        txtCantVotos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCantVotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantVotosActionPerformed(evt);
            }
        });
        txtCantVotos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantVotosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantVotosKeyTyped(evt);
            }
        });

        lblNombrePartido.setText("Nombre del partido");

        btnCargar.setText("Cargar");

        lblCantVotos.setText("Cantidad de votos");

        txtNombrePartido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombrePartidoKeyPressed(evt);
            }
        });

        cmbPartidos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModifique)
                    .addComponent(sepTituloForm, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151)
                .addComponent(btnCargar)
                .addGap(407, 407, 407))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(325, 325, 325)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblNombrePartido)
                        .addComponent(lblCantVotos))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombrePartido, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addComponent(txtCantVotos))
                    .addGap(318, 318, 318)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModifique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepTituloForm, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(cmbPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(205, 205, 205))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(164, 164, 164)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombrePartido)
                        .addComponent(txtNombrePartido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCantVotos)
                        .addComponent(txtCantVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(266, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePartidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePartidoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePartidoKeyPressed

    private void txtCantVotosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantVotosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantVotosKeyTyped

    private void txtCantVotosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantVotosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantVotosKeyPressed

    private void txtCantVotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantVotosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantVotosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JComboBox<String> cmbPartidos;
    private javax.swing.JLabel lblCantVotos;
    private javax.swing.JLabel lblModifique;
    private javax.swing.JLabel lblNombrePartido;
    private javax.swing.JSeparator sepTituloForm;
    private javax.swing.JFormattedTextField txtCantVotos;
    private javax.swing.JTextField txtNombrePartido;
    // End of variables declaration//GEN-END:variables
}
