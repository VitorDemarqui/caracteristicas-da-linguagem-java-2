package operadores;

public class Logicos {

  public static void main(String[] args) {

    final var numero = 2;
    final var letra = "A";

    //Sort Circuit
    //se uma situação onde as duas tem que ser verdadeira e a primeira da falsa nao verifica a segunda condição
    //&& quer dizer "e"
    if (numero < 5 && letra.equals("A")) {
      System.out.println("Atendeu a condição");
    }

    //|| quer dizer "ou"
    if (numero < 5 || letra.equals("A")) {
      System.out.println("Atendeu a outracondição");
    }

    //varias expressões matemáticas dentro da condição
    if ((10 - 5) > 1 && (5 - 3) > 1) {
      System.out.println("Lógica maluca...");
    }

    //Non Sort Circuit
    //utilizar | ou & verifica das duas condições
    if (verifica(15) | verifica("A")) {
        System.out.println("OK");
    } else {
        System.out.println("Não OK");
    }

  }

  private static boolean verifica(String letra) {
    System.out.println("Verificando letra...");
    return letra.equals("A");
  }

  private static boolean verifica(Integer numero) {
    System.out.println("verificando numero...");
    return numero > 10;
  }
}
