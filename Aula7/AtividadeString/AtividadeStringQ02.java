package Aula7.AtividadeString;

import java.util.Scanner;

public class AtividadeStringQ02 {
  public static void main(String[] args) {

    //2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

    Scanner scanner = new Scanner(System.in);
        String nomeCompleto;

        System.out.println("Digite seu nome :");
        nomeCompleto = scanner.nextLine();

     System.out.println(nomeCompleto.toUpperCase());
        System.out.println(nomeCompleto.toLowerCase());

  }
}
