/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanaPedido;

import Gestor.Conexion;
import clases.Cliente;
import clases.Pedido;
import clases.Proveedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sentencias.Tareas_pedidos;

/**
 *
 * @author Nacho
 */
public class InsertarPedido extends javax.swing.JFrame {

    private final Tareas_pedidos tareas_pedido = new Tareas_pedidos();
    private Pedido pedido;

    public InsertarPedido() {
        pedido = new Pedido();
        initComponents();
        this.setLocationRelativeTo(null);
        cmbCliente.setSelectedItem(pedido.getNombre_cli());
        cmbColor.setSelectedItem(pedido.getColor());
        cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdPedidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        cmbColor = new javax.swing.JComboBox<>();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnAnadir = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabModulo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Identificador pedido");

        jLabel6.setText("Elegir color");

        jLabel7.setText("Proveedor");

        txtProveedor.setText("Se marcará cuando elijamos el color");
        txtProveedor.setEnabled(false);

        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Cliente");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Insertar Pedidos");

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        jPanel4.add(btnAnadir);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAceptar);

        btnCancelar.setText("Cancelar");
        jPanel4.add(btnCancelar);

        tabModulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
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
        if (tabModulo.getColumnModel().getColumnCount() > 0) {
            tabModulo.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabModulo.getColumnModel().getColumn(2).setPreferredWidth(10);
            tabModulo.getColumnModel().getColumn(3).setPreferredWidth(10);
            tabModulo.getColumnModel().getColumn(4).setPreferredWidth(10);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbColor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21)
                                .addComponent(txtIdPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            guardar();
        } catch (Exception ex) {
            Logger.getLogger(InsertarPedido.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        AnadirModulo am = new AnadirModulo(this, true);
        am.setVisible(true);                     
    }//GEN-LAST:event_btnAnadirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbCliente;
    private javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabModulo;
    private javax.swing.JTextField txtIdPedidos;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables

    public void cargar() {
        // Eliminar todos los items del combo
        cmbCliente.removeAllItems();
        cmbColor.removeAllItems();
        // Añadir Un item vacío
        cmbCliente.addItem("");
        cmbColor.addItem("");

        // listas para guardar cada nombre        
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista1 = new ArrayList<>();

        lista = Tareas_pedidos.llenar_combo();
        for (int i = 0; i < lista.size(); i++) {
            cmbCliente.addItem(lista.get(i));
        }

        lista1 = Tareas_pedidos.llenar_combo_color();
        for (int i = 0; i < lista1.size(); i++) {
            cmbColor.addItem(lista1.get(i));
        }

    }

    private void guardar() throws Exception {

        PreparedStatement consultaPro = null, consultaCli = null;
        ResultSet rsPro = null, rsCli = null;

        List<Cliente> lista = new ArrayList<>();
        List<Proveedor> lista1 = new ArrayList<>();

        int id, cli = 0, pro = 0;
        String cliente, color, proveedor;

        id = Integer.parseInt(txtIdPedidos.getText());

        cliente = cmbCliente.getSelectedItem().toString();
        System.out.println(cliente);
        color = cmbColor.getSelectedItem().toString();
        System.out.println(color);
        proveedor = txtProveedor.getText();

        String sqlCliente = "Select id_cliente from cliente where nombre_cli = '" + cliente + "'";
        String sqlProveedor = "Select id_proveedor from proveedor where nombre_pro = '" + proveedor + "'";

        System.out.println(sqlCliente);
        
        try {
            consultaCli = Conexion.cnx.prepareStatement(sqlCliente);
            System.out.println(consultaCli);
            rsCli = consultaCli.executeQuery();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        while (rsCli.next()) {
            lista.add(new Cliente(rsCli.getInt("id_cliente")));
        }

        try {
            consultaPro = Conexion.cnx.prepareStatement(sqlProveedor);
            rsPro = consultaPro.executeQuery();

            pro = Integer.parseInt(String.valueOf(rsPro));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        while (rsPro.next()) {
            lista1.add(new Proveedor(rsPro.getInt("id_proveedor")));
        }

        System.out.println(id + " " + cli + " " + pro + " " + color);
        pedido = new Pedido(id, color, lista, lista1);

        tareas_pedido.darAlta(pedido);
        InsertarPedido.this.dispose();
        PpalPedido ppal = new PpalPedido();
        ppal.setVisible(true);
        ppal.setLocationRelativeTo(null);
    }

}
