package Program.Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import Program.Classes.ClientePJ;

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
        // Intancia de Variáveis para armazenamento das Strings
        private String sRazao, sCnpj, sEmail, sContato, sResponsavelLegal;
        // Intancia de um objeto da classe Cliente PJ
        public ClientePJ clientePJ = new ClientePJ();

        public NovoRegistroPJ() {
                this.setTitle("Cadastro Pessoa Jurídica");
                setIconImage(icone.getImage());
                
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
                salvar.addActionListener(new ActionListener() { // MÉTODO DE CRIAÇÃO DE EVENTO DO BOTÃO SALVAR
                        
                        public void actionPerformed(ActionEvent e) {
                                salvar.setEnabled(false); // Desabilita o botão

                                sRazao = jtfRazao.getText();
                                clientePJ.setRazao(sRazao);

                                sCnpj = jtfCnpj.getText();
                                clientePJ.setCnpj(sCnpj);

                                sEmail = jtfEmail.getText();
                                clientePJ.setEmail(sEmail);

                                sContato = jtfContato.getText();
                                clientePJ.setContato(sContato);

                                sResponsavelLegal = jtfResponsavelLegal.getText();
                                clientePJ.setResponsavel(sResponsavelLegal);

                                NovoRegistroPJ.this.dispose();                                
                                new TelaAvisoPJ(clientePJ);
                                         
                        }
                });
                this.add(salvar);

                voltar.setIcon(iconBack);
                voltar.setBounds(10, 15, 40, 30);
                // ----------MÉTODO DE CRIAÇÃO DE EVENTOS----------
                voltar.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                NovoRegistroPJ.this.dispose();
                                new NovoRegistro();
                        }
                });
                this.add(voltar);

        }

        @Override
        public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }

}
