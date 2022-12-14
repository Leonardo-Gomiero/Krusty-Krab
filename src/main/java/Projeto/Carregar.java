/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Projeto;

import java.awt.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 22159663
 */
public class Carregar extends javax.swing.JFrame {

    /**
     * Creates new form Painel
     */
    public Carregar() {
        initComponents();
        getContentPane().setBackground(Color.darkGray);
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        URL url = this.getClass().getResource("/Images/caren.png");
        Image imgTitulo = Toolkit.getDefaultToolkit().getImage(url);
        setIconImage(imgTitulo);

        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        PaneEntrar = new javax.swing.JLayeredPane();
        PanLogin = new javax.swing.JPanel();
        BarraCarrregando = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        LblCAREN = new javax.swing.JLabel();
        LblProcesso = new javax.swing.JLabel();
        LblProgresso = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PaneEntrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanLogin.setBackground(new java.awt.Color(0, 0, 0));
        PanLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarraCarrregando.setForeground(new java.awt.Color(102, 255, 102));
        BarraCarrregando.setToolTipText("");
        BarraCarrregando.setName(""); // NOI18N
        PanLogin.add(BarraCarrregando, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 524, 28));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Computer Assistent Remote Embedded Network");
        PanLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        LblCAREN.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        LblCAREN.setForeground(new java.awt.Color(255, 255, 255));
        LblCAREN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblCAREN.setText("C.A.R.E.N.");
        PanLogin.add(LblCAREN, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        LblProcesso.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        LblProcesso.setForeground(new java.awt.Color(255, 255, 255));
        LblProcesso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblProcesso.setText("Processo");
        PanLogin.add(LblProcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        LblProgresso.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        LblProgresso.setForeground(new java.awt.Color(255, 255, 255));
        LblProgresso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LblProgresso.setText("0%");
        PanLogin.add(LblProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 50, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Leonardo\\Documents\\SiteRestaurante\\imagens\\CAREN.png")); // NOI18N
        PanLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 680, 390));

        PaneEntrar.add(PanLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 680, 400));

        getContentPane().add(PaneEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        

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
            java.util.logging.Logger.getLogger(Carregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carregar().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JProgressBar BarraCarrregando;
    private javax.swing.JLabel LblCAREN;
    public javax.swing.JLabel LblProcesso;
    public javax.swing.JLabel LblProgresso;
    private javax.swing.JPanel PanLogin;
    private javax.swing.JLayeredPane PaneEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
