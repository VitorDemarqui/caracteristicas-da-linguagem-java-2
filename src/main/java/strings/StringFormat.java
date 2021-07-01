package strings;

public class StringFormat {

  public static void main(String[] args) {

    var nome = "André";
    var sobreNome = "Gomes";
    final var nomeCompleto = nome + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente : " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);

    //format formata a string utilizando as %s
    final var mensagem = String.format("O cliente %s possui sobre nome %s ", nome, sobreNome);
    System.out.println(mensagem);

    //format formata a string utilizando as %s com numero e eu pego 2 casa depois da virgula
    System.out.println(String.format("Numero %.2f ", 1.2375d));
  }

}
