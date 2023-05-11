package Program.Interface_graf;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JTextField;
import java.awt.*;

public class TelaCliPf extends Tela implements ActionListener {
  
    JButton salvar = new JButton();
    JButton voltar = new JButton();    
    
    public void telaCliPf(){
        setTitle("Gerenciar Pessoa Física");

        //Label com o texto "NOME:"
        JLabel labelNome = new JLabel(); 
        labelNome.setText("Nome:");
        labelNome.setBounds(30, 66, 70, 70);
        labelNome.setForeground(corLabel1);
        labelNome.setVisible(true);
        this.add(labelNome);
        

        //Caixa para inserir o nome
        JTextField textName = new JTextField(); 
        textName.setBounds(170, 90, 300, 25);
        textName.setFont(new Font("Arial", Font.ITALIC, 12));
        textName.setVisible(true);
        this.add(textName);
        

        //Labell com o texto "CPF:"
        JLabel labelCPF = new JLabel(); 
        labelCPF.setText("CPF:");
        labelCPF.setBounds(30, 100, 70, 70);
        labelCPF.setForeground(corLabel1);
        labelCPF.setVisible(true);
        this.add(labelCPF);

        //Caixa para inserir o CPF
        JTextField textCPF = new JTextField(); 
        textCPF.setBounds(170, 124, 300, 25);
        textCPF.setFont(new Font("Arial", Font.ITALIC, 12));
        textCPF.setVisible(true);
        add(textCPF);      

        //Label com o texto "CELULAR:"
        JLabel labelCelular = new JLabel(); 
        labelCelular.setText("Celular:");
        labelCelular.setBounds(30, 134, 70, 70);
        labelCelular.setForeground(corLabel1);
        labelCelular.setVisible(true);
        this.add(labelCelular);

        //Caixa para inserir o celular
        JTextField textCELULAR = new JTextField(); 
        textCELULAR.setBounds(170, 158, 300, 25);
        textCELULAR.setFont(new Font("Arial", Font.ITALIC, 12));
        textCELULAR.setVisible(true);
        this.add(textCELULAR);   
        
        //--------------------------------------------------

        //Criação do botão de cadastro

        salvar.setVisible(true);
        salvar.setText("Salvar");
        salvar.setBounds(185, 250, 120, 40);
        salvar.setIcon(iconSave);
        salvar.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(salvar);

        
        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);
    }
 //----------MÉTODO DE CRIAÇÃO DE EVENTOS----------
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == voltar){
            this.dispose();
            TelaCli telaCli = new TelaCli();
            telaCli.telaCli();     
       }
    }
    
        

    


        




}


