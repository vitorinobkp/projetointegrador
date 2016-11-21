package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class Sistema {

	private JFrame frmPiEstoque;
	private JLabel lblControleDeEstoque;
	private JTextField txtCodigo;
	private JTextField txtProduto;
	private JTextField txtQuantidade;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema window = new Sistema();
					window.frmPiEstoque.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sistema() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPiEstoque = new JFrame();
		frmPiEstoque.setTitle("PI - Estoque");
		frmPiEstoque.setBounds(100, 100, 591, 502);
		frmPiEstoque.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPiEstoque.getContentPane().setLayout(null);

		lblControleDeEstoque = new JLabel("Controle de Estoque");
		lblControleDeEstoque.setBounds(133, 11, 275, 53);
		lblControleDeEstoque.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblControleDeEstoque.setHorizontalAlignment(SwingConstants.CENTER);
		frmPiEstoque.getContentPane().add(lblControleDeEstoque);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 70, 552, 345);
		frmPiEstoque.getContentPane().add(tabbedPane);

		JPanel pnlCadastro = new JPanel();
		tabbedPane.addTab("Cadastro", null, pnlCadastro, null);
		pnlCadastro.setLayout(null);

		JLabel lblCdigo = new JLabel("C\u00F3digo: ");
		lblCdigo.setBounds(10, 11, 46, 14);
		pnlCadastro.add(lblCdigo);

		txtCodigo = new JTextField();
		txtCodigo.setBounds(95, 8, 264, 20);
		pnlCadastro.add(txtCodigo);
		txtCodigo.setColumns(10);

		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setBounds(10, 36, 70, 14);
		pnlCadastro.add(lblProduto);

		JLabel lblPreo = new JLabel("Pre\u00E7o: ");
		lblPreo.setBounds(10, 61, 46, 14);
		pnlCadastro.add(lblPreo);

		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(10, 86, 70, 14);
		pnlCadastro.add(lblQuantidade);

		JPanel pnlCopatSoft = new JPanel();
		pnlCopatSoft.setBorder(new TitledBorder(null, "Compatibilidade de Software", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pnlCopatSoft.setBounds(369, 11, 168, 100);
		pnlCadastro.add(pnlCopatSoft);
		pnlCopatSoft.setLayout(null);

		JCheckBox chckbxNewCheckBox = new JCheckBox("GNU/Linux");
		chckbxNewCheckBox.setBounds(6, 21, 97, 23);
		pnlCopatSoft.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Windows");
		chckbxNewCheckBox_1.setBounds(6, 47, 97, 23);
		pnlCopatSoft.add(chckbxNewCheckBox_1);

		JCheckBox chckbxOutros = new JCheckBox("Outros");
		chckbxOutros.setBounds(6, 73, 97, 23);
		pnlCopatSoft.add(chckbxOutros);

		JPanel CompatHard = new JPanel();
		CompatHard.setBorder(new TitledBorder(null, "Compatibilidade de Hardware", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		CompatHard.setBounds(369, 141, 168, 118);
		pnlCadastro.add(CompatHard);
		CompatHard.setLayout(null);

		JComboBox cbModelo = new JComboBox();
		cbModelo.setEditable(true);
		cbModelo.setModel(new DefaultComboBoxModel(
				new String[] { "Selecione o modelo", "Socket 1156", "Socket 1155", "Socket 1150", "Socket 775" }));
		cbModelo.setBounds(10, 22, 148, 20);
		CompatHard.add(cbModelo);

		JComboBox cbSlot = new JComboBox();
		cbSlot.setEditable(true);
		cbSlot.setModel(new DefaultComboBoxModel(new String[] { "Selecione o slot", "DDR2", "DDR3", "DDR4" }));
		cbSlot.setBounds(10, 53, 148, 20);
		CompatHard.add(cbSlot);

		JComboBox cbEncapsulamento = new JComboBox();
		cbEncapsulamento.setEditable(true);
		cbEncapsulamento.setModel(
				new DefaultComboBoxModel(new String[] { "Selecione o encapsulamento", "DIP", "SOJ", "TSOP", "CSP" }));
		cbEncapsulamento.setBounds(10, 84, 148, 20);
		CompatHard.add(cbEncapsulamento);

		txtProduto = new JTextField();
		txtProduto.setBounds(95, 33, 264, 20);
		pnlCadastro.add(txtProduto);
		txtProduto.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(95, 108, 264, 151);
		pnlCadastro.add(textArea);

		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o: ");
		lblDescricao.setBounds(10, 108, 70, 14);
		pnlCadastro.add(lblDescricao);

		JFormattedTextField fTxtPreco = new JFormattedTextField();
		fTxtPreco.setBounds(95, 58, 264, 20);
		pnlCadastro.add(fTxtPreco);

		txtQuantidade = new JTextField();
		txtQuantidade.setBounds(95, 83, 264, 20);
		pnlCadastro.add(txtQuantidade);
		txtQuantidade.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(95, 283, 89, 23);
		pnlCadastro.add(btnSalvar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(270, 283, 89, 23);
		pnlCadastro.add(btnExcluir);

		JPanel pnlVendas = new JPanel();
		tabbedPane.addTab("Vendas", null, pnlVendas, null);
		pnlVendas.setLayout(null);

		JPanel pnlProduto = new JPanel();
		pnlProduto.setBorder(new TitledBorder(null, "Produto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlProduto.setBounds(10, 11, 527, 153);
		pnlVendas.add(pnlProduto);
		pnlProduto.setLayout(null);

		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setBounds(10, 24, 51, 14);
		pnlProduto.add(lblNewLabel);

		textField_3 = new JTextField();
		textField_3.setBounds(59, 21, 86, 20);
		pnlProduto.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblProduto_1 = new JLabel("Produto: ");
		lblProduto_1.setBounds(155, 24, 65, 14);
		pnlProduto.add(lblProduto_1);

		textField_4 = new JTextField();
		textField_4.setBounds(202, 21, 188, 20);
		pnlProduto.add(textField_4);
		textField_4.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(400, 20, 109, 23);
		pnlProduto.add(btnPesquisar);

		table_1 = new JTable();
		table_1.setBounds(10, 54, 499, 79);
		pnlProduto.add(table_1);

		JPanel pnlItensVendas = new JPanel();
		pnlItensVendas.setBorder(
				new TitledBorder(null, "Itens da Venda", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pnlItensVendas.setBounds(10, 175, 527, 107);
		pnlVendas.add(pnlItensVendas);
		pnlItensVendas.setLayout(null);

		table = new JTable();
		table.setBounds(10, 17, 499, 79);
		pnlItensVendas.add(table);

		JButton btnFinalizar = new JButton("Finalizar Venda");
		btnFinalizar.setBounds(413, 283, 124, 23);
		pnlVendas.add(btnFinalizar);

		JPanel pnlRelatorios = new JPanel();
		tabbedPane.addTab("Relat\u00F3rios", null, pnlRelatorios, null);
		pnlRelatorios.setLayout(null);

		JButton btnRelatorioVendas = new JButton("Relat\u00F3rio de Vendas");
		btnRelatorioVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRelatorioVendas.setBounds(10, 11, 164, 23);
		pnlRelatorios.add(btnRelatorioVendas);

		JButton btnRelatorioClientes = new JButton("Relat\u00F3rio de Clientes");
		btnRelatorioClientes.setBounds(184, 11, 164, 23);
		pnlRelatorios.add(btnRelatorioClientes);

		JButton button = new JButton("Relat\u00F3rio de Clientes");
		button.setBounds(358, 11, 164, 23);
		pnlRelatorios.add(button);

		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(473, 426, 89, 23);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frmPiEstoque.getContentPane().add(btnSair);
	}
}
