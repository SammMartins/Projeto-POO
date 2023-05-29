package Program.Telas;

import Program.Classes.ClientePF;
import Program.ConexãoBD.DAOCliPf;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaTablePF extends JFrame implements ActionListener {

    JButton voltar = new JButton();
    JButton jbExcluir = new JButton("Excluir");
    JButton jbAlterar = new JButton("Alterar");
    JTable table;

    public ImageIcon iconSave = new ImageIcon("Images/save.png");
    public ImageIcon iconPF = new ImageIcon("Images/PF.png");
    public ImageIcon iconPJ = new ImageIcon("Images/PJ.png");
    public ImageIcon iconBack = new ImageIcon("Images/voltar.png");
    public ImageIcon iconAlterar = new ImageIcon("Images/alterar.png");

        //------------------------Criação de Cores-----------------------------------------------------------
        public Color corFundo1 = new Color(27, 38, 44);         //definindo a cor de fundo em um objeto
        public Color corPanel = new Color(15, 76, 117);
        public Color corLabel1 = new Color(187, 225, 250);     //definindo a cor de fundo em um objeto
        public Color corLabel2 = new Color(200,200,200);    //definindo a cor de fundo em um objeto
        public ImageIcon iconCancel = new ImageIcon("Images/cancel.png");
        public ImageIcon icone = new ImageIcon("Images/iconePrincipal.png");
    public TelaTablePF() {
        setTitle("Resultado da Busca");
        setIconImage(icone.getImage());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(corFundo1);
        setSize(1000, 500);
        setLocationRelativeTo(null);

        JLabel devs = new JLabel("Desenvolvido por: Bruno Cardoso Monteiro, Caio Chaves Lima, José Carlos Neto Soares Dantas, ");
        devs.setForeground(corLabel2);
        devs.setFont(new Font("Arial", Font.ITALIC, 9 ));
        devs.setBounds(70, 385, 1000, 100);
        devs.setVisible(true);
        this.add(devs);

        JLabel devs2 = new JLabel("Rafael Rodrigues Souza, Sammuel Gusmão Martins - UniFTC");
        devs2.setForeground(corLabel2);
        devs2.setFont(new Font("Arial", Font.ITALIC, 9 ));
        devs2.setBounds(150, 395, 1000, 100);
        devs2.setVisible(true);
        this.add(devs2);

    
        JPanel panel = new JPanel();
        panel.setBackground(corPanel);
        panel.setVisible(true);
        panel.setBounds(0, 0, 60, 1000);
        this.add(panel);
        


        // Configurações do Botão voltar
        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 40, 30);
        voltar.addActionListener(this);
        this.add(voltar);

        // Configurações do Botão excluir
        jbExcluir.setBounds(850, 405, 110, 30);
        jbExcluir.setHorizontalTextPosition(SwingConstants.LEFT);
        jbExcluir.addActionListener(this);
        jbExcluir.setIcon(iconCancel);

        this.add(jbExcluir);

        // Configurações do Botão alterar
        jbAlterar.setBounds(730, 405, 110, 30);
        jbAlterar.addActionListener(this);
        jbAlterar.setIcon(iconAlterar);
        add(jbAlterar);

        // Criação do DefaultTableModel com as colunas desejadas
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nome");
        model.addColumn("CPF");
        model.addColumn("Contato");

        // Criação do JTable com o DefaultTableModel
        table = new JTable(model);

        // Criação do JScrollPane com o JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(75, 55, 900, 340);
        scrollPane.setAutoscrolls(true);

        this.add(scrollPane);

        // Preenchimento do DefaultTableModel com os dados do banco de dados
        DAOCliPf daoCPF = new DAOCliPf();
        List<ClientePF> clientes = daoCPF.lista();
        for (ClientePF cliente : clientes) {
            Object[] rowData = new Object[3];
            rowData[0] = cliente.getNome();
            rowData[1] = cliente.getCPF();
            rowData[2] = cliente.getContato();
            model.addRow(rowData);
        }
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == voltar) {
            this.dispose();
            new Manuntencao();
        } else if (e.getSource() == jbExcluir) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(selectedRow);

                // Excluir o objeto no banco de dados
                DAOCliPf daoCPF = new DAOCliPf();
                List<ClientePF> clientes = daoCPF.lista();
                ClientePF cliente = clientes.get(selectedRow);
                daoCPF.excluir(cliente);
            }
        } else if (e.getSource() == jbAlterar) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                DAOCliPf daoCPF = new DAOCliPf();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                ClientePF cliente = new ClientePF();
                cliente.setNome((String) model.getValueAt(selectedRow, 0));
                cliente.setCPF((String) model.getValueAt(selectedRow, 1));
                cliente.setContato((String) model.getValueAt(selectedRow, 2));

                String cpf = cliente.getCPF();
                // Abre uma nova janela de edição para o cliente selecionado
                TelaAlteracaoPF telaAlteracao = new TelaAlteracaoPF(cliente);
                telaAlteracao.setVisible(true);
                telaAlteracao.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        // Verifica se a janela de edição foi fechada com as alterações salvas
                        if (telaAlteracao.isSaved()) {
                            ClientePF clienteAlterado = telaAlteracao.getCliente();
                            // Atualiza os dados no banco de dados
                            daoCPF.altera(clienteAlterado, cliente.getCPF());

                            // Atualiza a tabela com os novos dados
                            model.setValueAt(clienteAlterado.getNome(), selectedRow, 0);
                            model.setValueAt(clienteAlterado.getCPF(), selectedRow, 1);
                            model.setValueAt(clienteAlterado.getContato(), selectedRow, 2);
                        }
                    }
                });
            }
        }
    }
}
    
