package Aula7;

import java.util.Scanner;

public class AtvTratamentoEx02 {
  public static void main(String[] args) {
     /*2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
     */
    int [] notas = {8, 6, 9, 3, 1};
    Scanner sc = new Scanner(System.in);    

    System.out.println("Escolha uma posição de nota: ");
      
    try{
        int posicao = sc.nextInt(); 

  System.out.println("A nota na posição " + posicao + " é: " + notas[posicao]);


} catch (ArrayIndexOutOfBoundsException e) {
String resultado = "A posição digitada não existe, o array só vai de 0 a 4." ;
    System.out.println(resultado);
} finally {

sc.close();

}
  }
  }

