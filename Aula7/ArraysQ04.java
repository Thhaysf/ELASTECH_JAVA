package Aula7;

import java.util.Scanner;

public class ArraysQ04 {
  public static void main(String[] args) {
    
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
 
