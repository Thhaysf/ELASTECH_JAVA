package Aula10.AtvArrayDeque;

import java.util.ArrayDeque;

public class AtvArrayDequeQ05 {
  public static void main(String[] args) {
    /*5. Crie uma fila com três nomes e use contains para responder duas
   perguntas: se "Bia" está na fila e se "Zoe" está.
     */
    ArrayDeque <String> fila = new ArrayDeque<>();
    fila.add("Bia");
    fila.add("Lolo");
    fila.add("Lulu");

  System.out.println("Bia está na fila? " + fila.contains("Bia"));
  System.out.println("Zoe está na fila? " + fila.contains("Zoe"));
  
  }
}

