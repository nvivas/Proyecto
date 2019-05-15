/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaPedido;

import Gestor.Conexion;
import clases.Armario;
import clases.Modulo;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sentencias.Tareas_despiece;
import sentencias.Tareas_modulo;

/**
 *
 * @author Nacho
 */
public class AnadirModulo extends javax.swing.JDialog {

    private final Tareas_modulo tareas_modulo = new Tareas_modulo();
    private final Tareas_despiece tareas_despiece = new Tareas_despiece();
    private Modulo modulo;
    private List<Modulo> tareas;

    DefaultTableModel dtm;

    public AnadirModulo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        dtm = (DefaultTableModel) tabModulo.getModel();
        cargar_lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtAncho = new javax.swing.JTextField();
        txtAlto = new javax.swing.JTextField();
        txtFondo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cmbModulo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnAnadir = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        InsertarTabla = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabModulo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("AÑADIR MÓDULO");

        jPanel1.setLayout(new java.awt.GridLayout(2, 0, 20, 0));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ancho");
        jPanel1.add(jLabel3);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Alto");
        jPanel1.add(jLabel4);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fondo");
        jPanel1.add(jLabel5);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cantidad");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel7);

        txtAncho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAncho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnchoKeyTyped(evt);
            }
        });
        jPanel1.add(txtAncho);

        txtAlto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAlto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAltoKeyTyped(evt);
            }
        });
        jPanel1.add(txtAlto);

        txtFondo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFondoKeyTyped(evt);
            }
        });
        jPanel1.add(txtFondo);
        jPanel1.add(txtCantidad);

        jPanel2.setLayout(new java.awt.GridLayout(2, 0, 0, 10));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Id modulo");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel6);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Módulo");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel1);
        jPanel2.add(txtId);

        cmbModulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armario", "Puente", "Galeria", "Cama", "Cabecero", "Arcón", "Mesilla", "Sinfonier", "Comodas", "Buk", "Complementos Estudio", "Estanteria", "Encimera" }));
        jPanel2.add(cmbModulo);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        jPanel4.add(btnAnadir);

        btnAceptar.setText("Aceptar");
        jPanel4.add(btnAceptar);

        btnCancelar.setText("Cancelar");
        jPanel4.add(btnCancelar);

        InsertarTabla.setText("Insertar en Tabla Despiece");
        InsertarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarTablaActionPerformed(evt);
            }
        });
        jPanel4.add(InsertarTabla);

        btnBorrar.setText("Borrar tabla");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel4.add(btnBorrar);

        tabModulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_modulo", "tipo", "ancho", "alto", "fondo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabModulo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAnchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnchoKeyTyped
        ancho(evt);
    }//GEN-LAST:event_txtAnchoKeyTyped

    private void txtAltoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAltoKeyTyped
        alto(evt);
    }//GEN-LAST:event_txtAltoKeyTyped

    private void txtFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFondoKeyTyped
        fondo(evt);
    }//GEN-LAST:event_txtFondoKeyTyped

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed

        int alto, ancho, fondo, id;
        Object[] datos = new Object[5];
        String tipo = cmbModulo.getSelectedItem().toString();

        id = Integer.parseInt(txtId.getText());
        alto = Integer.parseInt(txtAlto.getText());
        ancho = Integer.parseInt(txtAncho.getText());
        fondo = Integer.parseInt(txtFondo.getText());

        modulo = new Modulo(id, tipo, ancho, alto, fondo);
        tareas_modulo.darAlta(modulo);

        datos[0] = id;
        datos[1] = tipo;
        datos[2] = ancho;
        datos[3] = alto;
        datos[4] = fondo;

        dtm.addRow(datos);

    }//GEN-LAST:event_btnAnadirActionPerformed

    private void InsertarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarTablaActionPerformed
        final int GRUESO = 19;
        final int CORNISA = 30;
        final int ZOCALO = 30;
        final int HOLGURA = 3;
        final int GRUESO10 = 10;
        
        
        int altoCostado, fondoCostado, anchoAparador, anchoPuerta, altoPuerta, altoTrasera, anchoTrasera;
        int cont = 1, alto, fondo, ancho;

        alto = Integer.parseInt(txtAlto.getText());
        fondo = Integer.parseInt(txtFondo.getText());
        ancho = Integer.parseInt(txtAncho.getText());

        altoCostado = alto - CORNISA;
        fondoCostado = fondo - GRUESO;
        anchoAparador = ancho - GRUESO - GRUESO;

        altoTrasera = alto - ZOCALO - CORNISA;
        anchoTrasera = ancho - 11;
        
        
        if (ancho < 600) {
            anchoPuerta = ancho - HOLGURA;
        } else {
            anchoPuerta = (ancho - HOLGURA * 2) / 2;
        }

        altoPuerta = altoCostado - ZOCALO - HOLGURA * 2;

        while (cont <= 2) {
            tareas_despiece.insertarCostado(cont, altoCostado, fondoCostado, GRUESO);
            cont++;
        }

        while (cont <= 6) {
            tareas_despiece.insertarAparador(cont, anchoAparador, fondoCostado, GRUESO);
            cont++;
        }
               
        
        while(cont <= 7){
            tareas_despiece.insertarTrasera(cont, altoPuerta, anchoPuerta, GRUESO10);
            cont++;
        }
         
        while(cont <= 9){
            tareas_despiece.insertarZocalo(cont, anchoAparador, 100, ZOCALO);
            cont++;
        }
        
        
        if (ancho < 600) {
            while (cont <= 10) {
                tareas_despiece.insertarPuerta(cont, altoPuerta, anchoPuerta, GRUESO);
                cont++;
            }
        } else {
            while (cont <= 11) {
                tareas_despiece.insertarPuerta(cont, altoPuerta, anchoPuerta, GRUESO);
                cont++;
            }
        }
        
        


    }//GEN-LAST:event_InsertarTablaActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        tareas_despiece.eliminar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertarTabla;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbModulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabModulo;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFondo;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables

    private void alto(KeyEvent evt) throws HeadlessException {
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede escribir números (alto)", "ERROR", 0);
            txtAlto.setText("");
            txtAlto.requestFocus();
        }
    }

    private void ancho(KeyEvent evt) throws HeadlessException {
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede escribir números(ancho)", "ERROR", 0);
            txtAncho.setText("");
            txtAncho.requestFocus();
        }
    }

    private void fondo(KeyEvent evt) throws HeadlessException {
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede escribir números(grueso)", "ERROR", 0);
            txtFondo.setText("");
            txtFondo.requestFocus();
        }
    }

    private void cargar_lista() {
        try {
            tareas = tareas_modulo.recuperarTodas();
            DefaultTableModel dtm = (DefaultTableModel) tabModulo.getModel();
            dtm.setRowCount(0);

            for (int i = 0; i < tareas.size(); i++) {

                dtm.addRow(new Object[]{
                    tareas.get(i).getId_modulo(),
                    tareas.get(i).getTipo(),
                    tareas.get(i).getAncho(),
                    tareas.get(i).getAlto(),
                    tareas.get(i).getFondo()
                });

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se han podido recuperar los registros");
        }

    }

}
