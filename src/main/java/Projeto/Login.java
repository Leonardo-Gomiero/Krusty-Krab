/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Projeto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import static java.awt.SystemColor.window;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Leonardo
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    
    public Login() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setResizable(false);
        
        URL url = this.getClass().getResource("/Images/caren.png");
        Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(imgTitulo);
        
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        TxtCPF = new javax.swing.JTextField();
        TxtSenha = new javax.swing.JPasswordField();
        CheckSenha = new javax.swing.JCheckBox();
        LblAviso = new javax.swing.JLabel();
        BtnEntrar = new javax.swing.JButton();
        LblCadastrar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(154, 217, 205));

        jLabel14.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(172, 86, 6));
        jLabel14.setText("Bem vindo");

        TxtCPF.setBackground(new java.awt.Color(255, 255, 255));
        TxtCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtCPF.setForeground(new java.awt.Color(153, 153, 153));
        TxtCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtCPF.setText("CPF");
        TxtCPF.setBorder(null);
        TxtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtCPFFocusGained(evt);
            }
        });
        TxtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCPFActionPerformed(evt);
            }
        });
        TxtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCPFKeyPressed(evt);
            }
        });

        TxtSenha.setBackground(new java.awt.Color(255, 255, 255));
        TxtSenha.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtSenha.setText("Senha");
        TxtSenha.setBorder(null);
        TxtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtSenhaFocusGained(evt);
            }
        });
        TxtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenhaActionPerformed(evt);
            }
        });

        CheckSenha.setBackground(new java.awt.Color(154, 217, 205));
        CheckSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CheckSenha.setForeground(new java.awt.Color(0, 0, 0));
        CheckSenha.setText("Mostrar senha.");
        CheckSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSenhaActionPerformed(evt);
            }
        });

        LblAviso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LblAviso.setForeground(new java.awt.Color(255, 0, 51));
        LblAviso.setText("Dados cadastrais incorretos ou não registrados.");

        BtnEntrar.setBackground(new java.awt.Color(172, 86, 6));
        BtnEntrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        BtnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEntrar.setText("Entrar");
        BtnEntrar.setToolTipText("");
        BtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEntrarActionPerformed(evt);
            }
        });

        LblCadastrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LblCadastrar.setForeground(new java.awt.Color(172, 86, 6));
        LblCadastrar.setText("Cadastre-se.");
        LblCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblCadastrarMouseEntered(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Não tem conta?");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblCadastrar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CheckSenha)
                            .addComponent(TxtSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(TxtCPF, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(LblAviso)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckSenha)
                .addGap(15, 15, 15)
                .addComponent(LblAviso)
                .addGap(18, 18, 18)
                .addComponent(BtnEntrar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(LblCadastrar))
                .addGap(58, 58, 58))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 400));

        jPanel3.setBackground(new java.awt.Color(154, 217, 205));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\SiteRestaurante\\imagens\\logoNovo_SemFundo.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 20, 390, 360));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 340, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparTudo() {
        /*
        TxtLogin.setText("");
        TxtSenha1.setText("");
        TxtSenha2.setText("");
        TxtCEP.setText("");
        TxtRG.setText("");
        TxtCPFCadastro.setText("");
        TxtSalario.setValue(0);
        CheckSenhaCadastro.setSelected(false);
         */

        TxtCPF.setText("");
        TxtSenha.setText("");
        CheckSenha.setSelected(false);
    }

    private void TxtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCPFActionPerformed

    private void TxtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenhaActionPerformed

    private void CheckSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSenhaActionPerformed
        // TODO add your handling code here:
        if (CheckSenha.isSelected()) {
            TxtSenha.setEchoChar((char) 0);

        } else {
            TxtSenha.setEchoChar('*');

        }
    }//GEN-LAST:event_CheckSenhaActionPerformed

    private void BtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEntrarActionPerformed
        // TODO add your handling code here:
        Conectar obj = new Conectar();

        Connection conexao = obj.connectionMySql();

        long cpf = Long.parseLong(TxtCPF.getText());

        String senha2 = "";
        char[] senha = TxtSenha.getPassword();
        senha2 = new String(senha);

        boolean status_login = obj.realizarLogin(conexao, cpf, senha2);

        String nome = "";
        int nivel = 1;

        if (status_login) {

            Menu criar = new Menu();
            try {
                Statement stml = conexao.createStatement();
                ResultSet rs = stml.executeQuery("SELECT Nome_fun, Nivel from Funcionarios WHERE CPF= " + cpf + ";");

                while (rs.next()) {
                    nome = rs.getString(1);
                    nivel = rs.getInt(2);
                }

                System.out.println(nome);

            } catch (SQLException ex) {
            }

            dispose();

            criar.setVisible(true);
            criar.LblNome.setText(nome);
            criar.LblNivel.setText(Integer.toString(nivel));

            if (nivel < 3) {
                criar.LblDelivery.setVisible(false);
                criar.P4.setVisible(false);

                criar.LblFornecedor.setVisible(false);
                criar.P5.setVisible(false);

                criar.LblFuncionarios.setVisible(false);
                criar.P6.setVisible(false);

            }

        } else {
            LblAviso.setVisible(true);
        }
    }//GEN-LAST:event_BtnEntrarActionPerformed

    private void LblCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCadastrarMouseClicked
        // TODO add your handling code here:
        Cadastro JanCadastro = new Cadastro();
        
        this.setVisible(false);
        
        JanCadastro.setVisible(true);
        
        LimparTudo();
    }//GEN-LAST:event_LblCadastrarMouseClicked

    private void LblCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblCadastrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_LblCadastrarMouseEntered

    private void TxtCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtCPFFocusGained
        // TODO add your handling code here:
        if (TxtCPF.getText().equals("CPF")) {
            TxtCPF.setText("");
        }
    }//GEN-LAST:event_TxtCPFFocusGained

    private void TxtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtSenhaFocusGained
        // TODO add your handling code here:
        if (TxtSenha.getText().equals("Senha")) {
            TxtSenha.setText("");
        }
    }//GEN-LAST:event_TxtSenhaFocusGained

    private void TxtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCPFKeyPressed
        // TODO add your handling code here:
        TxtCPF.setForeground(Color.black);
    }//GEN-LAST:event_TxtCPFKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LblAviso.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEntrar;
    private javax.swing.JCheckBox CheckSenha;
    private javax.swing.JLabel LblAviso;
    private javax.swing.JLabel LblCadastrar;
    private javax.swing.JTextField TxtCPF;
    private javax.swing.JPasswordField TxtSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
