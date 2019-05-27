package ventanaCliente;

import GUI.MenuPpal;
import clases.Cliente;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sentencias.Tareas_cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nacho
 */
public class PpalCliente extends javax.swing.JFrame {

    private final Tareas_cliente tareas_cliente = new Tareas_cliente();
    private List<Cliente> tareas;
    
    public PpalCliente() throws SQLException, Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Pantalla Principal de Cliente");
        cargar_lista();
    }
    
    private void cargar_lista() {
        try {
            tareas = tareas_cliente.recuperarTodas();
            DefaultTableModel dtm = (DefaultTableModel) tabClientes.getModel();
            dtm.setRowCount(0);

            for (int i = 0; i < tareas.size(); i++) {

                dtm.addRow(new Object[]{
                    tareas.get(i).getId_cliente(),
                    tareas.get(i).getNombre(),
                    tareas.get(i).getDireccion(),
                    tareas.get(i).getCif(),
                    tareas.get(i).getTelefono(),
                    tareas.get(i).getCp(),
                    tareas.get(i).getPoblacion(),
                    tareas.get(i).getProvincia(),
                    tareas.get(i).getEmail()

                });

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se han podido recuperar los registros");
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE CLIENTE");

        tabClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Direccion", "CIF", "Telefono", "Codigo Postal", "Poblacion", "Provincia", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabClientes);
        if (tabClientes.getColumnModel().getColumnCount() > 0) {
            tabClientes.getColumnModel().getColumn(0).setResizable(false);
            tabClientes.getColumnModel().getColumn(0).setPreferredWidth(3);
            tabClientes.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 100, 5));

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsertar);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar);

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPpal menu = new MenuPpal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        InsertarCliente ic = new InsertarCliente();
        ic.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabClientes;
    // End of variables declaration//GEN-END:variables

    private void modificar() throws HeadlessException {
        int fila_seleccionada = tabClientes.getSelectedRow();
        if (fila_seleccionada >= 0) {
            ModificarCliente vista = new ModificarCliente(tareas.get(fila_seleccionada));
            vista.setVisible(true);
            vista.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila.");
        }
    }
    
    private void eliminar() throws HeadlessException {
        int fila_seleccionada = tabClientes.getSelectedRow();
        if (fila_seleccionada >= 0) {
            int decision = JOptionPane.showConfirmDialog(null, "¿Está seguro/a que desea eliminar este Cliente?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (decision == 0) {
                this.tareas_cliente.eliminar(this.tareas.get(fila_seleccionada));
                this.cargar_lista();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila.");
        }
    }


}
