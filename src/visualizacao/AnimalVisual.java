package visualizacao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import controles.AnimalControle;

public class AnimalVisual extends JFrame implements ActionListener {
	private static final long serialVersionUID = 6754115315165831479L;

	private final JLabel mensagemInicial;
	private final JButton botaoCadastrarAnimal;
	private final JButton botaoBuscarPet;
	private final JButton botaoVisualizarPet;
	private final JButton botaoEditarPet;
	private final JButton botaoDeletarPet;
	private final JButton botaoVoltar;
	private final AnimalControle controle;

	public AnimalVisual() {
		getContentPane().setLayout(null);

		controle = new AnimalControle(this);

		this.mensagemInicial = new JLabel("O que deseja fazer");
		this.mensagemInicial.setHorizontalAlignment(SwingConstants.CENTER);
		this.mensagemInicial.setBounds(0, 0, 434, 14);
		getContentPane().add(mensagemInicial);

		this.botaoCadastrarAnimal = new JButton("Cadastrar Pet");
		this.botaoCadastrarAnimal.setBounds(42, 25, 115, 23);
		this.botaoCadastrarAnimal.addActionListener(this);
		getContentPane().add(botaoCadastrarAnimal);

		this.botaoBuscarPet = new JButton("Buscar Pet");
		this.botaoBuscarPet.setBounds(270, 25, 115, 23);
		this.botaoBuscarPet.addActionListener(this);
		getContentPane().add(botaoBuscarPet);

		this.botaoVisualizarPet = new JButton("Visualizar Pet");
		this.botaoVisualizarPet.setBounds(42, 95, 115, 23);
		this.botaoVisualizarPet.addActionListener(this);
		getContentPane().add(botaoVisualizarPet);

		this.botaoEditarPet = new JButton("Editar Pet");
		this.botaoEditarPet.setBounds(270, 95, 115, 23);
		this.botaoEditarPet.addActionListener(this);
		getContentPane().add(botaoEditarPet);

		this.botaoDeletarPet = new JButton("Deletar Pet");
		this.botaoDeletarPet.setBounds(42, 164, 115, 23);
		this.botaoDeletarPet.addActionListener(this);
		getContentPane().add(botaoDeletarPet);

		this.botaoVoltar = new JButton("Voltar");
		this.botaoVoltar.setBounds(270, 164, 115, 23);
		this.botaoVoltar.addActionListener(this);
		getContentPane().add(botaoVoltar);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 400);
		this.setResizable(false);

	}

	public JButton getBotaoCadastrarAnimal() {
		return botaoCadastrarAnimal;
	}

	public JButton getBotaoBuscarPet() {
		return botaoBuscarPet;
	}

	public JButton getBotaoVisualizarPet() {
		return botaoVisualizarPet;
	}

	public JButton getBotaoEditarPet() {
		return botaoEditarPet;
	}

	public JButton getBotaoDeletarPet() {
		return botaoDeletarPet;
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		controle.executaBotao((JButton) e.getSource());

	}
}
