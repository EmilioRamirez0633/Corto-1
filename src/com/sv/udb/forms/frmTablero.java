/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Estudiante
 */
public class frmTablero extends javax.swing.JFrame {

    /**
     * Creates new form frmTablero
     */
    Timer timer;
    int cont;
    Random rn = new Random();
    Random rn2 = new Random();
    Random rn3 = new Random();
    int g1=0;
    int g2=0;
    int g3=0;
    public frmTablero() {
        initComponents();
        setLocationRelativeTo(null);
        timer = new Timer(500, new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                accionar();
            }
        });
        
        
    }
    private void accionar()
    {
        int answer = rn.nextInt(7) + 1;
        int answer2 = rn2.nextInt(7) + 1;
        int answer3 = rn3.nextInt(7) + 1;
         ImageIcon icon= null;
         ImageIcon icon2= null;
         ImageIcon icon3= null;
        switch ( answer ) {
      case 1:
            icon = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/cere.png"));
            g1=0;
           break;
      case 2:
           icon = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/cube.png"));
           g1=0;
           break;
      case 3:
          icon = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/heart.png"));
          g1=0;
           break;
      case 4:
           icon = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/monarchy.png"));
           g1=0;
           break;
      case 5:
           icon = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/po.png"));
           g1=0;
           break;
      case 6:
          icon = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/treb.png"));
          g1=0;
           break;
      case 7:
          icon = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/win.png"));
          g1=1;
           break;
      }
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblnumero1.getWidth(), lblnumero1.getHeight(), Image.SCALE_DEFAULT));
        lblnumero1.setText(null);              
        lblnumero1.setIcon( icono );
        
        //segundo ramdom
        
        switch ( answer2 ) {
      case 1:
            icon2 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/cere.png"));
            g2=0;
           break;
      case 2:
           icon2 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/cube.png"));
           g2=0;
           break;
      case 3:
          icon2 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/heart.png"));
          g2=0;
           break;
      case 4:
           icon2 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/monarchy.png"));
           g2=0;
           break;
      case 5:
           icon2 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/po.png"));
           g2=0;
           break;
      case 6:
          icon2 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/treb.png"));
          g2=0;
           break;
      case 7:
          icon2 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/win.png"));
          g2=1;
           break;
      }
        Icon icono2 = new ImageIcon(icon2.getImage().getScaledInstance(lblnumero2.getWidth(), lblnumero2.getHeight(), Image.SCALE_DEFAULT));
        lblnumero2.setText(null);              
        lblnumero2.setIcon( icono2 );
        
        //tercer ramdom
        
        switch ( answer3 ) {
      case 1:
            icon3 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/cere.png"));
            g3=0;
           break;
      case 2:
           icon3 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/cube.png"));
           g3=0;
           break;
      case 3:
          icon3 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/heart.png"));
          g3=0;
           break;
      case 4:
           icon3 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/monarchy.png"));
           g3=0;
           break;
      case 5:
           icon3 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/po.png"));
           g3=0;
           break;
      case 6:
          icon3 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/treb.png"));
          g3=0;
           break;
      case 7:
          icon3 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/win.png"));
          g3=1;
           break;
      }
        Icon icono3 = new ImageIcon(icon3.getImage().getScaledInstance(lblnumero3.getWidth(), lblnumero3.getHeight(), Image.SCALE_DEFAULT));
        lblnumero3.setText(null);              
        lblnumero3.setIcon( icono3 );
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblnumero2 = new javax.swing.JLabel();
        lblnumero3 = new javax.swing.JLabel();
        lblnumero1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmJuego"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDOS");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jButton1.setText("Inicar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jButton2.setText("Detener");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblnumero2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblnumero3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblnumero1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 2, 16)); // NOI18N
        jButton3.setText("Ganar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblnumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnumero3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
      

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        timer.start();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ganar()
    {
        if(this.g1==1 && this.g2==1 && this.g3==1)
       {
           JOptionPane.showMessageDialog(this, "Felicidades usted gano");
       }
       else
       {
            JOptionPane.showMessageDialog(this, "Intentelo nuevamente");
       }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       timer.stop();
       ganar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         timer.stop();
        ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("com/sv/udb/imagenes/win.png"));
        Icon icono3 = new ImageIcon(icon3.getImage().getScaledInstance(lblnumero3.getWidth(), lblnumero3.getHeight(), Image.SCALE_DEFAULT));
        lblnumero3.setText(null);    
        lblnumero2.setText(null);
        lblnumero1.setText(null);
        lblnumero3.setIcon( icono3 );
        lblnumero2.setIcon( icono3 );
        lblnumero1.setIcon( icono3 ); 
        g1=1;
        g2=1;
        g3=1;
        ganar();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTablero().setVisible(true);
            }
        });
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel lblnumero1;
    private javax.swing.JLabel lblnumero2;
    private javax.swing.JLabel lblnumero3;
    // End of variables declaration//GEN-END:variables
}
