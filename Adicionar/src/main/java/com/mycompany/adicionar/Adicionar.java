/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adicionar;
import javax.swing.JOptionPane;
/**
 *
 * @author matdi
 */
public class Adicionar {

    public static void main(String[] args) {
        String primeiro; //caixa para inserir o n1
        String segundo; //caixa para inserir n2
        
        float altura=0.0f; //numero inserido na caixa 1
        float peso=0.0f; //numero inserido caixa 2
        float imc=0.0f; //resultado 
        
        primeiro=JOptionPane.showInputDialog("Insira a sua altura","altura");
        segundo=JOptionPane.showInputDialog("Insira o seu peso","peso");
        
        altura=Float.parseFloat(primeiro);
        peso=Float.parseFloat(segundo);
        
        //soma
        imc=peso/(altura*altura);
        
        //resultado
         if (imc >= 30){
            JOptionPane.showConfirmDialog(null, "Seu imc é de " + imc, "Gordinho" ,JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showConfirmDialog(null, "Seu imc é de "+ imc, "Magrinho", JOptionPane.PLAIN_MESSAGE);
        }    
    }
}
