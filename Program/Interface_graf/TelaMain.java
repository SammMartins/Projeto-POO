package Program.Interface_graf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;

public class TelaMain extends Tela{
    
    public TelaMain(){
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
        
        sublabelManu.setText("ola bom dia me diz que eu sou um erro");
        sublabelManu.setForeground(corLabel2);
        sublabelManu.setBounds(180, 180,300 ,100);
        sublabelManu.setFont(new Font("Arial", Font.PLAIN, 11));
        this.add(sublabelManu);


        
//-------------------------------------------------------------------------------    
        JButton novoRegistro = new JButton();
        novoRegistro.setBounds(70, 70, 75, 75);
        novoRegistro.setIcon(iconInsert);
        this.add(novoRegistro);

        JButton manuntencaoRegistro = new JButton();
        manuntencaoRegistro.setIcon(iconConfig);
        manuntencaoRegistro.setBounds(70, 190, 75, 75);
        this.add(manuntencaoRegistro);

       

    }
}
