package Aula7.AtividadeString;

import java.util.Scanner;

public class AtividadeStringQ03 {
  public static void main(String[] args) {
    //3 — Peça o nome da pessoa e mostre a primeira letra dele.
    
   Scanner scanner = new Scanner(System.in);
        String nomeCompleto;

        System.out.println("Digite seu nome :");
        nomeCompleto = scanner.nextLine();

        System.out.println(nomeCompleto.charAt(0));
  }
}
