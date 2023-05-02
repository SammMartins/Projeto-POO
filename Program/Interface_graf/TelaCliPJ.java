package Program.Interface_graf;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;

public class TelaCliPj extends Tela {
    
    public TelaCliPj(){
        this.setTitle("Cadastro Pessoa Jurídica");
        
        //------------------------------------------------------------------\\

        //Label Razão Social
        JLabel lRazao = new JLabel();
        lRazao.setText("Razão Social");
        lRazao.setBounds(25, 28, 120, 70);
        lRazao.setForeground(corLabel1);
        lRazao.setFont(new Font("Arial Black", Font.BOLD, 15));
        lRazao.setVisible(true);
        this.add(lRazao);

        //TextArea Razão Social
        JTextField jtfRazao = new JTextField();
        jtfRazao.setBounds(170, 50, 300, 25);
        jtfRazao.setVisible(true);
        jtfRazao.setFont(new Font("Arial", Font.ITALIC, 12));
        this.add(jtfRazao);

        //------------------------------------------------------------------

        //Label CNPJ
        JLabel lCnpj = new JLabel();
        lCnpj.setText("CNPJ");
        lCnpj.setBounds(25, 58, 120, 70);
        lCnpj.setForeground(corLabel1);
        lCnpj.setFont(new Font("Arial Black", Font.BOLD, 15));
        lCnpj.setVisible(true);
        this.add(lCnpj);

        //TextArea CNPJ
        JTextField jtfCnpj = new JTextField();
        jtfCnpj.setBounds(170, 80, 300, 25);
        jtfCnpj.setVisible(true);
        jtfCnpj.setFont(new Font("Arial", Font.ITALIC, 12));
        this.add(jtfCnpj);

    }
}
