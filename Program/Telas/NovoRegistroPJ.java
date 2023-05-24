package Program.Telas;

//import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NovoRegistroPJ extends Tela implements ActionListener {
        JButton voltar = new JButton();
        JButton salvar = new JButton("Salvar");

        public NovoRegistroPJ() {
                this.setTitle("Cadastro Pessoa Jurídica");

                // ------------------------------------------------------------------\\

                // Label com o nome "RAZÃO SOCIAL"
                JLabel lRazao = new JLabel();
                lRazao.setText("Razão Social:");
                lRazao.setBounds(30, 66, 300, 70);
                lRazao.setForeground(corLabel1);

                this.add(lRazao);

                // Caixa para inserir Razão Social
                JTextField jtfRazao = new JTextField();
                jtfRazao.setBounds(170, 90, 300, 25);
                jtfRazao.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfRazao.setToolTipText("Insira a razão social aqui");
                this.add(jtfRazao);

                // ------------------------------------------------------------------

                // Label com o texto: "CNPJ"
                JLabel lCnpj = new JLabel();
                lCnpj.setText("CNPJ:");
                lCnpj.setBounds(30, 100, 120, 70);
                lCnpj.setForeground(corLabel1);

                this.add(lCnpj);

                // Caixa para inserir o CNPJ
                JTextField jtfCnpj = new JTextField();
                jtfCnpj.setBounds(170, 124, 300, 25);
                jtfCnpj.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfCnpj.setToolTipText("Insira o CNPJ aqui");
                this.add(jtfCnpj);

                // ------------------------------------------------------------------

                // Label com o texto: "E-MAIL"
                JLabel lEmail = new JLabel();
                lEmail.setText("E-mail:");
                lEmail.setBounds(30, 130, 120, 70);
                lEmail.setForeground(corLabel1);

                this.add(lEmail);

                // Caixa para inserir o E-mail
                JTextField jtfEmail = new JTextField();
                jtfEmail.setBounds(170, 158, 300, 25);
                jtfEmail.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfEmail.setToolTipText("Insira o email aqui");
                this.add(jtfEmail);

                // ------------------------------------------------------------------

                // Label com o texto: "CONTATO"
                JLabel lContato = new JLabel();
                lContato.setText("Contato:");
                lContato.setBounds(30, 168, 120, 70);
                lContato.setForeground(corLabel1);

                this.add(lContato);

                // Caixa para inserir o Contato
                JTextField jtfContato = new JTextField();
                jtfContato.setBounds(170, 192, 300, 25);
                jtfContato.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfContato.setToolTipText("Insira o contato aqui");
                this.add(jtfContato);

                // ------------------------------------------------------------------

                // Label com o texto: "RESPONSAVEL LEGAL"
                JLabel lResponsavelLegal = new JLabel();
                lResponsavelLegal.setText("Responsável legal:");
                lResponsavelLegal.setBounds(30, 202, 300, 70);
                lResponsavelLegal.setForeground(corLabel1);

                this.add(lResponsavelLegal);

                // Caixa para inserir o Responsável legal
                JTextField jtfResponsavelLegal = new JTextField();
                jtfResponsavelLegal.setBounds(170, 226, 300, 25);
                jtfResponsavelLegal.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfResponsavelLegal.setToolTipText("Insira o Responsável legal aqui");
                this.add(jtfResponsavelLegal);

                // ------------------------

                // Criação de botoes

                salvar.setVisible(true);
                salvar.setBounds(175, 285, 120, 40);
                salvar.setIcon(iconSave);
                salvar.setHorizontalAlignment(SwingConstants.CENTER);
                this.add(salvar);

                voltar.setIcon(iconBack);
                voltar.setBounds(10, 15, 40, 30);
                voltar.addActionListener(this);
                this.add(voltar);
        }

        // ----------MÉTODO DE CRIAÇÃO DE EVENTOS----------
        public void actionPerformed(ActionEvent e) {
                if (e.getSource() == voltar) {
                        this.dispose();
                        NovoRegistro novoRegistro = new NovoRegistro();

                }
        }
}
