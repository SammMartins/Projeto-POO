package Program.Interface_graf;

import javax.swing.*;
//import javax.swing.plaf.RootPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCli extends Tela implements ActionListener{
    JButton PF = new JButton();
    JButton PJ = new JButton();
    JButton voltar = new JButton();

    public void telaCli(){
        setTitle("Gerenciar Clientes");
        setLocationRelativeTo(null);



        JLabel labelPF = new JLabel();
        labelPF.setText("Pessoa Física");
        labelPF.setForeground(corLabel1);
        labelPF.setBounds(180, 60,100 ,100);
        labelPF.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelPF);

        JLabel labelPJ = new JLabel();
        labelPJ.setText("Pessoa Jurídica");
        labelPJ.setForeground(corLabel1);
        labelPJ.setBounds(180, 170,250,100);
        labelPJ.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelPJ);
       
//-------------------------------------------------------------------------------    
        
        PF.setBounds(70, 70, 75, 75);
        PF.setIcon(iconPF);
        PF.addActionListener(this);
        this.add(PF);

        
        PJ.setIcon(iconPJ);
        PJ.setBounds(70, 190, 75, 75);
        PJ.addActionListener(this);
        this.add(PJ);

        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);
      
    }
    public void aberturaCli(){
        this.setVisible(true);        
    }
    
  //----------MÉTODO DE CRIAÇÃO DE EVENTOS----------   
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == PF){
            this.dispose();
            TelaCliPf telaPF = new TelaCliPf();
            telaPF.telaCliPf();
       }
       if(e.getSource() == PJ){
            this.dispose();
            TelaCliPj telaPJ = new TelaCliPj();
            telaPJ.setVisible(true);
       }
       if(e.getSource() == voltar){
            this.dispose();
            TelaMain telaMain = new TelaMain();
            telaMain.telaMain();        
       }
        
    }
}