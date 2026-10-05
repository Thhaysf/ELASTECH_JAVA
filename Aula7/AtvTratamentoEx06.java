package Aula7;

import java.util.Scanner;

public class AtvTratamentoEx06 {
  public static void main(String[] args) {
    
  /*
    6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."

     */
  
    try {
    String [] nomes = {"Ana", "Aurora", "Gabriel"};
    System.out.println(nomes[5]);
    }
    catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Essa posição não existe. ");
    }
finally {
  System.out.println("O programa continua funcionando!");
}
}
}

