/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import javax.swing.JFrame;
import modelo.Reserva;

/**
 *
 * @author nico_
 */
public class Formulario extends javax.swing.JDialog {
        //declaramos el padre para poder despues abrir otro dialogo de este
        java.awt.Frame padre;
    /**
     * Creates new form Formulario
     */
    public Formulario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //almacenamos el padre para poder despues abrir otro dialogo de este
        padre = parent;       
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoTipoCocina = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tipoEvento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        numeroAsistentes = new javax.swing.JTextField();
        etiquetaJornadas = new javax.swing.JLabel();
        numeroJornadas = new javax.swing.JTextField();
        habitaciones = new javax.swing.JCheckBox();
        general = new javax.swing.JRadioButton();
        veganos = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        vegetarianos = new javax.swing.JRadioButton();
        celiacos = new javax.swing.JRadioButton();
        enviar = new javax.swing.JButton();

        grupoTipoCocina.add(general);
        grupoTipoCocina.add(celiacos);
        grupoTipoCocina.add(vegetarianos);
        grupoTipoCocina.add(veganos);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario de reservas");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos personales"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Teléfono:");

        nombre.setToolTipText("Nombre completo");

        apellidos.setToolTipText("Dos primeros apellidos");
        apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidosActionPerformed(evt);
            }
        });

        telefono.setToolTipText("Telefono móvil");
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Reserva"));

        jLabel6.setText("Fecha:");

        fecha.setForeground(new java.awt.Color(153, 153, 153));
        fecha.setText("DD/MM/YYYY");
        fecha.setToolTipText("Fecha del evento");

        jLabel7.setText("Tipo:");

        tipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presentacion", "Jornada", "Congreso" }));
        tipoEvento.setToolTipText("Tipo de evento");
        tipoEvento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoEventoItemStateChanged(evt);
            }
        });
        tipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoEventoActionPerformed(evt);
            }
        });

        jLabel8.setText("Nº de asistentes:");

        numeroAsistentes.setToolTipText("¿Cuantas personas asistirán?");

        etiquetaJornadas.setText("Nº jornadas");
        etiquetaJornadas.setEnabled(false);

        numeroJornadas.setToolTipText("Numero de jornadas que durara el evento");
        numeroJornadas.setEnabled(false);

        habitaciones.setText("Necesitamos habitaciones");
        habitaciones.setToolTipText("¿Los asistentes del evento necesitaran habitaciones?");
        habitaciones.setEnabled(false);
        habitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habitacionesActionPerformed(evt);
            }
        });

        general.setText("General");

        veganos.setText("Apta para veganos");

        jLabel9.setText("Tipo de cocina:");

        vegetarianos.setText("Apta para vegetarianos");

        celiacos.setText("Apta para celiacos");
        celiacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celiacosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(habitaciones)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(fecha))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(numeroAsistentes))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etiquetaJornadas))
                            .addGap(2, 2, 2)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(numeroJornadas))
                                .addComponent(tipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(general)
                    .addComponent(veganos)
                    .addComponent(celiacos)
                    .addComponent(vegetarianos)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(general)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celiacos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vegetarianos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veganos)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(numeroAsistentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaJornadas)
                            .addComponent(numeroJornadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(habitaciones)
                        .addGap(41, 41, 41))))
        );

        enviar.setText("Enviar Formulario");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(enviar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enviar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidosActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void celiacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celiacosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celiacosActionPerformed

    private void habitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habitacionesActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here: 
        try{                   
            String tipoCocina = "";       
            if (general.isSelected()){
                tipoCocina = "general";
            } else if (celiacos.isSelected()){
                tipoCocina = "celiacos";
            }else if (vegetarianos.isSelected()){
                tipoCocina = "vegetarianos";
            }else if (veganos.isSelected()){
                tipoCocina = "veganos";
            }
            
            Reserva datos = new Reserva(nombre.getText(), apellidos.getText(), telefono.getText(), fecha.getText(),
                    Integer.parseInt(numeroAsistentes.getText()), tipoEvento.getSelectedItem().toString(), tipoCocina);
            if (numeroJornadas.isEnabled()){
                datos.setNumeroJornadas(Integer.parseInt(numeroJornadas.getText()));               
            }
            if(habitaciones.isSelected()){
                datos.setHabitaciones(true);
            }else{
                datos.setHabitaciones(false);
            }
            //abrimos otro dialogo mostrando la informacion introducida
            Resumen resumen = new Resumen(padre,true);
            resumen.setLocationRelativeTo(null);
            resumen.setVisible(true);
        }catch(NumberFormatException e){
            
        }
        
    }//GEN-LAST:event_enviarActionPerformed

    private void tipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoEventoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tipoEventoActionPerformed

    private void tipoEventoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoEventoItemStateChanged
        // TODO add your handling code here:
        //si se selecciona concreso habilitaremos los tres campos
        if (tipoEvento.getSelectedItem() == "Congreso"){        
            etiquetaJornadas.setEnabled(true);
            numeroJornadas.setEnabled(true);
            habitaciones.setEnabled(true);  
        }else{// si se selecciona cualquier otro borraremos los valores de los campos y los deshabilitaremos
            etiquetaJornadas.setEnabled(false);
            numeroJornadas.setText("");
            numeroJornadas.setEnabled(false);
            habitaciones.setSelected(false);
            habitaciones.setEnabled(false);
        }
    }//GEN-LAST:event_tipoEventoItemStateChanged

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Formulario dialog = new Formulario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidos;
    private javax.swing.JRadioButton celiacos;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel etiquetaJornadas;
    private javax.swing.JTextField fecha;
    private javax.swing.JRadioButton general;
    private javax.swing.ButtonGroup grupoTipoCocina;
    private javax.swing.JCheckBox habitaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numeroAsistentes;
    private javax.swing.JTextField numeroJornadas;
    private javax.swing.JTextField telefono;
    private javax.swing.JComboBox<String> tipoEvento;
    private javax.swing.JRadioButton veganos;
    private javax.swing.JRadioButton vegetarianos;
    // End of variables declaration//GEN-END:variables
}
