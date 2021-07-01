package ifs;

public class IF {

  public static void main(String[] args) {

    final var condicao = false;

    //condicao verdadeira
    if (condicao) {
      //verdadeira
      System.out.println("A condição é verdadeira");
    } else {
      //falsa
      System.out.println("A condição é falsa");
    }
    //if escrito em uma linha
    //entao se so for verdadeiro fazer isso, fazemos 1 linha
    if (condicao)
      System.out.println("Uma única linha...");

    //if ternario faz if e else em uma unica condição
    final var ternario = condicao ? "é verdadeira" : "é falsa";

    System.out.println(ternario);
  }
}
