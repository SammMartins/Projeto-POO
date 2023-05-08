package Program.Interface_graf;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;

public class TelaMain extends Tela implements ActionListener{
    /*  OBS.: O metodo construtor foi substituido por um metodo comum da classe TelaMain, visto que
     * depois de algumas pesquisas, ficou claro pra mim que não seria uma boa prática definir as 
     * propriedades no construtor.
     * 
     * Os botões foram instanciados fora do método para serem tratados no ActionListener.
     */
    JButton novoRegistro = new JButton();
    JButton manuntencaoRegistro = new JButton();
    
    public void telaMain(){
        setTitle("Gerenciar Clientes");
        JLabel labelRegistro = new JLabel();
        labelRegistro.setText("Novo Registro");
        labelRegistro.setForeground(corLabel1);
        labelRegistro.setBounds(180, 40,100 ,100);
        labelRegistro.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelRegistro);

        JLabel sublabelRegistro = new JLabel();
        sublabelRegistro.setText("Inserir um novo resgistro ao cadastro.");
        sublabelRegistro.setForeground(corLabel2);
        sublabelRegistro.setBounds(180, 60,300 ,100);
        sublabelRegistro.setFont(new Font("Arial", Font.PLAIN, 11));
        this.add(sublabelRegistro);

        //-------------------------------------------------------------------------------------------
      
        JLabel labelManu = new JLabel();
        labelManu.setText("Matutenção de Registro");
        labelManu.setForeground(corLabel1);
        labelManu.setBounds(180, 160,250,100);
        labelManu.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelManu);

        JLabel sublabelManu = new JLabel();
        sublabelManu.setText("Pesquisar, ");
        sublabelManu.setForeground(corLabel2);
        sublabelManu.setBounds(180, 180,300 ,100);
        sublabelManu.setFont(new Font("Arial", Font.PLAIN, 11));
        this.add(sublabelManu);
       
      //-------------------------------------------------------------------------------    
        
        novoRegistro.setBounds(70, 70, 75, 75);
        novoRegistro.setIcon(iconInsert);
        novoRegistro.addActionListener(this);
        this.add(novoRegistro);
        
        manuntencaoRegistro.setIcon(iconConfig);
        manuntencaoRegistro.setBounds(70, 190, 75, 75);
        manuntencaoRegistro.addActionListener(this);
        this.add(manuntencaoRegistro);
        
    }
    //----------MÉTODO DE CRIAÇÃO DE EVENTOS----------

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == novoRegistro){  //Caso o botão de registro seja clicado.
            //this.setVisible(false);
            this.dispose();
            TelaCli telaCli = new TelaCli();
            telaCli.telaCli();
            telaCli.aberturaCli();
        }
        if(e.getSource() == manuntencaoRegistro){ //Caso o botão de Manuntenção seja clicado.

        }
    }
     
}
