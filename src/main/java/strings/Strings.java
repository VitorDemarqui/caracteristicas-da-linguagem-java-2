package strings;

public class Strings {

  //NOME CLASSE 1ª MINUSCULA RESTO MINUSCULO
  //SE TIVER DUAS PALAVRAS PRIMEIRA DE CADA MAIUSCULA

  //NOME DE MÉTODOS SAO SEMPRE MINUSCULO
  //SE TIVER MAIS DE UMA PALAVRA A PRIMEIRA LETRA DA PRIMEIRA PALAVRA DEVE SER MINUSCULA
  //SEM CARACTERES ESPECIAIS NOS METODOS

  //NOME DE VARIAVEL DEVE SER BEM INDICATIVO
  //NAO MISTURAR NUMEROS COM LETRA EX: NUMERO1, NUMERO2, LETRA1
  //PRIMEIRA LETRA SEMPRE MINUSCULA


  //PLUGUINS PARA AJUDAR NA PADRONIZAÇÃO:
  //CHECKSTYLE GRADLE PLUGUIN - FAZ ANALISE DO CODIGO
  //PMD GRADLE PLUGIN - FAZ ANALISE DE BOAS PRATICAS

  public static void main(String[] args) {

    var nome = "Vitor";
    var sobreNome = "Demarqui";
    final var nomeCompleto = nome + sobreNome; //concatenando strings

    System.out.println(nome); //exibe nome
    System.out.println("Nome do cliente : " + nome); //concatenando duas strings
    System.out.println("Nome completo do cliente : " + nomeCompleto); //concatenando duas strings

    var string = new String (" Minha  String ");//stanciando classe string

    System.out.println("Char na posição : " + string.charAt(5));  //este metodo devolve qual o caractere na posicao 5

    System.out.println("Quantidade=" + string.length());//mostra o tamanho da string 15

    System.out.println("Sem Trim [" + string + "]");

    System.out.println("Com Trim [" + string.trim() + "]"); //removes os caracteres em branco da string >>> " "


    System.out.println("Lower " + string.toLowerCase()); // deixa tudo em minusculo
    System.out.println("Upper " + string.toUpperCase());// deixa tudo em maiusculo

    System.out.println("Contém M? " + string.contains("M"));//contem a letra m retorna true ou falso
    System.out.println("Contém X? " + string.contains("X"));//contem a letra m retorna true ou falso

    //substitui caracteres no caso o "n" pelo "$"
    System.out.println("Replace " + string.replace("n","$"));


    System.out.println("Equals? " + string.equals(" Minha String "));//compara se a string é igual a essa minha string
    //compara ignorando o maiusculo e minusculo, compara
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG "));

    //pega um valor começando pela posicao 1 e terminando na 6
    System.out.println("Substring(1,6)=" + string.substring(1, 6));

    //transforma o texto em um array de char
    final char[] teste1 = "A B C D E F G".toCharArray();
    System.out.println(teste1[2]);

    //corta o texto pelo espaço e tranforma o texto em um array
    final String teste[] = "Aula de Java".split(" ");
    System.out.println(teste[1]);

    //concatena duas strings
    System.out.println("Aula".concat("de java"));

    //substitui todos os caracteres utilizando regex
    System.out.println("123 asda qw".replaceAll("[0-9]", "aa"));

  }
}
