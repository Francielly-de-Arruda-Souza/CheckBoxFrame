/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkboxtest;
//método principal para testar a classe ButtonFrame
import javax.swing.JFrame;

public class CheckBoxTest {
         public static void main (String [] args){
                  CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
                  checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  checkBoxFrame.setSize(275, 100);//configura o tamanho do Frame
                  checkBoxFrame.setVisible(true);//exibe o Frame
         }//fim do método main
}//fim da classe CheckBoxTest
