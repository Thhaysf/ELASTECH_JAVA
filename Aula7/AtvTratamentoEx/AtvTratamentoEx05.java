package Aula7.AtvTratamentoEx;

import java.util.Scanner;

public class AtvTratamentoEx05 {
  public static void main(String[] args) {
    
    /*
    5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.
 */

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um número: ");

    int numero = sc.nextInt();
    try {
      System.out.println( "O resto é : " + 100 % numero);

    }
    catch (ArithmeticException e) {
   System.out.println("Erro: Você digitou 0!");
    }
}
}
