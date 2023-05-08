package Program.Interface_graf;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;

public class TelaCliPJ extends Tela implements ActionListener {
    JButton voltar = new JButton();
    JButton salvar = new JButton("Salvar");
    public TelaCliPJ(){
        this.setTitle("Cadastro Pessoa Jurídica");
        
//------------------------------------------------------------------\\

        //Label Razão Social
        JLabel lRazao = new JLabel();
        lRazao.setText("Razão Social");
        lRazao.setBounds(25, 28, 120, 70);
        lRazao.setForeground(corLabel2);
        lRazao.setFont(new Font("Arial Black", Font.BOLD, 15));
        this.add(lRazao);

        //TextArea Razão Social
        JTextField jtfRazao = new JTextField();
        jtfRazao.setBounds(170, 50, 300, 25);
        jtfRazao.setFont(new Font("Arial", Font.ITALIC, 12));
        this.add(jtfRazao);

//------------------------------------------------------------------

        //Label CNPJ
        JLabel lCnpj = new JLabel();
        lCnpj.setText("CNPJ");
        lCnpj.setBounds(25, 58, 120, 70);
        lCnpj.setForeground(corLabel2);
        lCnpj.setFont(new Font("Arial Black", Font.BOLD, 15));
        this.add(lCnpj);

        //TextArea CNPJ
        JTextField jtfCnpj = new JTextField();
        jtfCnpj.setBounds(170, 80, 300, 25);
        jtfCnpj.setFont(new Font("Arial", Font.ITALIC, 12));
        this.add(jtfCnpj);

//------------------------------------------------------------------

        //Label E-mail
        JLabel lEmail = new JLabel();
        lEmail.setText("E-MAIL");
        lEmail.setBounds(25, 88, 120, 70);
        lEmail.setForeground(corLabel2);
        lEmail.setFont(new Font("Arial Black", Font.BOLD, 15));
        this.add(lEmail);

        //TextArea E-mail
        JTextField jtfEmail = new JTextField();
        jtfEmail.setBounds(170, 110, 300, 25);
        jtfEmail.setFont(new Font("Arial", Font.ITALIC, 12));
        this.add(jtfEmail);

//------------------------------------------------------------------

        //Label Contato
        JLabel lContato = new JLabel();
        lContato.setText("Contato");
        lContato.setBounds(25, 118, 120, 70);
        lContato.setForeground(corLabel2);
        lContato.setFont(new Font("Arial Black", Font.BOLD, 15));
        this.add(lContato);

        //TextArea Contato
        JTextField jtfContato = new JTextField();
        jtfContato.setBounds(170, 140, 300, 25);
        jtfContato.setFont(new Font("Arial", Font.ITALIC, 12));
        this.add(jtfContato);

//------------------------------------------------------------------

        //Label Responsável legal
        JLabel lResponsavelLegal = new JLabel();
        lResponsavelLegal.setText("Responsável legal");
        lResponsavelLegal.setBounds(25, 148, 120, 70);
        lResponsavelLegal.setForeground(corLabel2);
        lResponsavelLegal.setFont(new Font("Arial Black", Font.BOLD, 15));
        this.add(lResponsavelLegal);

        //TextArea Responsável legal
        JTextField jtfResponsavelLegal = new JTextField();
        jtfResponsavelLegal.setBounds(170, 170, 300, 25);
        jtfResponsavelLegal.setFont(new Font("Arial", Font.ITALIC, 12));
        this.add(jtfResponsavelLegal);

        //------------------------
//              Criação de botoes

        
        salvar.setVisible(true);
        salvar.setBounds(185, 250, 120, 40);
        salvar.setIcon(iconSave);
        salvar.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(salvar);

        voltar.setIcon(iconBack);
        voltar.setBounds(10, 10, 40, 30);
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
