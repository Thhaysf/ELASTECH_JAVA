package Revisao1;

import java.util.Scanner;

public class Atividade06 {
  public static void main(String[] args) {
  
   /*
        Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:

Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).

Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).

Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
         */
        Scanner scanner = new Scanner(System.in);

        int anoNascimento;
        String nomeCompleto;

        System.out.println("Digite o Ano de Nascimento: ");
        anoNascimento = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o seu Nome Completo: ");
        nomeCompleto = scanner.nextLine();

        System.out.println("O usuário(a) " + nomeCompleto+ " nasceu em " + anoNascimento);
    }
}
