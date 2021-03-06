package modelos;

import java.awt.Component;
import java.util.ArrayList;

public class Dono extends Pessoa {

	private final ArrayList<Animal> animais;

	public Dono() { // construtor do Dono que recebe os atributos da classe abstrata Pessoa
		super();
		this.animais = new ArrayList<>();
	}

	public Dono(String nome, String endereco, String telefone, String CPF) { // construtor que recebe atributos
																				// especificos de Pessoa
		super(nome, endereco, telefone, CPF);
		this.animais = new ArrayList<>();

	}

	/*
	 * public Animal buscarAnimal(String nome) { nome = Scan.nextLine(); for (Animal
	 * animal : animais) { if (animal.getNome().equals(nome)) {
	 * System.out.println("Animal encontrado"); return animal;
	 * 
	 * } } return null; }
	 * 
	 * public void removerAnimal(Animal animal) { if (this.animais.contains(animal))
	 * { this.animais.remove(animal); }
	 * 
	 * }
	 */
	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public Component getDono() {
		return null;
	}

	public void remove(int donoSelecionado) {
	}

	public int size() {
		return 0;
	}

	public Pessoa get(int i) {
		return null;
	}
}
