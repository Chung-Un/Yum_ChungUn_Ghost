/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author chung
 */

import java.util.HashSet;
import javax.swing.*;

public class loginMenu extends javax.swing.JFrame {

String[][] usuariosInfo = {{"chungun23","pollochuco24","mellzx","juanCarlos","spookyscaryskeleton","ghostmaster",},
                                    {"mcr4ever","pollochu","gatos001","perry123","hallowee","soymejor",}, 
                                    {"10","13","7","2","23","60",}};
    
    
    public static int posicionUsuario = -1;
    public String usuarioBusqueda;
    player player = new player();
    funciones funciones = new funciones();
    pantallaInicio pantallaInicio = new pantallaInicio();
    /**
     * Creates new form loginMenu
     */
    public loginMenu() {
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

        btnOkUsuario = new javax.swing.JButton();
        login = new javax.swing.JTextField();
        usuarioRegistro = new javax.swing.JTextField();
        loginUsuario = new javax.swing.JTextField();
        loginPassword = new javax.swing.JTextField();
        btnOkPassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOkUsuario.setBackground(new java.awt.Color(0, 0, 0));
        btnOkUsuario.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnOkUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnOkUsuario.setText("Ok");
        btnOkUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkUsuarioActionPerformed(evt);
            }
        });

        login.setBackground(new java.awt.Color(0, 0, 0));
        login.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        usuarioRegistro.setBackground(new java.awt.Color(0, 0, 0));
        usuarioRegistro.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        usuarioRegistro.setForeground(new java.awt.Color(255, 255, 255));
        usuarioRegistro.setText("Ingrese sus datos de Ghost");
        usuarioRegistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        usuarioRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioRegistroActionPerformed(evt);
            }
        });

        loginUsuario.setText("Mi usuario de ghost");
        loginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsuarioActionPerformed(evt);
            }
        });

        loginPassword.setText("Mi password de ghost");
        loginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPasswordActionPerformed(evt);
            }
        });

        btnOkPassword.setBackground(new java.awt.Color(0, 0, 0));
        btnOkPassword.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnOkPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnOkPassword.setText("Ok");
        btnOkPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnOkUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOkPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(usuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(usuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOkUsuario)
                    .addComponent(btnOkPassword))
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkUsuarioActionPerformed
        // TODO add your handling code here
        usuarioBusqueda = loginUsuario.getText();  
        
        funciones.validarPosicion(usuariosInfo,usuarioBusqueda);
        
        if(posicionUsuario>=0){
            JOptionPane.showMessageDialog(null, "Usuario encontrado!");
            player.setUsuario(usuarioBusqueda);
            
            
             
            }
        else{
            JOptionPane.showMessageDialog(null,"Usuario no encontrado, redirigiendo al menu de inicio...");  
            this.dispose();
            pantallaInicio.setVisible(true);
            }
        
    }//GEN-LAST:event_btnOkUsuarioActionPerformed

    private void usuarioRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioRegistroActionPerformed

    private void loginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginUsuarioActionPerformed

    private void loginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPasswordActionPerformed

    private void btnOkPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkPasswordActionPerformed
        // TODO add your handling code here:
        String passwordBusqueda = loginPassword.getText();
        
        
        if(posicionUsuario == -1){
                JOptionPane.showMessageDialog(null, "Aun no ha validado ningun usuario.");
        }
        else if(passwordBusqueda.equals(usuariosInfo[1][posicionUsuario])){
                player.setPassword(passwordBusqueda);
                JOptionPane.showMessageDialog(null,"Bienvenido " + usuarioBusqueda);
                this.dispose();
                
                
                }
       
        
        else {
                JOptionPane.showMessageDialog(null, "Password incorrecta, redirigiengo al menu de incio..");
                this.dispose();
                pantallaInicio.setVisible(true);
                }
        
    }//GEN-LAST:event_btnOkPasswordActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(loginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkPassword;
    private javax.swing.JButton btnOkUsuario;
    private javax.swing.JTextField login;
    private javax.swing.JTextField loginPassword;
    private javax.swing.JTextField loginUsuario;
    private javax.swing.JTextField usuarioRegistro;
    // End of variables declaration//GEN-END:variables
}
