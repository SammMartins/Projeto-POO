package Program.Interface_graf;

//import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JTextField;
//import java.awt.*;

public class TelaCliMT_PF extends Tela implements ActionListener{

  JButton voltar = new JButton();
  JButton pesquisarpf = new JButton(iconLupa);
    
  public void telaMT_PF(){

    setTitle("Pesquisa Pessoa Física");
  setLocationRelativeTo(null);

     //Label com o texto "PESQUISAR"
     JLabel labelNome = new JLabel(); 
     labelNome.setText("PESQUISAR PF: ");
     labelNome.setBounds(18, 70, 150, 70);
     labelNome.setFont(new Font("Arial Black", Font.BOLD, 15));
     labelNome.setHorizontalAlignment(SwingConstants.CENTER);
     labelNome.setForeground(corLabel1);
     labelNome.setVisible(true);
     this.add(labelNome);
     
 
     //Caixa para inserir Pesquisa
     JTextField textName = new JTextField(); 
     textName.setBounds(18, 120, 350, 30);
     textName.setFont(new Font("Arial", Font.ITALIC, 12));
     textName.setVisible(true);
     this.add(textName);
 
 
   //----------Buttons------------//
   
         pesquisarpf.setVisible(true);
         pesquisarpf.setBounds(377, 120, 90, 30);
         this.add(pesquisarpf);
 
         voltar.setIcon(iconBack);
         voltar.setBounds(10, 15, 40, 30);
         voltar.addActionListener(this);
         this.add(voltar);
  //----------Button Voltar------------

        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);
  }
  //----------MÉTODO DE CRIAÇÃO DE EVENTOS----------
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == voltar){
        this.dispose();
        TelaCliMT telaCliMT = new TelaCliMT();
        telaCliMT.telaMT();     
   }
}

 }
