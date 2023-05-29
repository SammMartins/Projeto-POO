package Program.Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manuntencao extends Tela implements ActionListener {

    JButton MTPF = new JButton();
    JButton MTPJ = new JButton();
    JButton voltar = new JButton();

    public Manuntencao() {
        setTitle("Tela de Manutenção");
        setIconImage(icone.getImage());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

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

        JLabel labelMTPF = new JLabel();
        labelMTPF.setText("Pesquisar PF");
        labelMTPF.setForeground(corLabel1);
        labelMTPF.setBounds(180, 60, 100, 100);
        labelMTPF.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelMTPF);

        JLabel labelMTPJ = new JLabel();
        labelMTPJ.setText("Pesquisar PJ");
        labelMTPJ.setForeground(corLabel1);
        labelMTPJ.setBounds(180, 170, 250, 100);
        labelMTPJ.setFont(new Font("Arial Black", Font.PLAIN, 12));
        this.add(labelMTPJ);

        MTPF.setBounds(70, 70, 75, 75);
        MTPF.setIcon(iconPF);
        MTPF.addActionListener(this);
        this.add(MTPF);

        MTPJ.setBounds(70, 190, 75, 75);
        MTPJ.setIcon(iconPJ);
        MTPJ.addActionListener(this);
        this.add(MTPJ);

        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);
    }
    //----------MÉTODO DE CRIAÇÃO DE EVENTOS----------
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == MTPF) {
            this.dispose();
        new TelaTablePF();

        }
        if (e.getSource() == MTPJ) {
            this.dispose();
            new TelaTablePJ();
        }
        if (e.getSource() == voltar) {
            this.dispose();
         new Inicio();    
        }
    }
}
