package Aula5.AtvScanner;

import java.util.Scanner;

public class AtvScannerQ02 {
  public static void main(String[] args) {
     //2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.

        Scanner scanner  = new Scanner(System.in);
        Variaveis variaveis = new Variaveis();
        
        System.out.println("Digite sua idade :");
        variaveis.idade = scanner .nextInt();


        System.out.println("Digite o ano do seu nascimento :");
        variaveis.anoNascimento = scanner .nextInt();


        System.out.printf("soma = %d\nsubtração = %d\nmultiplicação = %d\ndivisão = %d\nresto = %d", variaveis.idade + variaveis.anoNascimento, variaveis.idade - variaveis.anoNascimento, variaveis.idade * variaveis.anoNascimento, variaveis.anoNascimento / variaveis.idade, variaveis.idade % variaveis.anoNascimento);
  }
}
