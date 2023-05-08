package Program.Interface_graf;
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
    //------------------------Criação de Cores-----------------------------------------------------------
    public Color corFundo1 = new Color(10,25,50);         //definindo a cor de fundo em um objeto
    public Color corLabel1 = new Color(206,222,250);     //definindo a cor de fundo em um objeto
    public Color corLabel2 = new Color(200,200,200);    //definindo a cor de fundo em um objeto
    
    public Tela(){
        
        setTitle("");
        setVisible(true);                              //configura visibilidade da tela.
        setSize(500, 400);                 //configurando tamanho da tela.  
        setDefaultCloseOperation(EXIT_ON_CLOSE);       //definindo operação de fechamento de tela.
        setResizable(false);                //impossibilita o redimensionamento da tela.
        setLocationRelativeTo(null);               //configura a localização de nascimento da tela
        setLayout(null);                    //"reseta" o layout da tela.
        getContentPane().setBackground(corFundo1); //Define cor de fundo da tela.  
    }
}