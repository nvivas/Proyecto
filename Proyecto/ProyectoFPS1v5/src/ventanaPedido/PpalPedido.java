/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaPedido;

import GUI.MenuPpal;
import clases.Armario;
import clases.Cliente;
import clases.Pedido;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sentencias.Tareas_pedidos;

/**
 *
 * @author Nacho
 */
public class PpalPedido extends javax.swing.JFrame {

    private final Tareas_pedidos tareas_pedidos = new Tareas_pedidos();
    private Pedido pedido_tarea;
    private Cliente cliente;
    private List<Pedido> tareas;

    public PpalPedido() {
        pedido_tarea = new Pedido();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Pantalla Principal de Pedidos");
       
        cargar_lista();
    }
    
    public PpalPedido(Pedido pedido){
        pedido_tarea = pedido;
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabPedido = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnAnadir = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pedido", "Cliente", "Proveedor", "Color"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabPedido);
        if (tabPedido.getColumnModel().getColumnCount() > 0) {
            tabPedido.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 30, 5));

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnadir);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar);

        btnVer.setText("Ver");
        jPanel1.add(btnVer);

        btnBuscar.setText("Buscar...");
        jPanel1.add(btnBuscar);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEDIDOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
//        AnadirModulo am = new AnadirModulo(this, true);
//        am.setVisible(true);
        InsertarPedido menu = new InsertarPedido();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPpal menu = new MenuPpal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        eliminar();
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabPedido;
    // End of variables declaration//GEN-END:variables

    private void modificar() throws HeadlessException {
        int fila_seleccionada = tabPedido.getSelectedRow();
        if (fila_seleccionada < 0) {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila.");
        }
    }

    private void eliminar() throws HeadlessException {
        int fila_seleccionada = tabPedido.getSelectedRow();
        if (fila_seleccionada >= 0) {
            int decision = JOptionPane.showConfirmDialog(null, "¿Está seguro/a que desea eliminar este Cliente?", "Advertencia", JOptionPane.YES_NO_OPTION);
            if (decision == 0) {
                this.tareas_pedidos.eliminar(this.tareas.get(fila_seleccionada));
                this.cargar_lista();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila.");
        }
    }

    private void cargar_lista() {

        try {
            tareas = tareas_pedidos.recuperarTodas();
            DefaultTableModel dtm = (DefaultTableModel) tabPedido.getModel();
            dtm.setRowCount(0);

            for (int i = 0; i < tareas.size(); i++) {
                dtm.addRow(new Object[]{
                    tareas.get(i).getId_pedido(),
                    tareas.get(i).getNombre_cli(),
                    tareas.get(i).getNombre_pro()
                });
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se han podido recuperar los registros");
        }

    }

}
