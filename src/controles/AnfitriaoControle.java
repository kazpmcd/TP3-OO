package controles;

import data.Dados;
import modelos.Anfitriao;
import util.Scan;

public class AnfitriaoControle {

  public void cadastroAnfitriao() {
    String nome, endereco, telefone, CPF;

    System.out.println("Nome do Anfitriao:");
    nome = Scan.nextLine();

    System.out.println("Endereco do Anfitriao:");
    endereco = Scan.nextLine();

    System.out.println("Telefone do Anfitriao:");
    telefone = Scan.nextLine();

    System.out.println("CPF do Anfitriao:");
    CPF = Scan.nextLine();

    // Anfitriao anfitriao = new Anfitriao(nome, endereco, telefone, CPF);
    // anfitriao.getHospedagem();
    // .add(new Hospedagem(dataEntrada, dataSaida, informacao, respostaPagamento,
    // animal,
    // .add(new Pagamento(formaPagamento, valorPagamento);
    // Dados.getAnfitriao().add(anfitriao);
    // } else {
    Anfitriao anfitriao = new Anfitriao(nome, endereco, telefone, CPF);
    Dados.getAnfitriao().add(anfitriao);

  }

  public Anfitriao editaAnfitriao() { // editar atributo de um anfitriao
    String nome, endereco, telefone, CPF;
    System.out.println("Digite o nome do Anfitriao que deseja editar:");
    var anf1 = Scan.nextLine();
    for (Anfitriao anfitriao : Dados.getAnfitriao()) {
      if (anfitriao.getNome().equals(anf1)) {
        System.out.println(anfitriao);
        System.out.println("O que deseja editar no dono?");
        System.out.println("1 - Nome");
        System.out.println("2 - Endereco");
        System.out.println("3 - Telefone");
        System.out.println("4 - CPF");
        var edit = Scan.nextInt();

        // estrutura if-else para editar o atributo escolhido pelo usuario
        if (edit == 1) {
          System.out.println("Digite o novo nome:");
          nome = Scan.nextLine();
          anfitriao.setNome(nome);
          System.out.println("Nome editado para " + anfitriao.getNome());
        } else if (edit == 2) {
          System.out.println("Digite o novo endereco:");
          endereco = Scan.nextLine();
          anfitriao.setEndereco(endereco);
          System.out.println("Endereco editado para " + anfitriao.getEndereco());
        } else if (edit == 3) {
          System.out.println("Digite o novo telefone:");
          telefone = Scan.nextLine();
          anfitriao.setTelefone(telefone);
          System.out.println("Telefone editado para " + anfitriao.getTelefone());
        } else if (edit == 4) {
          System.out.println("Digite o novo CPF:");
          CPF = Scan.nextLine();
          anfitriao.setCPF(CPF);
          System.out.println("CPF editado para " + anfitriao.getCPF());
        } else if (anf1 != anfitriao.getNome()) {
          System.out.println("Anfitriao nao encontrado");
        }

      }
    }
    return null;
  }

  public Anfitriao deletaAnfitriao() { // delecao de anfitrioes
    String nome;
    System.out.println("Digite o nome do Anfitriao que deseja deletar:");
    nome = Scan.nextLine();

    for (Anfitriao anfitriao : Dados.getAnfitriao()) {
      if (anfitriao.getNome().equals(nome)) {
        System.out.println("Anfitriao encontrado!");
        System.out.println(anfitriao);
        System.out.println("Deseja deletar o Anfitriao? (s/n)");
        var resposta = Scan.nextLine();
        if (resposta == "s") {
          Dados.getAnfitriao().remove(anfitriao);
          System.out.println("Anfitriao deletado com sucesso!");
          return anfitriao;
        } else {
          System.out.println("Anfitriao nao deletado!");
        }
        if (anfitriao.getNome() != nome) {
          System.out.println("Anfitriao nao encontrado!");
          return null;
        }
      }
    }
    return null;

  }

  public void listaAnfitriao() { // listar os anfitrioes cadastrados
    for (Anfitriao anfitriao : Dados.getAnfitriao()) {
      System.out.println("Esses sao os Anfitrioes cadastrados:");
      System.out.println(anfitriao);
    }
  }

  public Anfitriao visualizaAnfitriaoCpf() { // metodo para visualizar um dono pelo CPF
    String buscaCPF;
    System.out.println("Digite o CPF no modelo xxx.xxx.xxx-xx:");
    buscaCPF = Scan.nextLine();

    for (Anfitriao anfitriao : Dados.getAnfitriao()) {
      if (anfitriao.getCPF().equals(buscaCPF)) {
        System.out.println(anfitriao);
        return anfitriao; // retorna o dono encontrado
      }
    }
    System.out.println("CPF nao cadastrado.");
    return null; // retorna null caso nao encontre o CPF
  }

}
