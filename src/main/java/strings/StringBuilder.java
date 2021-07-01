package strings;

public class StringBuilder {

  public static void main(String[] args) {

    var nome = "Vitor";

    //instanciando builder
    final var builder = new java.lang.StringBuilder(nome);
    //adeciona string a string anterior
    System.out.println(builder.append("Luis"));

    //reverse no build faz uma string de trras para a frente
    final var reverse = builder.reverse();

    System.out.println(reverse);

    //inserir caracteres em posicoes specificas da string, e na ultima posicao insere #
    final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
    System.out.println(insert);

  }

}
