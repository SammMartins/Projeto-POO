package Program.Telas;

import Program.Classes.ClientePJ;
import Program.ConexãoBD.DAOCliPj;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAlteracaoPJ extends JFrame implements ActionListener {
    public Color corFundo1 = new Color(27, 38, 44);         //definindo a cor de fundo em um objeto
    public Color corPanel = new Color(15, 76, 117);
    public Color corLabel1 = new Color(187, 225, 250);     //definindo a cor de fundo em um objeto
    public Color corLabel2 = new Color(200,200,200); 

    private ClientePJ cliente;
    private boolean isSaved;
    private DAOCliPj dao;

    // Campos de texto para os atributos do ClientePJ
    private JTextField tfRazao;
    private JTextField tfCnpj;
    private JTextField tfEmail;
    private JTextField tfContato;
    private JTextField tfResponsavel;

    // Botões
    private JButton btnSalvar;
    private JButton btnCancelar;

    public TelaAlteracaoPJ(ClientePJ cliente) {
           //definindo a cor de fundo em um objeto

        this.cliente = cliente;
        this.isSaved = false;
        this.dao = new DAOCliPj();

        // Configurações do JFrame
        setTitle("Alterar Cliente PJ");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(corFundo1);
        setSize(400, 300);

        // Labels
        JLabel lblRazao = new JLabel("Razão Social:");
        lblRazao.setBounds(20, 20, 100, 20);
        add(lblRazao);

        JLabel lblCnpj = new JLabel("CNPJ:");
        lblCnpj.setBounds(20, 50, 100, 20);
        add(lblCnpj);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 80, 100, 20);
        add(lblEmail);

        JLabel lblContato = new JLabel("Contato:");
        lblContato.setBounds(20, 110, 100, 20);
        add(lblContato);

        JLabel lblResponsavel = new JLabel("Responsável:");
        lblResponsavel.setBounds(20, 140, 100, 20);
        add(lblResponsavel);

        // Campos de texto
        tfRazao = new JTextField(cliente.getRazao());
        tfRazao.setBounds(130, 20, 200, 20);
        add(tfRazao);

        tfCnpj = new JTextField(cliente.getCnpj());
        tfCnpj.setBounds(130, 50, 200, 20);
        add(tfCnpj);

        tfEmail = new JTextField(cliente.getEmail());
        tfEmail.setBounds(130, 80, 200, 20);
        add(tfEmail);

        tfContato = new JTextField(cliente.getContato());
        tfContato.setBounds(130, 110, 200, 20);
        add(tfContato);

        tfResponsavel = new JTextField(cliente.getResponsavel());
        tfResponsavel.setBounds(130, 140, 200, 20);
        add(tfResponsavel);

        // Botões
        btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(120, 190, 80, 30);
        btnSalvar.addActionListener(this);
        add(btnSalvar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(220, 190, 100, 30);
        btnCancelar.addActionListener(this);
        add(btnCancelar);
    }

    public ClientePJ getCliente() {
        cliente.setRazao(tfRazao.getText());
        cliente.setCnpj(tfCnpj.getText());
        cliente.setEmail(tfEmail.getText());
        cliente.setContato(tfContato.getText());
        cliente.setResponsavel(tfResponsavel.getText());
        return cliente;
    }

    public boolean isSaved() {
        return isSaved;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalvar) {
            ClientePJ clienteAlterado = getCliente();
            dao.altera(clienteAlterado, cliente.getRazao());
            isSaved = true;
            dispose();
        } else if (e.getSource() == btnCancelar) {
            dispose();
        }
    }
}
