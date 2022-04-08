package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class BuscaAnimalVisual extends JFrame implements ActionListener {

	/**
	 * Variaveis para a criacao da Interface.
	 */
	private final JLabel mensagemInicial;
	private final JLabel rotuloBusca;
	private final JTextField petBuscado;
	private final JButton botaoBuscar;
	private final JLabel rotuloEncontrado;
	private final JComboBox<String> mostraPet;
	private final JLabel rotuloProximaAcao;
	private final JButton botaoVisualizar;
	private final JButton botaoEditar;
	private final JButton botaoDeletar;
	private final JButton botaoVoltar;

	public BuscaAnimalVisual() {
		getContentPane().setLayout(null);
		/**
		 * Titulo da ferramenta.
		 */
		mensagemInicial = new JLabel("Ferramenta de busca");
		mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);
		/**
		 * Afirma o nome a ser buscado.
		 */
		rotuloBusca = new JLabel("Nome do pet a ser buscado");
		rotuloBusca.setBounds(10, 40, 143, 14);
		getContentPane().add(rotuloBusca);
		/**
		 * Campo de texto para digitar o nome a ser buscado.
		 */
		petBuscado = new JTextField();
		petBuscado.setBounds(212, 37, 86, 20);
		petBuscado.setColumns(10);
		getContentPane().add(petBuscado);
		/**
		 * Botao para buscar o nome digitado
		 */
		botaoBuscar = new JButton("Buscar");
		botaoBuscar.setBounds(335, 36, 89, 23);
		botaoBuscar.addActionListener(this);
		getContentPane().add(botaoBuscar);
		/**
		 * Titulo que diz que e a ferramenta para buscar os pets com esse nome
		 */
		rotuloEncontrado = new JLabel("Pets com esse nome");
		rotuloEncontrado.setBounds(10, 109, 143, 14);
		getContentPane().add(rotuloEncontrado);
		/**
		 * Lista os pets com esse nome
		 */
		mostraPet = new JComboBox<String>();
		mostraPet.setBounds(212, 105, 86, 22);
		getContentPane().add(mostraPet);
		/**
		 * Pergunta a proxima acao.
		 */
		rotuloProximaAcao = new JLabel("O que deseja fazer");
		rotuloProximaAcao.setBounds(10, 190, 143, 14);
		getContentPane().add(rotuloProximaAcao);
		/**
		 * Leva para visualizar os dados.
		 */
		botaoVisualizar = new JButton("Visualizar dados ");
		botaoVisualizar.setBounds(10, 241, 143, 23);
		botaoVisualizar.addActionListener(this);
		getContentPane().add(botaoVisualizar);
		/**
		 * Leva para a edicao de dados.
		 */
		botaoEditar = new JButton("Editar Dados");
		botaoEditar.setBounds(252, 241, 143, 23);
		botaoEditar.addActionListener(this);
		getContentPane().add(botaoEditar);
		/**
		 * Leva para a delecao de dados.
		 */
		botaoDeletar = new JButton("Deletar dados");
		botaoDeletar.setBounds(10, 309, 143, 23);
		botaoDeletar.addActionListener(this);
		getContentPane().add(botaoDeletar);
		/**
		 * Volta para a tela de menu
		 */
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.setBounds(252, 309, 143, 23);
		botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);
		/**
		 * Coloca a tela como nao redimensionavel, que termine a tela ao fecha-la e seu
		 * tamanho.
		 */
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(450, 450);
		this.setResizable(false);

	}

	public JComboBox<String> getMostraPet() {
		return mostraPet;
	}

	public JButton getBotaoVisualizar() {
		return botaoVisualizar;
	}

	public JButton getBotaoEditar() {
		return botaoEditar;
	}

	public JButton getBotaoDeletar() {
		return botaoDeletar;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public JTextField getPetBuscado() {
		return petBuscado;
	}

	public JButton getBotaoBuscar() {
		return botaoBuscar;
	}

	/**
	 * Metodo para pegar a acao de clicar em um botao.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}