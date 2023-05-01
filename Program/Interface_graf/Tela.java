package Program.Interface_graf;
import java.awt.*;
import javax.swing.*;


public class Tela extends JFrame{
    public ImageIcon iconInsert = new ImageIcon("Images/insert.png");
    public ImageIcon iconConfig = new ImageIcon("Images/config.png");

    public Color corFundo1 = new Color(10,25,50);
    public Color corLabel1 = new Color(206,222,250);
    public Color corLabel2 = new Color(200,200,200);
    
    public Tela(){
        setTitle("");
        setVisible(true);                            //configura visibilidade da tela.
        setSize(500, 400);               //configurando tamanho da tela.  
        setDefaultCloseOperation(EXIT_ON_CLOSE);     //definindo operação de fechamento de tela.
        setResizable(false);              //impossibilita o redimensionamento da tela.
        setLocationRelativeTo(null);             //configura a localização de nascimento da tela
        setLayout(null);                  //"reseta" o layout da tela.
        getContentPane().setBackground(corFundo1);

        /*                          Forma Alternativa
        *JFrame jFrame = new JFrame("Tela 1");//criamos um objeto tela com o titulo Tela 1.
        *jFrame.setVisible(true);
        *jFrame.setSize(400, 600);
        *jFrame.setDefaultCloseOperation(tela.EXIT_ON_CLOSE);
        *jFrame.setResizable(false);
        *jFrame.setLocationRelativeTo(null);
        */    
    }
}