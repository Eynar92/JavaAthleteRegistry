/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eynar
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        etiquetaEdad = new javax.swing.JLabel();
        cajaEdad = new javax.swing.JTextField();
        etiquetaPeso = new javax.swing.JLabel();
        cajaPeso = new javax.swing.JTextField();
        etiquetaEstatura = new javax.swing.JLabel();
        cajaEstatura = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        mostrarAtletas = new javax.swing.JMenuItem();
        menuSeparador = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        etiquetaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        etiquetaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Registro");

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaNombre.setText("Nombre:");

        cajaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaEdad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaEdad.setText("Edad:");

        etiquetaPeso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaPeso.setText("Peso [kg]:");

        etiquetaEstatura.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaEstatura.setText("Estatura [cm]:");

        botonRegistrar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonRegistrar.setText("Registrar Atleta");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(222, 222, 222))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaEdad, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaPeso, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaEstatura, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cajaNombre)
                    .addComponent(cajaEdad)
                    .addComponent(cajaPeso)
                    .addComponent(cajaEstatura, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(etiquetaTitulo)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaNombre))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEdad))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cajaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPeso))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cajaEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEstatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(botonRegistrar)
                .addGap(50, 50, 50))
        );

        menu.setText("Menú");
        menu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        mostrarAtletas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        mostrarAtletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atleta.png"))); // NOI18N
        mostrarAtletas.setText("Mostrar atletas registrados");
        mostrarAtletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarAtletasActionPerformed(evt);
            }
        });
        menu.add(mostrarAtletas);
        menu.add(menuSeparador);

        salir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        menu.add(salir);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        String nombre;
        int edad, estatura;
        double peso;
        
        nombre = cajaNombre.getText();
        edad = Integer.parseInt(cajaEdad.getText());
        peso = Double.parseDouble(cajaPeso.getText());
        estatura = Integer.parseInt(cajaEstatura.getText());
        
        Atleta atleta = new Atleta(nombre, edad, peso, estatura);
        
        escribirBinario(atleta);
        
        cajaNombre.setText("");
        cajaEdad.setText("");
        cajaPeso.setText("");
        cajaEstatura.setText("");
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void mostrarAtletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarAtletasActionPerformed
        VentanaAtletasRegistrados ventanaAR = new VentanaAtletasRegistrados(this, true);
        ventanaAR.setVisible(true);
    }//GEN-LAST:event_mostrarAtletasActionPerformed
    
    private void escribirBinario(Atleta atleta) {
        try {
            FileOutputStream archivo = new FileOutputStream("registroAtletas.bin", true);
            AñadirBinario escribir = new AñadirBinario(archivo);
            
            escribir.writeObject(atleta);
            escribir.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Error " + ex);
        } catch (IOException ex) {
            System.err.println("Error " + ex);
        }
    }
    
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
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaEstatura;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaPeso;
    private javax.swing.JLabel etiquetaEdad;
    private javax.swing.JLabel etiquetaEstatura;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeso;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menu;
    private javax.swing.JPopupMenu.Separator menuSeparador;
    private javax.swing.JMenuItem mostrarAtletas;
    private javax.swing.JMenuItem salir;
    // End of variables declaration//GEN-END:variables
}
