package ventanaProveedor;

import Gestor.Comprobar;
import clases.Proveedor;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import sentencias.Tareas_proveedor;

/**
 *
 * @author Nacho
 */
public class ModificarProveedor extends javax.swing.JFrame {

    private final Tareas_proveedor tareas_proveedor = new Tareas_proveedor();
    private Proveedor tarea;
    
    public ModificarProveedor() {
        tarea = new Proveedor();
        initComponents();
        setLocationRelativeTo(null);
    }
    
     public ModificarProveedor(Proveedor proveedor) {
        tarea = proveedor;
        initComponents();
//        txtId.setText(String.valueOf(this.tarea.getId_proveedor()));
//        txtId.setEnabled(false);
        txtNombre.setText(this.tarea.getNombre());
        txtDireccion.setText(this.tarea.getDireccion());
        txtCif.setText(this.tarea.getCif());
        txtTelefono.setText(String.valueOf(this.tarea.getTelefono()));
        txtCp.setText(String.valueOf(this.tarea.getCp()));
        txtPoblacion.setText(this.tarea.getPoblacion());
        txtProvincia.setText(this.tarea.getProvincia());
        txtCorreo.setText(this.tarea.getEmail());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCif = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtCp = new javax.swing.JTextField();
        txtPoblacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MODIFICAR DE PROVEEDOR");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Dirección");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("CIF");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Teléfono");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Código Postal");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Población");

        txtNombre.setText("Nacho");

        txtDireccion.setText("Nacho");

        txtCif.setText("B12345678");

        txtTelefono.setText("123456789");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtCorreo.setText("asdfg@asdfg.es");

        txtCp.setText("12345");

        txtPoblacion.setText("Nacho");
        txtPoblacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPoblacionKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Provincia");

        txtProvincia.setText("Nacho");
        txtProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProvinciaKeyTyped(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 50, 5));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtCif, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                                    .addComponent(txtCp))
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel6)
                                                        .addGap(31, 31, 31)
                                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addGap(32, 32, 32)
                                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(22, 22, 22))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)))
                            .addGap(18, 18, 18)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                            .addGap(18, 18, 18)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        telefono(evt);
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtPoblacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPoblacionKeyTyped
        letras(evt);
    }//GEN-LAST:event_txtPoblacionKeyTyped

    private void txtProvinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProvinciaKeyTyped
        letras(evt);
    }//GEN-LAST:event_txtProvinciaKeyTyped

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        try {
            PpalProveedor menu = new PpalProveedor();
            menu.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(ModificarProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            guardar();
        } catch (Exception ex) {
            Logger.getLogger(ModificarProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCif;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCp;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
    
     private void telefono(KeyEvent evt) throws HeadlessException {
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede escribir números", "ERROR", 0);
            txtTelefono.setText("");
            

        } else if (txtTelefono.getText().length() > 9) {
            JOptionPane.showMessageDialog(this, "El número debe ser exactamente de 9 digitos", "ERROR", 0);
            txtTelefono.setText("");
        } 
    }

    public void letras(KeyEvent evt) throws HeadlessException {
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && !(c == KeyEvent.VK_SPACE) && !(c == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se puede escribir letras");
        }
    }

    private void cif() throws HeadlessException {

        String cif = txtCif.getText();
        String cifPattern = "([A-Z])(\\d{8})||(\\d{8})([A-Z])";
        Pattern patron = Pattern.compile(cifPattern);

        if (cif != null) {
            Matcher matcher = patron.matcher(cif);
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(this, "El cif no es correcto", "Error en cif", 0);
                txtCif.requestFocus();
            }
        }
    }
    
    private void codPostal() throws HeadlessException {
        String cp;
        Comprobar c = new Comprobar();
        // Guardar
        cp = c.comCp(txtCp.getText());
        if (cp.equals("-1")) {
            JOptionPane.showMessageDialog(this, "El númenor no tiene 5 dígitos", "ERROR", 0);
        } else if (cp.equals("-2")) {
            JOptionPane.showMessageDialog(this, "El campo cp contiene letras", "ERROR", 0);
        } else {
            System.out.println("CP Correcto");
        }

    }

    private void correo() throws HeadlessException {
        // Patron para que el Correo electronico sea bueno
        String emailPattern = "^[_a-z0-9-]+(\\.[_a-z0-9-]+)*@"
                + "[a-z0-9-]+(\\.[a-z0-9-]+)*(\\.[a-z]{2,4})$";

        Pattern patron = Pattern.compile(emailPattern);
        String email = txtCorreo.getText();

        if (email != null) {
            Matcher matcher = patron.matcher(email);
            if (!matcher.matches()) {
                JOptionPane.showMessageDialog(this, "El email no es correcto", "ERROR", 0);
            }
        }
    }
    
    private void guardar() throws Exception{
        
        String nombre, direccion, cif, email, poblacion, provincia;
        int id, telefono, cp;
        
        nombre = txtNombre.getText();
        direccion = txtDireccion.getText();
        cif = txtCif.getText();
        email = txtCorreo.getText();
        poblacion = txtPoblacion.getText();
        provincia = txtProvincia.getText();
        // id = Integer.parseInt(txtId.getText());
        telefono = Integer.parseInt(txtTelefono.getText());
        cp = Integer.parseInt(txtCp.getText());
        
        tarea.setNombre(nombre);
        tarea.setDireccion(direccion);
        tarea.setCif(cif);
        tarea.setEmail(email);
        tarea.setPoblacion(poblacion);
        tarea.setProvincia(provincia);
        // tarea.setId_proveedor(id);
        tarea.setTelefono(telefono);
        tarea.setCp(cp);
        
       try {
            int decision = JOptionPane.showConfirmDialog(null, "¿Está seguro/a que desea modificar este Proveedor?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (decision == 0) {
                try {
                    tareas_proveedor.modificar(tarea);
                    ModificarProveedor.this.dispose();
                    PpalProveedor vista = new PpalProveedor();
                    vista.setVisible(true);
                    vista.setLocationRelativeTo(null);

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                    JOptionPane.showMessageDialog(this, "Ha surgido un error y no se ha podido eliminar el registro.");
                }
            }
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se ha podido guardar el registro.");
        }
        
    }

}
