package fors;

public class For {

  public static void main(String[] args) {

    //for ( CONDICAO INICIAL;CONDICAO AVALIADA; O QUE FAZ A CADA INTERAÇÃO) { }

    //enquanto for menor ou igual a 10 repete e vai adicionando 1
    for (int i = 0; i <= 10; i = i + 1) {
      System.out.println("I=" + i);
    }

    //se nao tiver mais de uma linha nao precisa de chave
    for (int x = 0; x <= 5; x++)
      System.out.println("X=" + x);
    
  }

}
