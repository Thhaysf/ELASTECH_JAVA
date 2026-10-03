package Aula7;

import java.util.Scanner;

public class AtividadeStrings {
    static void main(String[] args) {
        /*
         1— Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).

2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.

3 — Peça o nome da pessoa e mostre a primeira letra dele.

4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

Digite uma frase: Estou aprendendo Java
Digite uma palavra: Java
A palavra aparece na frase? true

5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.

Digite seu nome: Ana
Digite de novo: ANA
Os nomes são iguais? true
         */
        //1°
        Scanner scanner = new Scanner(System.in);
        String nomeCompleto;
        System.out.println("Digite seu nome :");
        nomeCompleto = scanner.nextLine();
        System.out.println(nomeCompleto.length());

        //2°
        System.out.println(nomeCompleto.toUpperCase());
        System.out.println(nomeCompleto.toLowerCase());

        //3°
        System.out.println(nomeCompleto.charAt(0));

        //4°
        System.out.print("Digite uma frase: ");
        String fraseCompleta = scanner.nextLine();

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("A palavra aparece na frase? " + fraseCompleta.contains(palavra));
        //5°
        String nomeMaiusculo;
        String nomeMinusculo;

        System.out.println("Digite seu nome Maiusculo :");
         nomeMaiusculo = scanner.nextLine();

        System.out.println("Digite seu nome Minusculo:");
        nomeMinusculo = scanner.nextLine();

        System.out.println(nomeMaiusculo.equalsIgnoreCase(nomeMinusculo));
    }
}
