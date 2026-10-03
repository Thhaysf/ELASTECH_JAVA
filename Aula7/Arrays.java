package Aula7;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*
Referência:
int[]
notas = {8, 6, 10, 7, 9};
int[] notas = new int[5]
•for(int i = 0; i
< notas.length;
i++){
    System.out.println(notas[i]);}*/

         //1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

        String[] nomes = {"Jana", "Olivia", "Fernanda", "Jose", "Ana"};
        System.out.println(nomes[0]);
        System.out.println(nomes[2]);
        System.out.println(nomes[4]);

        //2 — Crie um array com as notas {8, 6, 10, 7, 9}.  um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

        int [] notas = {8 ,6 ,10 ,7 ,9};
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
    System.out.println("Nota " + (i + 1) + ":  " + notas[i]);
    soma += notas[i];

}

double media = (double) soma / notas.length;

System.out.println("Soma: " + soma);
System.out.println("Média: " + media);
        
//4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o número: " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("De trás pra frente:");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}

        
    

