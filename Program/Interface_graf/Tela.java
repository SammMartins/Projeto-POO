package Program.Interface_graf;
import java.awt.*;
import javax.swing.*;

public class Tela extends JFrame{
    
    public Tela(){
        setTitle("");
        setVisible(true);                            //configura visibilidade da tela.
        setSize(500, 400);               //configurando tamanho da tela.  
        setDefaultCloseOperation(EXIT_ON_CLOSE);     //definindo operação de fechamento de tela.
        setResizable(false);              //impossibilita o redimensionamento da tela.
        setLocationRelativeTo(null);             //configura a localização de nascimento da tela
        setLayout(null);                  //"reseta" o layout da tela.
        getContentPane().setBackground(new Color(220,230,236));

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