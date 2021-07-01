package operadores;

public class Incremento {

  public static void main(String[] args) {

    var numero = 1;

    System.out.println(++numero);
    //a esquerda primeiro incrementa depois imprime, a direita imprime depois incrementa
    //é a mesma coisa que numero = numero +1;

    var variavel = 10;

    //incrementa depois de imprimir
    System.out.println(variavel--);
    System.out.println(variavel);
  }
}
