package operadores;

public class Igualdade {

  public static void main(String[] args) {

    final var numero = 11;

    //se numero for igual a 10 é verdadeiro
    // == quer dizer identico numero identico a 10
    if (numero == 10) {
      System.out.println("O número é 10");
    } else {
      System.out.println("O número  não é 10");
    }

    //!= quer dizer diferente de 10
    if (numero != 10) {
      System.out.println("O número não é 10");
    } else {
      System.out.println("O número é 10");
    }

    final var letra = "B";

    //equals é como se fosse igual
    //A == letra
    if ("A".equals(letra)) {
      System.out.println("É a letra A");
    }

    //negação da equals
    if (!letra.equals("A")) {
      System.out.println("Não é a letra A");
    }
  }
}
