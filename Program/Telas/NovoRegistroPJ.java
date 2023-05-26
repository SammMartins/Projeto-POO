package Program.Telas;

//import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class NovoRegistroPJ extends Tela implements ActionListener {
        // Instancia de botoes
        JButton voltar = new JButton();
        JButton salvar = new JButton("Salvar");
        // Instancia de TextField
        JTextField jtfRazao = new JTextField();
        JTextField jtfCnpj = new JTextField();
        JTextField jtfEmail = new JTextField();
        JTextField jtfContato = new JTextField();
        JTextField jtfResponsavelLegal = new JTextField();
        
        private String sRazao,sCnpj,sEmail,sContato,sResponsavelLegal;
        

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
                jtfRazao.setBounds(170, 90, 300, 25);
                jtfRazao.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfRazao.setToolTipText("Insira a razão social aqui");
                jtfRazao.addActionListener(this);
                this.add(jtfRazao);

                // ------------------------------------------------------------------

                // Label com o texto: "CNPJ"
                JLabel lCnpj = new JLabel();
                lCnpj.setText("CNPJ:");
                lCnpj.setBounds(30, 100, 120, 70);
                lCnpj.setForeground(corLabel1);
                this.add(lCnpj);

                // Caixa para inserir o CNPJ
                jtfCnpj.setBounds(170, 124, 300, 25);
                jtfCnpj.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfCnpj.setToolTipText("Insira o CNPJ aqui");
                jtfCnpj.addActionListener(this);
                this.add(jtfCnpj);

                // ------------------------------------------------------------------

                // Label com o texto: "E-MAIL"
                JLabel lEmail = new JLabel();
                lEmail.setText("E-mail:");
                lEmail.setBounds(30, 130, 120, 70);
                lEmail.setForeground(corLabel1);
                this.add(lEmail);

                // Caixa para inserir o E-mail
                jtfEmail.setBounds(170, 158, 300, 25);
                jtfEmail.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfEmail.setToolTipText("Insira o email aqui");
                jtfEmail.addActionListener(this);
                this.add(jtfEmail);

                // ------------------------------------------------------------------

                // Label com o texto: "CONTATO"
                JLabel lContato = new JLabel();
                lContato.setText("Contato:");
                lContato.setBounds(30, 168, 120, 70);
                lContato.setForeground(corLabel1);
                this.add(lContato);

                // Caixa para inserir o Contato
                jtfContato.setBounds(170, 192, 300, 25);
                jtfContato.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfContato.setToolTipText("Insira o contato aqui");
                jtfContato.addActionListener(this);
                this.add(jtfContato);

                // ------------------------------------------------------------------

                // Label com o texto: "RESPONSAVEL LEGAL"
                JLabel lResponsavelLegal = new JLabel();
                lResponsavelLegal.setText("Responsável legal:");
                lResponsavelLegal.setBounds(30, 202, 300, 70);
                lResponsavelLegal.setForeground(corLabel1);
                this.add(lResponsavelLegal);

                // Caixa para inserir o Responsável legal
                jtfResponsavelLegal.setBounds(170, 226, 300, 25);
                jtfResponsavelLegal.setFont(new Font("Arial", Font.ITALIC, 12));
                jtfResponsavelLegal.setToolTipText("Insira o Responsável legal aqui");
                jtfResponsavelLegal.addActionListener(this);
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
                salvar.addActionListener(new ActionListener() { //MÉTODO DE CRIAÇÃO DE EVENTO DO BOTÃO SALVAR
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                sRazao = jtfRazao.getText();
                                sCnpj = jtfCnpj.getText();
                                sEmail = jtfEmail.getText();
                                sContato = jtfContato.getText();
                                sResponsavelLegal = jtfResponsavelLegal.getText();
                                new TelaAviso("Cliente Salvo com sucesso!");
                        }});
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
