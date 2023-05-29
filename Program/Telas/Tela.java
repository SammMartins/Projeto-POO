package Program.Telas;
import java.awt.*;

import javax.swing.*;


public class Tela extends JFrame{
    
    
    //------------------------Criação de Icones--------------------------------------------------------
    public ImageIcon iconInsert = new ImageIcon("Images/insert.png");
    public ImageIcon iconConfig = new ImageIcon("Images/config.png");
    public ImageIcon iconCancel = new ImageIcon("Images/cancel.png"); 
    public ImageIcon iconSave = new ImageIcon("Images/save.png");
    public ImageIcon iconPF = new ImageIcon("Images/PF.png");
    public ImageIcon iconPJ = new ImageIcon("Images/PJ.png");
    public ImageIcon iconBack = new ImageIcon("Images/voltar.png");
    public ImageIcon iconLupa = new ImageIcon("Images/Lupa.png");
    public ImageIcon icone = new ImageIcon("Images/iconePrincipal.png");
    ;
    //------------------------Criação de Cores-----------------------------------------------------------
    public Color corFundo1 = new Color(27, 38, 44);         //definindo a cor de fundo em um objeto
    public Color corPanel = new Color(15, 76, 117);
    public Color corLabel1 = new Color(187, 225, 250);     //definindo a cor de fundo em um objeto
    public Color corLabel2 = new Color(200,200,200);    //definindo a cor de fundo em um objeto
    
    public Tela(){
        setIconImage(icone.getImage());
        setTitle("");
        setVisible(true);                              //configura visibilidade da tela.
        setSize(500, 400);                 //configurando tamanho da tela.  
        setDefaultCloseOperation(EXIT_ON_CLOSE);       //definindo operação de fechamento de tela.
        setResizable(false);                //impossibilita o redimensionamento da tela.
        setLocationRelativeTo(null);               //configura a localização de nascimento da tela
        setLayout(null);                    //"reseta" o layout da tela.
        getContentPane().setBackground(corFundo1); //Define cor de fundo da tela.  

        JPanel panel = new JPanel();
        panel.setBackground(corPanel);
        panel.setVisible(true);
        panel.setBounds(0, 0, 1000, 60);
        this.add(panel);
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

       
    }
    
}