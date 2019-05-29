package ventanaPedido;

import clases.Modulo;
import clases.Pedido;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sentencias.Tareas_despiece;
import sentencias.Tareas_modulo;
import sentencias.Tareas_pedidos;

/**
 *
 * @author Nacho
 */
public class AnadirModulo extends javax.swing.JDialog {

    private final Tareas_modulo tareas_modulo = new Tareas_modulo();
    private final Tareas_despiece tareas_despiece = new Tareas_despiece();
    private Modulo modulo;
    private List<Modulo> tareas;
    private Pedido pedido;
    private List<Integer> lista = new ArrayList<>();

    DefaultTableModel dtm;

    public AnadirModulo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
//        cmbCliente.setSelectedItem(pedido.getNombre_cli());
//        cmbColor.setSelectedItem(pedido.getColor());
//        cargar();
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
        btnCSV = new javax.swing.JButton();
        InsertarTabla = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabModulo = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cmbCliente = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbColor = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtIdPedidos = new javax.swing.JTextField();

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
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAceptar);

        btnCSV.setText("Crear CSV");
        btnCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCSVActionPerformed(evt);
            }
        });
        jPanel4.add(btnCSV);

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

        jLabel8.setText("Cliente");

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("Elegir color");

        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Identificador pedido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(21, 21, 21)
                            .addComponent(txtIdPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cmbColor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        InsertarTabla();
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void InsertarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarTablaActionPerformed
         Pruebas.FicheroCNC.ficheroCostado();
    }//GEN-LAST:event_InsertarTablaActionPerformed


    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // tareas_despiece.eliminar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCSVActionPerformed
        Pruebas.FicheroCSV.ficheroCSV();
    }//GEN-LAST:event_btnCSVActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        tareas_despiece.eliminar();
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteActionPerformed
        
    }//GEN-LAST:event_cmbClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertarTabla;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCSV;
    public static javax.swing.JComboBox<String> cmbCliente;
    public static javax.swing.JComboBox<String> cmbColor;
    private javax.swing.JComboBox<String> cmbModulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField txtIdPedidos;
    // End of variables declaration//GEN-END:variables

    // Para no poder introducir más que números
    private void alto(KeyEvent evt) throws HeadlessException {
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede escribir números (alto)", "ERROR", 0);
            txtAlto.setText("");
            txtAlto.requestFocus();
        }
    }
    
    // Para no poder introducir más que números
    private void ancho(KeyEvent evt) throws HeadlessException {
        char c = evt.getKeyChar();
        if (Character.isAlphabetic(c)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puede escribir números(ancho)", "ERROR", 0);
            txtAncho.setText("");
            txtAncho.requestFocus();
        }
    }

    // Para no poder introducir más que números
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
            // recuperar las que ya tiene la BBDD
            tareas = tareas_modulo.recuperarTodas();
            DefaultTableModel dtm = (DefaultTableModel) tabModulo.getModel();
            dtm.setRowCount(0);
            
            // mostrar en el JTable los módulos añadidos
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

    private void InsertarTabla() throws NumberFormatException {
        final int GRUESO = 19;
        final int CORNISA = 30;
        final int ZOCALO = 30;
        final int HOLGURA = 3;
        final int GRUESO10 = 10;

        int cont = lista.size();
        System.out.println(lista.size());

        int altoCostado, fondoCostado, anchoAparador, anchoPuerta, altoPuerta, altoTrasera, anchoTrasera;
        int alto, fondo, ancho, cantidad;

        alto = Integer.parseInt(txtAlto.getText());
        fondo = Integer.parseInt(txtFondo.getText());
        ancho = Integer.parseInt(txtAncho.getText());
        cantidad = Integer.parseInt(txtCantidad.getText());
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
        
        tareas_despiece.insertarCostado(cont, altoCostado, fondoCostado, GRUESO, cantidad * 2);
        cont++;
        lista.add(1);
        
        tareas_despiece.insertarAparador(cont, anchoAparador, fondoCostado, GRUESO, cantidad * 4);
        cont++;
        lista.add(1);
        
        tareas_despiece.insertarTrasera(cont, altoPuerta, anchoPuerta, GRUESO10, cantidad);
        cont++;
        lista.add(1);
        
        tareas_despiece.insertarZocalo(cont, anchoAparador, 100, ZOCALO, cantidad * 2);
        cont++;
        lista.add(1);
        
        if (ancho < 600) {
            tareas_despiece.insertarPuerta(cont, altoPuerta, anchoPuerta, GRUESO, cantidad);
            cont++;
            lista.add(1);
        } else {
            tareas_despiece.insertarPuerta(cont, altoPuerta, anchoPuerta, GRUESO, cantidad * 2);
            cont++;
            lista.add(1);
        }
        System.out.println(lista.size());
    }
    
    //    private void fichero() {
//        PreparedStatement consulta = null;
//        ResultSet resultado = null;
//
//        // select para sumar las cantidades, agruparlas y ordenar por costado
//        String sql_ordenar = "SELECT sum(cantidad) as cantidad, pieza, alto, ancho, grueso "
//                + "FROM despiece "
//                + "group by pieza, alto, ancho, grueso "
//                + "ORDER by pieza='costado' DESC";
//        try {
//            consulta = Conexion.cnx.prepareStatement(sql_ordenar);
//            resultado = consulta.executeQuery();
//
//        } catch (SQLException ex) {
//            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            // ruto donde se creará el archivo
//            String ruta = "C:\\Users\\Nacho\\Desktop\\DAM2\\Tutoria\\Proyecto\\ProyectoFPS\\fichero.txt";
//            FileWriter fichero = new FileWriter(new File(ruta));
//            // File fichero = new File(ruta);
//            BufferedWriter bw;
//
//            // bw = new BufferedWriter(new FileWriter(fichero));
//            fichero.write("Despiece\n\r\n\r");
//            String datos = "";
//            String separador = ";";
//
//            // sacar uno a uno de cada tupla y campo
//            while (resultado.next()) {
//                datos = "\n\r";
//                datos += resultado.getInt("cantidad");
//                datos += separador;
//                datos += resultado.getString("pieza");
//                datos += separador;
//                datos += resultado.getInt("alto");
//                datos += separador;
//                datos += resultado.getInt("ancho");
//                datos += separador;
//                datos += resultado.getInt("grueso");
//                datos += "\n\r";
//                fichero.write(datos);
//            }
//            fichero.close();
//        } catch (IOException ex) {
//            System.out.println("ERROR en el fichero");
//        } catch (SQLException ex) {
//            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
    

}
