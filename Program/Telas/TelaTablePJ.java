package Program.Telas;

import Program.Classes.ClientePJ;
import Program.ConexãoBD.DAOCliPj;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaTablePJ extends Tela implements ActionListener {

    JButton voltar = new JButton();
    JButton jbExcluir = new JButton("Excluir");
    JButton jbAlterar = new JButton("Alterar");
    JTable table;

    public ImageIcon iconCancel = new ImageIcon("Images/cancel.png");
    public ImageIcon iconAlterar = new ImageIcon("Images/enviar-bd.png");

    public TelaTablePJ() {
        // Configurações do JFrame
        setTitle("Resultado da Busca");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(corFundo1);
        setSize(700, 400);

        // Configurações do Botão voltar
        voltar.setIcon(iconBack);
        voltar.setBounds(10, 15, 50, 30);
        voltar.addActionListener(this);
        this.add(voltar);

        // Configurações do Botão excluir
        jbExcluir.setBounds(80, 15, 100, 30);
        jbExcluir.addActionListener(this);
        jbExcluir.setIcon(iconCancel);
        add(jbExcluir);

        // Configurações do Botão alterar
        jbAlterar.setBounds(190, 15, 100, 30);
        jbAlterar.addActionListener(this);
        jbAlterar.setIcon(iconAlterar);
        add(jbAlterar);

        // Criação do DefaultTableModel com as colunas desejadas
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Razão Social");
        model.addColumn("CNPJ");
        model.addColumn("Email");
        model.addColumn("Contato");
        model.addColumn("Responsável Legal");

        // Criação do JTable com o DefaultTableModel
        table = new JTable(model);

        // Criação do JScrollPane com o JTable
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(25, 65, 625, 250);
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

                daoCPJ.altera(cliente, getName());
            }
        }
    }
}
