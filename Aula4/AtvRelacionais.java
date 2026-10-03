package Aula4;

public class AtvRelacionais {
public static void main(String[] args) {
  /*1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
- a = 10, b = 3
- a = 3, b = 10
- a = 5, b = 5
         */

       int notaA = 10;
       int notaB = 3;

        if (notaA == notaB) {
            System.out.println("As notas são iguais");
        } else {
            System.out.println("As notas são diferentes");
            if (notaA > notaB) {
                System.out.println("A primeira nota é maior");
            } else {
                System.out.println("A segunda nota é maior");
            }
        }

        // De outra forma.,

       /* int a = 3, b = 10;
//        System.out.println((a == b) + " - As notas são iguais.");
        System.out.println((a != b) + " - As notas são diferentes.");
        System.out.println((a > b) + " - A primeira nota é maior.");
        System.out.println((a < b) + " - A primeira nota é menor.");


        int notaA = 5;
       int notaB = 5;

        if (notaA == notaB) {
            System.out.println("As notas são iguais");
        } else {
            System.out.println("As notas são diferentes");
            if (notaA > notaB) {
                System.out.println("A primeira nota é maior");
            } else {
                System.out.println("A segunda nota é maior");
            }
        }


        */

        //2- Exiba na tela  a == b, sendo a = 10 e b 3.

        int aA = 10, bB = 3;

        System.out.println((aA == bB));

        // 3- Exiba na tela a != b, sendo a = 10 e b = 3.

        System.out.println((aA != bB));

        //4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo

  boolean chovendo = true;
      if (chovendo){
          System.out.println("Chovendo!");

    }
}}

