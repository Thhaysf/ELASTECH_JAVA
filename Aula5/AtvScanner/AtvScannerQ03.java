package Aula5.AtvScanner;

import java.util.Scanner;

public class AtvScannerQ03 {
  public static void main(String[] args) {
    //3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.

        Scanner scanner  = new Scanner(System.in);
        Variaveis variaveis = new Variaveis();
    
        System.out.println("\nQual a sua nota: ");
        variaveis.nota = scanner .nextDouble();


        if (variaveis.nota >= 7 ){
            System.out.println("Aprovada!");
        }
        else if (variaveis.nota >=5 ){
            System.out.println("Em recuperação!");
        } else {
            System.out.println("Reprovada!");


        }
  }
}
