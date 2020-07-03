/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.vista;

import ec.ups.edu.controlador.ControladorDirectorio;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Adolfo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorDirectorio controladorDirectorio;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        controladorDirectorio = new ControladorDirectorio();
    }

    public void llenarLista(List<String> directorio) {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();

        for (String nombre : directorio) {
            modelo.addElement(nombre);
        }
        lista.setModel(modelo);
    }

    public void limpiarLista() {
        DefaultListModel modelo = new DefaultListModel();
        modelo.clear();
        lista.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaInformacion = new javax.swing.JTextArea();
        btnMostrarInformacion = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnListarDirectoriosOcultos = new javax.swing.JButton();
        btnListarArchivosOcultos = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        btnListarDirectorios = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        crearDirectorio = new javax.swing.JMenuItem();
        eliminarDirectorio = new javax.swing.JMenuItem();
        renombrarDirectorio = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\t\t\tGestionar Directorios");

        lista.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(102, 102, 102), null));
        lista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        txtAreaInformacion.setEditable(false);
        txtAreaInformacion.setBackground(new java.awt.Color(153, 153, 153));
        txtAreaInformacion.setColumns(20);
        txtAreaInformacion.setLineWrap(true);
        txtAreaInformacion.setRows(5);
        jScrollPane2.setViewportView(txtAreaInformacion);

        btnMostrarInformacion.setBackground(new java.awt.Color(102, 102, 255));
        btnMostrarInformacion.setText("Mostrar Información");
        btnMostrarInformacion.setEnabled(false);
        btnMostrarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnMostrarInformacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnMostrarInformacion)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        btnListarDirectoriosOcultos.setBackground(new java.awt.Color(102, 102, 255));
        btnListarDirectoriosOcultos.setText("Listar Directorios Ocultos");
        btnListarDirectoriosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosOcultosActionPerformed(evt);
            }
        });

        btnListarArchivosOcultos.setBackground(new java.awt.Color(102, 102, 255));
        btnListarArchivosOcultos.setText("Listar Archivos Ocultos");
        btnListarArchivosOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarArchivosOcultosActionPerformed(evt);
            }
        });

        btnListarDirectorios.setBackground(new java.awt.Color(102, 102, 255));
        btnListarDirectorios.setText("Listar Directorios");
        btnListarDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarDirectoriosActionPerformed(evt);
            }
        });

        jLabel1.setText("Ruta:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnListarDirectorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnListarArchivosOcultos)
                        .addGap(75, 75, 75)
                        .addComponent(btnListarDirectoriosOcultos))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarDirectoriosOcultos)
                    .addComponent(btnListarArchivosOcultos)
                    .addComponent(btnListarDirectorios))
                .addGap(15, 15, 15))
        );

        jMenu1.setText("Gestionar Directorio");

        crearDirectorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        crearDirectorio.setText("Crear");
        crearDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearDirectorioActionPerformed(evt);
            }
        });
        jMenu1.add(crearDirectorio);

        eliminarDirectorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        eliminarDirectorio.setText("Eliminar");
        jMenu1.add(eliminarDirectorio);

        renombrarDirectorio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        renombrarDirectorio.setText("Renombrar");
        jMenu1.add(renombrarDirectorio);

        salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenu1.add(salir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void btnListarDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosActionPerformed
        // TODO add your handling code here:
        String ruta = txtRuta.getText();

        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "Llene el campo de ruta para buscar un directorio");
        } else {
            if (controladorDirectorio.comprobarRuta(ruta)) {
                List<String> directorios = controladorDirectorio.listarArchivos(ruta);
                if (directorios.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El directorio esta vacio");
                    limpiarLista();
                } else {
                    llenarLista(directorios);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ruta del directorio incorrecta");

            }

        }
    }//GEN-LAST:event_btnListarDirectoriosActionPerformed

    private void btnListarArchivosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarArchivosOcultosActionPerformed
        // TODO add your handling code here:
        String ruta = txtRuta.getText();

        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "Llene el campo de ruta para buscar los archivos ocultos");
        } else {
            if (controladorDirectorio.comprobarRuta(ruta)) {
                List<String> directorios = controladorDirectorio.listarArchivosOcultos(ruta);
                if (directorios.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No contiene archivos ocultos");
                    limpiarLista();
                } else {
                    llenarLista(directorios);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ruta del directorio incorrecta");

            }

        }
    }//GEN-LAST:event_btnListarArchivosOcultosActionPerformed

    private void btnListarDirectoriosOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarDirectoriosOcultosActionPerformed
        // TODO add your handling code here:
        String ruta = txtRuta.getText();

        if (ruta == null) {
            JOptionPane.showMessageDialog(this, "Llene el campo de ruta para buscar los directorios ocultos");
        } else {
            if (controladorDirectorio.comprobarRuta(ruta)) {
                List<String> directorios = controladorDirectorio.listarDirectoriosOcultos(ruta);
                if (directorios.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No contiene directorios ocultos");
                    limpiarLista();
                } else {
                    llenarLista(directorios);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ruta del directorio incorrecta");
            }

        }

    }//GEN-LAST:event_btnListarDirectoriosOcultosActionPerformed

    private void crearDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearDirectorioActionPerformed
        // TODO add your handling code here:
        String nuevo = null;

        nuevo = JOptionPane.showInputDialog("Escriba el nombre del nuevo directorio");
        if (nuevo == null) {
            JOptionPane.showMessageDialog(this, "Agregue un nombre al directorio");
        } else {
            System.out.println(nuevo);
            String ruta = txtRuta.getText();
            if (ruta == null) {
                JOptionPane.showMessageDialog(this, "Llene el campo de ruta para crear un nuevo directorio");
            } else {
                if (controladorDirectorio.comprobarRuta(ruta)) {

                }
            }
        }


    }//GEN-LAST:event_crearDirectorioActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        // TODO add your handling code here:
        String nombre = lista.getSelectedValue();
        btnMostrarInformacion.setEnabled(true);
        System.out.println(nombre);
    }//GEN-LAST:event_listaMouseClicked

    private void btnMostrarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInformacionActionPerformed
        // TODO add your handling code here:
        String nombre = lista.getSelectedValue();
        String ruta = txtRuta.getText();

        String informacion = controladorDirectorio.mostrarInformacion(nombre, ruta);
        txtAreaInformacion.setText(informacion);

    }//GEN-LAST:event_btnMostrarInformacionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarArchivosOcultos;
    private javax.swing.JButton btnListarDirectorios;
    private javax.swing.JButton btnListarDirectoriosOcultos;
    private javax.swing.JButton btnMostrarInformacion;
    private javax.swing.JMenuItem crearDirectorio;
    private javax.swing.JMenuItem eliminarDirectorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    private javax.swing.JMenuItem renombrarDirectorio;
    private javax.swing.JMenuItem salir;
    private javax.swing.JTextArea txtAreaInformacion;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
