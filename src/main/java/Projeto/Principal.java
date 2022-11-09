/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Projeto;

import javax.swing.ImageIcon;

/**
 *
 * @author Leonardo
 */
public class Principal {
    

    public static void main(String[] args) {
        
        
        
        Carregar JanCarregar = new Carregar();
        
        
        JanCarregar.setVisible(true);
        
        
        try{
            for(int i = 0; i <= 100; i++){
                JanCarregar.LblProgresso.setText(i + "%");
                if(i == 10){
                   JanCarregar.LblProcesso.setText("Ligando módulos...");
                   
                }else if(i == 20){
                   JanCarregar.LblProcesso.setText("Carregando módulos...");
                   
                }else if(i == 50){
                   JanCarregar.LblProcesso.setText("Conectando ao banco de dados...");
                   
                }else if(i == 70){
                   JanCarregar.LblProcesso.setText("Conexão concluída...");
                   
                }else if(i == 80){
                   JanCarregar.LblProcesso.setText("Lançando aplicação...");
                   
                }
                
                Thread.sleep(20);
                JanCarregar.BarraCarrregando.setValue(i);
            }
        }
        catch(Exception e){
            System.out.println("Erro: " + e);
        }
        
        JanCarregar.dispose();
        
        
        Login JanLogin = new Login();
        
    }
}