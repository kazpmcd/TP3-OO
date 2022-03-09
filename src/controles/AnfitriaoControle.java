package controles;

import data.Dados;
import modelos.Anfitriao;
import util.Scan;

public class AnfitriaoControle {

  public void cadastrarAnfitriao() {
    String nome, endereco, telefone, CPF;

    System.out.println("Nome do Anfitriao:");
    nome = Scan.nextLine();

    System.out.println("Endereco do Anfitriao:");
    endereco = Scan.nextLine();

    System.out.println("Telefone do Anfitriao:");
    telefone = Scan.nextLine();

    System.out.println("CPF do Anfitriao:");
    CPF = Scan.nextLine();

    Anfitriao anfitriao = new Anfitriao(nome, endereco, telefone, CPF);
    Dados.getAnfitriao().add(anfitriao);
  }

}