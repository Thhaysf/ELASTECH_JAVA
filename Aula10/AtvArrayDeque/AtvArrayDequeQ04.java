package Aula10.AtvArrayDeque;

import java.util.ArrayDeque;

public class AtvArrayDequeQ04 {
  public static void main(String[] args) {
    /*
    4. Crie uma fila com três nomes e atenda todos usando
   while (!fila.isEmpty()). No final, imprima "Fila vazia!".
    */

   ArrayDeque <String> fila = new ArrayDeque<>();
    fila.add("Lili");
    fila.add("Lolo");
    fila.add("Lulu");

    while (!fila.isEmpty()) {
      System.out.println(fila.poll());
    }
    System.out.println("Fila vazia!");
  }
}
