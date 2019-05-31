package ventanaPedido;

import clases.Modulo;
import clases.Pedido;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        // dtm = (DefaultTableModel) tabModulo.getModel();
        cargar_lista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabModulo = new javax.swing.JTable();
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
        jLabel1 = new javax.swing.JLabel();
        cmbModulo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnCSV = new javax.swing.JButton();
        InsertarTabla = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabModulo1 = new javax.swing.JTable();

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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Módulo");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel1);

        cmbModulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Armario", "Puente", "Galeria", "Cama", "Cabecero", "Arcón", "Mesilla", "Sinfonier", "Comodas", "Buk", "Complementos Estudio", "Estanteria", "Encimera" }));
        jPanel2.add(cmbModulo);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 30, 0));

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

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel4.add(btnAceptar);

        btnAnadir.setText("Añadir");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });
        jPanel4.add(btnAnadir);

        tabModulo1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabModulo1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
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
        anadir();
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void anadir() throws NumberFormatException {
        try {
            int alto, ancho, fondo, id;
            Object[] datos = new Object[5];
            String tipo = cmbModulo.getSelectedItem().toString();
            id = tareas_modulo.recuperarid();
            alto = Integer.parseInt(txtAlto.getText());
            ancho = Integer.parseInt(txtAncho.getText());
            fondo = Integer.parseInt(txtFondo.getText());
            modulo = new Modulo(tipo, ancho, alto, fondo);
            tareas_modulo.darAlta(modulo);
            datos[0] = id;
            datos[1] = tipo;
            datos[2] = ancho;
            datos[3] = alto;
            datos[4] = fondo;
            dtm.addRow(datos);
            InsertarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(AnadirModulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void InsertarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarTablaActionPerformed
        InsertarTabla();
        //Pruebas.FicheroCNC.ficheroCostado();

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertarTabla;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCSV;
    private javax.swing.JComboBox<String> cmbModulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabModulo;
    private javax.swing.JTable tabModulo1;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFondo;
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

    private void InsertarTabla() throws NumberFormatException {
        final int GRUESO = 19;
        final int CORNISA = 30;
        final int ZOCALO = 30;
        final int HOLGURA = 3;
        final int GRUESO10 = 10;

        //int cont = lista.size();
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

        tareas_despiece.insertarCostado(altoCostado, fondoCostado, GRUESO, cantidad * 2);
//        cont++;
        lista.add(1);

        tareas_despiece.insertarAparador(anchoAparador, fondoCostado, GRUESO, cantidad * 4);
//        cont++;
        lista.add(1);

        tareas_despiece.insertarTrasera(altoPuerta, anchoPuerta, GRUESO10, cantidad);
//        cont++;
        lista.add(1);

        tareas_despiece.insertarZocalo(anchoAparador, 100, ZOCALO, cantidad * 2);
//        cont++;
        lista.add(1);

        if (ancho < 600) {
            tareas_despiece.insertarPuerta(altoPuerta, anchoPuerta, GRUESO, cantidad);
//            cont++;
            lista.add(1);
        } else {
            tareas_despiece.insertarPuerta(altoPuerta, anchoPuerta, GRUESO, cantidad * 2);
//            cont++;
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
