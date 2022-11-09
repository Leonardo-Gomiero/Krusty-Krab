/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Projeto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Leonardo
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Cadastro() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
        URL url = this.getClass().getResource("/Images/caren.png");
        Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(imgTitulo);
        
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtLogin = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TxtCEP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtSenha1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        TxtRG = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtSenha2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        TxtCPFCadastro = new javax.swing.JTextField();
        CheckSenhaCadastro = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtSalario = new javax.swing.JSpinner();
        LblSenha = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\SiteRestaurante\\imagens\\mapa.png")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 530));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 530));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Dados Cadastrais");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Nome Completo");

        TxtLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtLoginActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("CEP");

        TxtCEP.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCEPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha");

        TxtSenha1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenha1ActionPerformed(evt);
            }
        });
        TxtSenha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtSenha1KeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("RG");

        TxtRG.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRGActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Confirmação de senha");

        TxtSenha2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSenha2ActionPerformed(evt);
            }
        });
        TxtSenha2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtSenha2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtSenha2KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CPF");

        TxtCPFCadastro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtCPFCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCPFCadastroActionPerformed(evt);
            }
        });

        CheckSenhaCadastro.setBackground(new java.awt.Color(0, 153, 204));
        CheckSenhaCadastro.setForeground(new java.awt.Color(0, 0, 0));
        CheckSenhaCadastro.setText("Mostrar senha.");
        CheckSenhaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckSenhaCadastroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("R$");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Salário");

        TxtSalario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TxtSalario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TxtSalario.setValue(10.00);

        LblSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LblSenha.setForeground(new java.awt.Color(255, 0, 51));
        LblSenha.setText("Sua confirmação de senha não corresponde com a senha inserida.");

        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setText("Pronto");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(TxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel7)
                                .addComponent(CheckSenhaCadastro)
                                .addComponent(TxtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(jLabel8)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel13))
                            .addGap(58, 58, 58))
                        .addComponent(LblSenha)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(38, 38, 38))))
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCPFCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TxtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtSenha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckSenhaCadastro)
                .addGap(7, 7, 7)
                .addComponent(LblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(37, 37, 37))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -10, 680, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 600, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimparTudo() {

        TxtLogin.setText("");
        TxtSenha1.setText("");
        TxtSenha2.setText("");
        TxtCEP.setText("");
        TxtRG.setText("");
        TxtCPFCadastro.setText("");
        TxtSalario.setValue(0);
        CheckSenhaCadastro.setSelected(false);

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LblSenha.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void TxtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLoginActionPerformed

    private void TxtCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCEPActionPerformed

    private void TxtSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenha1ActionPerformed

    private void TxtSenha1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSenha1KeyReleased
        // TODO add your handling code here:
        String txt1, txt2;

        txt1 = TxtSenha1.getText();
        txt2 = TxtSenha2.getText();

        if (txt1.equals(txt2)) {
            LblSenha.setVisible(false);
        } else {
            LblSenha.setVisible(true);
        }
    }//GEN-LAST:event_TxtSenha1KeyReleased

    private void TxtRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRGActionPerformed

    private void TxtSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSenha2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenha2ActionPerformed

    private void TxtSenha2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSenha2KeyReleased
        // TODO add your handling code here:
        String txt1, txt2;

        txt1 = TxtSenha1.getText();
        txt2 = TxtSenha2.getText();

        if (txt1.equals(txt2)) {
            LblSenha.setVisible(false);
        } else {
            LblSenha.setVisible(true);
        }
    }//GEN-LAST:event_TxtSenha2KeyReleased

    private void TxtSenha2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSenha2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSenha2KeyTyped

    private void TxtCPFCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCPFCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCPFCadastroActionPerformed

    private void CheckSenhaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckSenhaCadastroActionPerformed
        // TODO add your handling code here:
        if (CheckSenhaCadastro.isSelected()) {
            TxtSenha1.setEchoChar((char) 0);
            TxtSenha2.setEchoChar((char) 0);

        } else {
            TxtSenha1.setEchoChar('*');
            TxtSenha2.setEchoChar('*');

        }
    }//GEN-LAST:event_CheckSenhaCadastroActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Conectar obj = new Conectar();

        String senha2 = "";
        long cep = 0;

        Connection conexao = obj.connectionMySql();

        long cpf = 0;
        String nome = "";
        String rg = "";
        float salario = (int) TxtSalario.getValue();   //Por padrao, sera 10
        char[] senha = TxtSenha1.getPassword();
        senha2 = new String(senha);

        cpf = Long.parseLong(TxtCPFCadastro.getText());
        nome = TxtLogin.getText();
        rg = TxtRG.getText();

        if (!TxtCEP.getText().equals("")) {
            cep = Long.parseLong(TxtCEP.getText());
        }

        try {

            //Connection con, long CPF, String Nome, String RG, float Salario, long CEP, String Senha, int Nivel
            obj.novoFuncionario(conexao, cpf, nome, rg, salario, cep, senha2, 1);

            obj.consultaFuncionario(conexao);
            obj.closeConnectionMySql(conexao);

            JOptionPane.showMessageDialog(null, "O cadastro de " + nome + " foi efetuado.");

            Menu criar = new Menu();

            criar.LblNome.setText(nome);

            criar.LblDelivery.setVisible(false);
            criar.P4.setVisible(false);

            criar.LblFornecedor.setVisible(false);
            criar.P5.setVisible(false);

            criar.LblFuncionarios.setVisible(false);
            criar.P6.setVisible(false);

            dispose();
            criar.setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro!!" + e);
            return;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Login fazerLogin = new Login();
        
        fazerLogin.setVisible(true);
        
        dispose();
        
        
        
        //LimparTudo();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckSenhaCadastro;
    private javax.swing.JLabel LblSenha;
    private javax.swing.JTextField TxtCEP;
    private javax.swing.JTextField TxtCPFCadastro;
    private javax.swing.JTextField TxtLogin;
    private javax.swing.JTextField TxtRG;
    private javax.swing.JSpinner TxtSalario;
    private javax.swing.JPasswordField TxtSenha1;
    private javax.swing.JPasswordField TxtSenha2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
