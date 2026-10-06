package Aula7.AtvTratamentoEx;

import java.util.Scanner;

public class AtvTratamentoEx01{
  public static void main(String[] args) {
   /*
    1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.
 */
    Scanner sc = new Scanner(System.in);
    try {
        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = sc.nextInt();

        System.out.println("O resultado da divisão é : " + numero1/numero2);
}
catch (ArithmeticException e){
  System.out.println("Não é possivel divisão por zero.");
}
}
}
