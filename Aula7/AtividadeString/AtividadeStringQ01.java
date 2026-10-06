package Aula7.AtividadeString;

import java.util.Scanner;

public class AtividadeStringQ01 {
  public static void main(String[] args) {
    // 1— Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

    Scanner scanner = new Scanner(System.in);
        String nomeCompleto;
        System.out.println("Digite seu nome :");
        nomeCompleto = scanner.nextLine();
        System.out.println(nomeCompleto.length());
  }
}
