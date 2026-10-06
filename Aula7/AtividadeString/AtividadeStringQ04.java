package Aula7.AtividadeString;

import java.util.Scanner;

public class AtividadeStringQ04 {
  public static void main(String[] args) {
    /*4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

Digite uma frase: Estou aprendendo Java
Digite uma palavra: Java
A palavra aparece na frase? true */

Scanner scanner = new Scanner(System.in);

System.out.print("Digite uma frase: ");
        String fraseCompleta = scanner.nextLine();

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra aparece na frase? " + fraseCompleta.contains(palavra));
  }
}
