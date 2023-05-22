package Program.Interface_graf;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TelaCliMT_PF extends Tela implements ActionListener {

    JButton voltar = new JButton();
    JButton pesquisarpf = new JButton(iconLupa);

    public void telaMT_PF() {
        setTitle("Pesquisa Pessoa Física");
        setLocationRelativeTo(null);

        //Label com o texto "NOME:"
        JLabel labelNome = new JLabel(); 
        labelNome.setText("Nome:");
        labelNome.setBounds(30, 66, 70, 70);
        labelNome.setForeground(corLabel1);
        labelNome.setVisible(true);
        this.add(labelNome);
        

        //Caixa para inserir o nome
        JTextField textName = new JTextField(); 
        textName.setBorder(null);
        textName.setBounds(170, 90, 300, 25);
        textName.setFont(new Font("Arial", Font.ITALIC, 12));
        textName.setVisible(true);
        this.add(textName);
        

        //Labell com o texto "CPF:"
        JLabel labelCPF = new JLabel(); 
        labelCPF.setText("CPF:");
        labelCPF.setBounds(30, 100, 70, 70);
        labelCPF.setForeground(corLabel1);
        labelCPF.setVisible(true);
        this.add(labelCPF);

        //Caixa para inserir o CPF
        JTextField textCPF = new JTextField();
        textCPF.setBorder(null); 
        textCPF.setBounds(170, 124, 300, 25);
        textCPF.setFont(new Font("Arial", Font.ITALIC, 12));
        textCPF.setVisible(true);
        add(textCPF);      

        //Label com o texto "CELULAR:"
        JLabel labelCelular = new JLabel(); 
        labelCelular.setText("Celular:");
        labelCelular.setBounds(30, 134, 70, 70);
        labelCelular.setForeground(corLabel1);
        labelCelular.setVisible(true);
        this.add(labelCelular);

        //Caixa para inserir o celular
        JTextField textCELULAR = new JTextField(); 
        textCELULAR.setBorder(null);
        textCELULAR.setBounds(170, 158, 300, 25);
        textCELULAR.setFont(new Font("Arial", Font.ITALIC, 12));
        textCELULAR.setVisible(true);
        this.add(textCELULAR);   
        
        //------------------BUTTONS--------------------------------


        pesquisarpf.setVisible(true);
        pesquisarpf.setBorder(null);
        pesquisarpf.setIcon(iconLupa);
        pesquisarpf.setText("PESQUISAR");
        pesquisarpf.setBounds(185, 250, 140, 40);
        pesquisarpf.setHorizontalAlignment(SwingConstants.CENTER);
        pesquisarpf.addActionListener(this);
        this.add(pesquisarpf);

        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);
    }

    // ----------MÉTODO DE CRIAÇÃO DE EVENTOS----------
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voltar) {
            this.dispose();
            TelaCliMT telaCliMT = new TelaCliMT();
            telaCliMT.telaMT();
        }

        if (e.getSource() == pesquisarpf) {
            this.dispose();
            TelaTable table = new TelaTable();
            table.openTelaTable();
        }
    }
}
