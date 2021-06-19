/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkboxtest;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
public class CheckBoxFrame extends JFrame{
         private JTextField textField;//exibe o texto na alteração de fontes
         private JCheckBox boldJCheckBox;//para selecionar ou remover o estilo negrito
         private JCheckBox italicJCheckBox;//para selecionar ou remover o estilo itálico
         //construtor CheckBoxFrame adiciona JCheckBox ao JFrame
         public CheckBoxFrame(){
                  super ("JCheckBox Test");
                  setLayout(new FlowLayout());//configura o layout da tela
             
                  textField = new JTextField("Watch the font style change",20);//configurando JTextField e a sua fonte
                  textField.setFont(new Font("Serif", Font.PLAIN,14));// setFont é utilizado para alterar a fonte de qualquer componente
                  add(textField);// adiciona TextField ao JFrame
        
                  boldJCheckBox = new JCheckBox ("Bold");//Cria uma caixa de seleção para o negrito
                  italicJCheckBox = new JCheckBox ("Italic");//cria caixa de seleção em itálico
                  add(boldJCheckBox);//adiciona caixa de seleção de estilo negrito ao JFrame
                  add(italicJCheckBox);//adiciona caixa de seleção de estilo itálico ao JFrame
                  // Listeners criadores e registradores de handler de evento para ambos os CheckBoxers
                  CheckBoxHandler handler = new CheckBoxHandler();
                  boldJCheckBox.addItemListener(handler);
                  italicJCheckBox.addItemListener(handler);
         }// fim do construtor CheckBoxFrame
         
         //classe interna privada para tratamento de eventos itemListener
         private class CheckBoxHandler implements ItemListener{//um objeto dessa classe pode responder à itemEvents
                  //método que responderá aos eventos da caixa de seleção
                  public void itemStateChanged(ItemEvent event){
                           Font font = null;//armazena a nova fonte
                           //determina qual Check Boxers estão marcados e cria fonte
                           //O método JCheckBox isSelected retorna verdadeiro se o JCheckBox em que é chamado for verificado
                           if(boldJCheckBox.isSelected( ) && italicJCheckBox.isSelected( ) )
                                    font = new Font ("Serif", Font.BOLD + Font.ITALIC, 14);
                           else if (boldJCheckBox.isSelected())
                                    font = new Font("Serif", Font.BOLD, 14);
                           else if (italicJCheckBox.isSelected())
                                    font = new Font ("Serif", Font.ITALIC, 14);
                           else
                                    font = new Font ("Serif", Font.PLAIN, 14);
                           textField.setFont( font );//configura a fonte no textField (caixa de texto)
                  }//fim do método itemStateChanged
         }//fim da classe interna privada CheckBoxHandler
}//fim da classe checkBoxFrame
    

