package Aula5.AtvScanner;

import java.util.Scanner;

public class AtvScannerQ01 {
  public static void main(String[] args) {
      //1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."


        Scanner scanner  = new Scanner(System.in);
        Variaveis variaveis = new Variaveis();

    System.out.println("Digite seu nome :");
        variaveis.nome = scanner .nextLine();
        System.out.println("Digite sua idade :");
        variaveis.idade = scanner .nextInt();


        System.out.printf("Oi %s, você tem %d anos e vai fazer %d no próximo aniversário. \n", variaveis.nome, variaveis.idade, variaveis.idade + 1);

  }
}
