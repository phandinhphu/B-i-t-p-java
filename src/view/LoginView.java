/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class LoginView extends javax.swing.JFrame {

      /**
       * Creates new form LoginView
       */
      public LoginView() {
            initComponents();
      }

      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jTextField_UserName = new javax.swing.JTextField();
            jPasswordField_Password = new javax.swing.JPasswordField();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jButton_Cancel = new javax.swing.JButton();
            jButton_Login = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);
            addWindowListener(new java.awt.event.WindowAdapter() {
                  public void windowOpened(java.awt.event.WindowEvent evt) {
                        formWindowOpened(evt);
                  }
            });

            jPanel1.setBackground(new java.awt.Color(250, 250, 250));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230), 2));
            jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jPanel1MouseDragged(evt);
                  }
            });
            jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        jPanel1MousePressed(evt);
                  }
            });
            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Royal Cafe");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 40));

            jTextField_UserName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            jPanel1.add(jTextField_UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 270, 30));

            jPasswordField_Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
            jPanel1.add(jPasswordField_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 240, 30));

            jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel2.setText("Password");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 70, 30));

            jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
            jLabel3.setText("Username");
            jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, 30));

            jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invisible.png"))); // NOI18N
            jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel4MouseClicked(evt);
                  }
            });
            jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 20, 30));

            jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visible.png"))); // NOI18N
            jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel5MouseClicked(evt);
                  }
            });
            jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 20, 30));

            jButton_Cancel.setBackground(new java.awt.Color(255, 0, 0));
            jButton_Cancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            jButton_Cancel.setText("Cancel");
            jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton_CancelActionPerformed(evt);
                  }
            });
            jPanel1.add(jButton_Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 90, 30));

            jButton_Login.setBackground(new java.awt.Color(51, 255, 255));
            jButton_Login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
            jButton_Login.setText("Login");
            jButton_Login.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton_LoginActionPerformed(evt);
                  }
            });
            jPanel1.add(jButton_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, 30));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
          // TODO add your handling code here:
          System.exit(0);
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
          // TODO add your handling code here:
          if (isEmpty()) {
                String userName = jTextField_UserName.getText();
                String password = String.valueOf(jPasswordField_Password.getPassword());
                if (userName.equals("quocnaru") && password.equals("582004phu")) {
                      CafeView cafeView = new CafeView();
                      cafeView.setVisible(true);
                      cafeView.pack();
                      this.dispose();
                } else {
                      JOptionPane.showMessageDialog(null, "Invale username or password", "Warning", 2);
                }
          }
    }//GEN-LAST:event_jButton_LoginActionPerformed

      int xx, xy;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
          // TODO add your handling code here:
          int X = evt.getXOnScreen();
          int Y = evt.getYOnScreen();
          this.setLocation(X - xx, Y - xy);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
          // TODO add your handling code here:
          xx = evt.getX();
          xy = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          // TODO add your handling code here:
          for (double i = 0.0; i <= 1.0; i += 0.1) {
                String s = i + "";
                float f = Float.valueOf(s);
                this.setOpacity(f);
                try {
                      Thread.sleep(40);
                } catch (InterruptedException ex) {
                      Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
                }
          }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
          // TODO add your handling code here:
          jPasswordField_Password.setEchoChar((char) 0);
          jLabel4.setVisible(false);
          jLabel5.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
          // TODO add your handling code here:
          jPasswordField_Password.setEchoChar('*');
          jLabel4.setVisible(true);
          jLabel5.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

      public boolean isEmpty() {
            if (jTextField_UserName.getText().isEmpty()) {
                  JOptionPane.showMessageDialog(null, "Username is missing", "Warning", 2);
                  return false;
            }
            if (String.valueOf(jPasswordField_Password.getPassword()).isEmpty()) {
                  JOptionPane.showMessageDialog(null, "Password is missing", "Warning", 2);
                  return false;
            }
            return true;
      }

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
                  java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new LoginView().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jButton_Cancel;
      private javax.swing.JButton jButton_Login;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPasswordField jPasswordField_Password;
      private javax.swing.JTextField jTextField_UserName;
      // End of variables declaration//GEN-END:variables
}
