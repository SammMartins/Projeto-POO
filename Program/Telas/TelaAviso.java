package Program.Telas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class TelaAviso extends JFrame implements ActionListener {
    public Color corFundo1 = new Color(27, 38, 44);         //definindo a cor de fundo em um objeto
    public Color corFundo2 = new Color(37, 48, 54);
    public Color corLabel1 = new Color(187, 225, 250);     //definindo a cor de fundo em um objeto
    public Color corLabel2 = new Color(200,200,200);    //definindo a cor de fundo em um objeto

    JButton ok = new JButton();
    

    public ImageIcon iconCheck = new ImageIcon("Images/check.png");

    public TelaAviso(String textoAviso){
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
        labelAviso.setText(formatarTextoAviso(textoAviso));
        labelAviso.setForeground(corLabel1);
        labelAviso.setBounds(10, 10,100,80);
        labelAviso.setFont(new Font("Arial Black", Font.PLAIN, 8));
        this.add(labelAviso);


        ok.setBounds(90, 100, 48, 48);
        ok.setHorizontalAlignment(SwingConstants.CENTER);
        ok.setIcon(iconCheck);
        ok.addActionListener(this);
        this.add(ok);
    }

    //Método para Formatar o texto de aviso
    private String formatarTextoAviso(String textoAviso) {
        StringBuilder textoFormatado = new StringBuilder("<html>");
        String textoFim;

        int comprimentoMaximoLinha = 100;
        int comprimentoAtualLinha = 0;

        for (char c : textoAviso.toCharArray()) {
            textoFormatado.append(c);
            comprimentoAtualLinha++;

            if (comprimentoAtualLinha >= comprimentoMaximoLinha && c != ' ') {
                textoFormatado.append("<br>");
                comprimentoAtualLinha = 0;
            }
        }

        textoFormatado.append("</html>");
        textoFim = textoFormatado.toString();
        return textoFim;
    }

    
}
