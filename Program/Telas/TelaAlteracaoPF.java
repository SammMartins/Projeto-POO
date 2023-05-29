package Program.Telas;

import Program.Classes.ClientePF;
import Program.ConexãoBD.DAOCliPf;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAlteracaoPF extends JFrame implements ActionListener {
    public Color corFundo1 = new Color(27, 38, 44); // definindo a cor de fundo em um objeto
    public Color corPanel = new Color(15, 76, 117);
    public Color corLabel1 = new Color(187, 225, 250); // definindo a cor de fundo em um objeto
    public Color corLabel2 = new Color(200, 200, 200);

    private ClientePF cliente;
    private boolean isSaved;
    private DAOCliPf dao;
    
    public String antigoCpf;

    // Campos de texto para os atributos do ClientePF
    private JTextField tfNome;
    private JTextField tfCpf;
    private JTextField tfContato;

  

    // Botões
    private JButton btnSalvar;
    private JButton btnCancelar;

    public TelaAlteracaoPF(ClientePF cliente) {
        this.cliente = cliente;
        this.isSaved = false;
        this.dao = new DAOCliPf();
        antigoCpf = cliente.getCPF();

        // Configurações do JFrame
        setTitle("Alterar Cliente PF");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(corFundo1);
        setSize(400, 300);

        // Labels
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 100, 20);
        add(lblNome);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(20, 50, 100, 20);
        add(lblCpf);


        JLabel lblContato = new JLabel("Contato:");
        lblContato.setBounds(20, 80, 100, 20);
        add(lblContato);

        
        // Campos de texto
        tfNome = new JTextField(cliente.getNome());
        tfNome.setBounds(130, 20, 200, 20);
        add(tfNome);

        tfCpf = new JTextField(cliente.getCPF());
        tfCpf.setBounds(130, 50, 200, 20);
        add(tfCpf);


        tfContato = new JTextField(cliente.getContato());
        tfContato.setBounds(130, 80, 200, 20);
        add(tfContato);


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
    
    public ClientePF getCliente() {
        
        cliente.setNome(tfNome.getText());
        cliente.setCPF(tfCpf.getText());
        cliente.setContato(tfContato.getText());
        
        
        return cliente;
    }

    public boolean isSaved() {
        return isSaved;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalvar) {
            ClientePF clienteAlterado = getCliente();
            dao.altera(clienteAlterado, antigoCpf);
            isSaved = true;
            dispose();
        } else if (e.getSource() == btnCancelar) {
            dispose();
        }
    }

}
