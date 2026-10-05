package Aula7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AtvTratamentoEx03 {
  public static void main(String[] args) {
    
  /*
  3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.
 */
  Scanner sc = new Scanner (System.in);
mostrarPergunta();

      try{
      int idade = sc.nextInt();

      }
      catch (InputMismatchException e ){
        System.out.println("É necessário a digitação de numeros inteiros.");
      }

}

 public static void mostrarPergunta() {
    System.out.println("Qual a sua idade?");
  }
}
  

