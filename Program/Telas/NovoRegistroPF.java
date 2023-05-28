package Program.Telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JTextField;


import Program.Classes.ClientePF;

public class NovoRegistroPF extends Tela implements ActionListener {

    // ---------BUTTON---------//
    JButton salvar = new JButton();
    JButton voltar = new JButton();

    // ---------TEXTFIELD---------//
    JTextField textName = new JTextField();
    JTextField textCPF = new JTextField();
    JTextField textContato = new JTextField();

    private String sNome, sCPF, sContato;

    public ClientePF clientePF = new ClientePF();

    public NovoRegistroPF() {
        setTitle("Gerenciar Pessoa Física");

        // Label com o texto: "NOME"
        JLabel labelNome = new JLabel();
        labelNome.setText("Nome:");
        labelNome.setBounds(30, 66, 70, 70);
        labelNome.setForeground(corLabel1);
        labelNome.setVisible(true);
        this.add(labelNome);

        // Caixa para inserir o NOME

        textName.setBounds(170, 90, 300, 25);
        textName.setFont(new Font("Arial", Font.ITALIC, 12));
        textName.setToolTipText("Insira o nome aqui");
        textName.setVisible(true);
        this.add(textName);

        // Label com o texto: "CPF"
        JLabel labelCPF = new JLabel();
        labelCPF.setText("CPF:");
        labelCPF.setBounds(30, 100, 70, 70);
        labelCPF.setForeground(corLabel1);
        labelCPF.setVisible(true);
        this.add(labelCPF);

        // Caixa para inserir o "CPF"

        textCPF.setBounds(170, 124, 300, 25);
        textCPF.setFont(new Font("Arial", Font.ITALIC, 12));
        textCPF.setToolTipText("Insira o CPF aqui");
        textCPF.setVisible(true);
        add(textCPF);

        // Label com o texto: "CELULAR"
        JLabel labelContato = new JLabel();
        labelContato.setText("Contato:");
        labelContato.setBounds(30, 134, 70, 70);
        labelContato.setForeground(corLabel1);
        labelContato.setVisible(true);
        this.add(labelContato);

        // Caixa para inserir o celular

        textContato.setBounds(170, 158, 300, 25);
        textContato.setFont(new Font("Arial", Font.ITALIC, 12));
        textContato.setToolTipText("Insira o celular aqui");
        textContato.setVisible(true);
        this.add(textContato);

        // --------------------------------------------------

        // Criação do botão de cadastro

        salvar.setVisible(true);
        salvar.setText("Salvar");
        salvar.setBounds(185, 250, 120, 40);
        salvar.setIcon(iconSave);
        salvar.setHorizontalAlignment(SwingConstants.CENTER);
        salvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                salvar.setEnabled(false); // Desabilita o botão

                sNome = textName.getText();
                clientePF.setNome(sNome);

                sCPF = textCPF.getText();
                clientePF.setCPF(sCPF);

                sContato = textContato.getText();
                clientePF.setContato(sContato);

                new TelaAvisoPF(clientePF);
                NovoRegistroPF.this.dispose();
                new NovoRegistro();
                
            }

        });
        this.add(salvar);

        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    NovoRegistroPF.this.dispose();
                    new NovoRegistro();
            }
    });
        this.add(voltar);
    }

    // ----------MÉTODO DE CRIAÇÃO DE EVENTOS----------
    public void actionPerformed(ActionEvent e) {

    }

}
