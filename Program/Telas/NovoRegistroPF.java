package Program.Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Program.Classes.ClientePF;

public class NovoRegistroPF extends Tela implements ActionListener {

    //------------------------CREATE BUTTON------------------------\\

    JButton salvar = new JButton("Salvar",iconSave);
    JButton voltar = new JButton(iconBack);

    //------------------------CREATE TEXTFIELD------------------------\\

    JTextField textName = new JTextField();
    JTextField textCPF = new JTextField();
    JTextField textContato = new JTextField();

    //------------------------CREATE LABEL------------------------\\

    JLabel labelNome = new JLabel("Nome");
    JLabel labelCPF = new JLabel("CPF");
    JLabel labelContato = new JLabel("Contato");

    private String sNome, sCPF, sContato;

    public ClientePF clientePF = new ClientePF();

    public NovoRegistroPF() {
        setTitle("Gerenciar Pessoa Física");

    //------------------------Labels------------------------\\

        // NOME

        labelNome.setBounds(30, 66, 70, 70);
        labelNome.setForeground(corLabel1);
        labelNome.setVisible(true);
        this.add(labelNome);

        // CPF

        labelCPF.setBounds(30, 100, 70, 70);
        labelCPF.setForeground(corLabel1);
        labelCPF.setVisible(true);
        this.add(labelCPF);

        // CONTATO

        labelContato.setBounds(30, 134, 70, 70);
        labelContato.setForeground(corLabel1);
        labelContato.setVisible(true);
        this.add(labelContato);

    //------------------------TextFields------------------------\\

        //NAME

        textName.setBounds(170, 90, 300, 25);
        textName.setFont(new Font("Arial", Font.ITALIC, 12));
        textName.setToolTipText("Insira o Nome aqui");
        textName.setVisible(true);
        this.add(textName);

        // CPF

        textCPF.setBounds(170, 124, 300, 25);
        textCPF.setFont(new Font("Arial", Font.ITALIC, 12));
        textCPF.setToolTipText("Insira o CPF aqui");
        textCPF.setVisible(true);
        add(textCPF);

        // CONTATO

        textContato.setBounds(170, 158, 300, 25);
        textContato.setFont(new Font("Arial", Font.ITALIC, 12));
        textContato.setToolTipText("Insira o Contato aqui");
        textContato.setVisible(true);
        this.add(textContato);


    //------------------------FUNÇÃO BUTTONS------------------------\\


        salvar.setVisible(true);
        salvar.setBounds(185, 250, 120, 40);
        salvar.setHorizontalAlignment(SwingConstants.CENTER);
        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                salvar.setEnabled(false); 

                sNome = textName.getText();
                clientePF.setNome(sNome);

                sCPF = textCPF.getText();
                clientePF.setCPF(sCPF);

                sContato = textContato.getText();
                clientePF.setContato(sContato);

                new TelaAvisoPF(clientePF);
                NovoRegistroPF.this.dispose();

            }

        });

        this.add(salvar);

        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        voltar.addActionListener(this);
        this.add(voltar);

    }

    // ----------MÉTODO DE CRIAÇÃO DE EVENTOS----------
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == voltar){
            this.dispose();
            new NovoRegistro();
    }

}
}