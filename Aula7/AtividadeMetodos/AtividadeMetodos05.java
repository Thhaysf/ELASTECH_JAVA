package Aula7.AtividadeMetodos;

import java.util.Scanner;

public class AtividadeMetodos05 {
  public static void main(String[] args) {
   
    /*
    5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
    */

    Scanner sc = new Scanner(System.in);
    UtilidadesVariavel idade = new UtilidadesVariavel();

    
    System.out.println(" Qual sua idade? " );
    int qualIdade = sc .nextInt();

    if (idade.ehMaiorDeIdade(qualIdade)) {
      System.out.println("É maior de idade");
    }
    else {
      System.out.println("É menor de idade");
    }


}
 
}