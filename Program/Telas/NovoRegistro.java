package Program.Telas;

import javax.swing.*;
//import javax.swing.plaf.RootPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NovoRegistro extends Tela implements ActionListener{
    JButton PF = new JButton();
    JButton PJ = new JButton();
    JButton voltar = new JButton();

    public NovoRegistro(){
        setTitle("Gerenciar Clientes");
        setIconImage(icone.getImage());
        setLocationRelativeTo(null);
        setResizable(false);

        JLabel devs = new JLabel("Desenvolvido por: Bruno Cardoso Monteiro, Caio Chaves Lima, José Carlos Neto Soares Dantas, ");
        devs.setForeground(corLabel2);
        devs.setFont(new Font("Arial", Font.ITALIC, 9 ));
        devs.setBounds(40, 286, 1000, 100);
        devs.setVisible(true);
        this.add(devs);

        JLabel devs2 = new JLabel("Rafael Rodrigues Souza, Sammuel Gusmão Martins - UniFTC");
        devs2.setForeground(corLabel2);
        devs2.setFont(new Font("Arial", Font.ITALIC, 9 ));
        devs2.setBounds(120, 295, 1000, 100);
        devs2.setVisible(true);
        this.add(devs2);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(31, 42, 51));
        panel2.setVisible(true);
        panel2.setBounds(0, 320, 1000, 40);
        this.add(panel2);

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
            new NovoRegistroPF();
       }
       if(e.getSource() == PJ){
            this.dispose();
            new NovoRegistroPJ();
       }
       if(e.getSource() == voltar){
            this.dispose();
            new Inicio();
                   
       }
        
    }
}