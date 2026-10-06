package Aula5.AtvScanner;

import java.util.Scanner;

public class AtvScannerQ04 {
  public static void main(String[] args) {

      //4 - Peça um número e mostre a tabuada dele de 1 a 10.

        Scanner scanner  = new Scanner(System.in);
        Variaveis variaveis = new Variaveis();

        System.out.println("\nDigite um número:  ");
        variaveis.numero = scanner .nextInt();


        for (int i = 1; i <=10 ; i++){
            System.out.println(variaveis.numero *(i));


        }
  }
}
