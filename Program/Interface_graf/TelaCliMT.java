package Program.Interface_graf;

import javax.swing.*;
import javax.swing.plaf.RootPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCliMT extends Tela implements ActionListener {

   JButton MTPF = new JButton();
   JButton MTPJ = new JButton();
   JButton voltar = new JButton();

   public void telaMT(){

  setTitle("Tela de Manutenção");
  setLocationRelativeTo(null);
  
  JLabel labelMTPF = new JLabel();
  labelMTPF.setText("Pesquisar PF");
  labelMTPF.setForeground(corLabel1);
  labelMTPF.setBounds(180, 60,100 ,100);
  labelMTPF.setFont(new Font("Arial Black", Font.PLAIN, 12));
  this.add(labelMTPF);

  JLabel labelMTPJ = new JLabel();
  labelMTPJ.setText("Pesquisar PJ");
  labelMTPJ.setForeground(corLabel1);
  labelMTPJ.setBounds(180, 170,250,100);
  labelMTPJ.setFont(new Font("Arial Black", Font.PLAIN, 12));
  this.add(labelMTPJ);

//-------------------------------------------------------------------------------    
        

  MTPF.setBounds(70, 70, 75, 75);
        MTPF.setIcon(iconPF);
        MTPF.addActionListener(this);
        this.add(MTPF);

        
        MTPJ.setIcon(iconPJ);
        MTPJ.setBounds(70, 190, 75, 75);
        MTPJ.addActionListener(this);
        this.add(MTPJ);

        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);

   }

  
   public void aberturaCliMT(){
    this.setVisible(true); 
}

//----------MÉTODO DE CRIAÇÃO DE EVENTOS----------   


public void actionPerformed(ActionEvent e) {
    if(e.getSource() == MTPF){
         this.dispose();
         TelaCliMT_PF telaMTPF = new TelaCliMT_PF();
         telaMTPF.telaCliMT_PF();
    }
    if(e.getSource() == MTPJ){
         this.dispose();
         TelaCliMT_PJ telaMTPJ = new TelaCliMT_PJ();
         telaMTPJ.setVisible(true);
    }
    if(e.getSource() == voltar){
         this.dispose();
         TelaMain telaMain = new TelaMain();
         telaMain.telaMain();        
    }
     
 }
}


    