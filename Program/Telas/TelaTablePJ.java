package Program.Telas;

import Program.Classes.ClientePJ;
import Program.ConexãoBD.DAOCliPj;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaTablePJ extends JFrame implements ActionListener {

    JButton voltar = new JButton();
    JButton jbExcluir = new JButton("Excluir");
    JButton jbAlterar = new JButton("Alterar");
    JTable table;
 
    public ImageIcon iconSave = new ImageIcon("Images/save.png");
    public ImageIcon iconPF = new ImageIcon("Images/PF.png");
    public ImageIcon iconPJ = new ImageIcon("Images/PJ.png");
    public ImageIcon iconBack = new ImageIcon("Images/voltar.png");
    public ImageIcon icone = new ImageIcon("Images/iconePrincipal.png");
    public ImageIcon iconAlterar = new ImageIcon("Images/alterar.png");

    //------------------------Criação de Cores-----------------------------------------------------------
    public Color corFundo1 = new Color(27, 38, 44);         //definindo a cor de fundo em um objeto
    public Color corPanel = new Color(15, 76, 117);
    public Color corLabel1 = new Color(187, 225, 250);     //definindo a cor de fundo em um objeto
    public Color corLabel2 = new Color(200,200,200);    //definindo a cor de fundo em um objeto
    public ImageIcon iconCancel = new ImageIcon("Images/cancel.png");

    public TelaTablePJ() {
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
        jbAlterar.setIcon(iconAlterar);
        jbAlterar.setAlignmentX(LEFT_ALIGNMENT);
        jbAlterar.addActionListener(this);
        // jbAlterar.setIcon(iconAlterar);
        add(jbAlterar);

        // Criação do DefaultTableModel com as colunas desejadas
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Razão Social");
        model.addColumn("CNPJ");
        model.addColumn("Email");
        model.addColumn("Contato");
        model.addColumn("Responsável");
        

        // Criação do JTable com o DefaultTableModel
        table = new JTable(model);
        

        // Criação do JScrollPane com o JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(75, 55, 900, 340);
        scrollPane.setAutoscrolls(true);
        
        
        add(scrollPane);

        // Preenchimento do DefaultTableModel com os dados do banco de dados
        DAOCliPj daoCPJ = new DAOCliPj();
        List<ClientePJ> clientes = daoCPJ.lista();
        for (ClientePJ cliente : clientes) {
            Object[] rowData = new Object[5];
            rowData[0] = cliente.getRazao();
            rowData[1] = cliente.getCnpj();
            rowData[2] = cliente.getEmail();
            rowData[3] = cliente.getContato();
            rowData[4] = cliente.getResponsavel();
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
                DAOCliPj daoCPJ = new DAOCliPj();
                List<ClientePJ> clientes = daoCPJ.lista();
                ClientePJ cliente = clientes.get(selectedRow);
                daoCPJ.excluir(cliente);
            }
        } else if (e.getSource() == jbAlterar) {
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                DAOCliPj daoCPJ = new DAOCliPj();
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                ClientePJ cliente = new ClientePJ();
                cliente.setRazao((String) model.getValueAt(selectedRow, 0));
                cliente.setCnpj((String) model.getValueAt(selectedRow, 1));
                cliente.setEmail((String) model.getValueAt(selectedRow, 2));
                cliente.setContato((String) model.getValueAt(selectedRow, 3));
                cliente.setResponsavel((String) model.getValueAt(selectedRow, 4));


                // Abre uma nova janela de edição para o cliente selecionado
                TelaAlteracaoPJ telaAlteracao = new TelaAlteracaoPJ(cliente);
                telaAlteracao.setVisible(true);
                telaAlteracao.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                        // Verifica se a janela de edição foi fechada com as alterações salvas
                        if (telaAlteracao.isSaved()) {
                            ClientePJ clienteAlterado = telaAlteracao.getCliente();
                            // Atualiza os dados no banco de dados
                            daoCPJ.altera(clienteAlterado, cliente.getRazao());

                            // Atualiza a tabela com os novos dados
                            model.setValueAt(clienteAlterado.getRazao(), selectedRow, 0);
                            model.setValueAt(clienteAlterado.getCnpj(), selectedRow, 1);
                            model.setValueAt(clienteAlterado.getEmail(), selectedRow, 2);
                            model.setValueAt(clienteAlterado.getContato(), selectedRow, 3);
                            model.setValueAt(clienteAlterado.getResponsavel(), selectedRow, 4);
                        }
                    }
                });
            }
        }
    }
}