package Program.Telas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

import Program.ConexãoBD.DAOCliPj;

import javax.swing.*;
import javax.swing.JFrame;


public class TelaAviso extends JFrame implements ActionListener {
    public Color corFundo1 = new Color(27, 38, 44);         //definindo a cor de fundo em um objeto
    public Color corFundo2 = new Color(37, 48, 54);
    public Color corLabel1 = new Color(187, 225, 250);     //definindo a cor de fundo em um objeto
    public Color corLabel2 = new Color(200,200,200);    //definindo a cor de fundo em um objeto

    JButton cancel = new JButton();
    JButton confirm = new JButton();


    public ImageIcon iconCancel = new ImageIcon("Images/cancel.png");
    public ImageIcon iconEnviar = new ImageIcon("Images/enviar-bd.png");

    public int retorno = 0;

    public TelaAviso(){
        setTitle("AVISO");
        setVisible(true);                              //configura visibilidade da tela.
        setSize(250, 200);                 //configurando tamanho da tela.  
        setDefaultCloseOperation(EXIT_ON_CLOSE);       //definindo operação de fechamento de tela.
        setResizable(false);                //impossibilita o redimensionamento da tela.
        setLocationRelativeTo(null);               //configura a localização de nascimento da tela
        setLayout(null);                    //"reseta" o layout da tela.
        getContentPane().setBackground(corFundo1); //Define cor de fundo da tela.  

        JPanel panel = new JPanel();
        panel.setBackground(corFundo1);
        panel.setVisible(true);
        panel.setBounds(0, 0, 1000, 60);
        this.add(panel);


        JLabel labelAviso = new JLabel();
        labelAviso.setText("Concluído!");
        labelAviso.setForeground(corLabel1);
        labelAviso.setBounds(10, 10,200,200);
        labelAviso.setFont(new Font("Arial Black", Font.PLAIN, 10));
        this.add(labelAviso);


        cancel.setBounds(40, 100, 42, 42);
        cancel.setHorizontalAlignment(SwingConstants.CENTER);
        cancel.setIcon(iconCancel);
        cancel.addActionListener(this);
        cancel.addActionListener(new ActionListener() { //MÉTODO DE CRIAÇÃO DE EVENTO DO BOTÃO SALVAR
            @Override
            public void actionPerformed(ActionEvent e) {
                    TelaAviso.this.dispose();
                    new Inicio(); 
            }});
        this.add(cancel);

        confirm.setBounds(140, 100, 42, 42);
        confirm.setHorizontalAlignment(SwingConstants.CENTER);
        confirm.setIcon(iconEnviar);
        confirm.addActionListener(this);
        confirm.addActionListener(new ActionListener() { //MÉTODO DE CRIAÇÃO DE EVENTO DO BOTÃO SALVAR
            @Override
            public void actionPerformed(ActionEvent e) {
                new DAOCliPj();
                TelaAviso.this.dispose();
            }});
        this.add(confirm);

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    
    
}
