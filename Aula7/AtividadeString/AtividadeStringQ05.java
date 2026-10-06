package Aula7.AtividadeString;

import java.util.Scanner;

public class AtividadeStringQ05 {
  public static void main(String[] args) {
    /*5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.

Digite seu nome: Ana
Digite de novo: ANA
Os nomes são iguais? true
         */
      Scanner scanner = new Scanner(System.in);

    String nomeMaiusculo;
        String nomeMinusculo;

        System.out.println("Digite seu nome Maiusculo :");
         nomeMaiusculo = scanner.nextLine();

        System.out.println("Digite seu nome Minusculo:");
        nomeMinusculo = scanner.nextLine();

        System.out.println(nomeMaiusculo.equalsIgnoreCase(nomeMinusculo));
  }
}
