package Aula10.AtvArrayDeque;

import java.util.ArrayDeque;

public class AtvArrayDequeQ01 {
  public static void main(String[] args) {
   
   /*  1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
   e quantas pessoas tem.*/
   ArrayDeque <String> pessoas = new ArrayDeque<>();
   pessoas.addFirst("Luedji");
   pessoas.addFirst("Taís");
   pessoas.addLast("Carol");

   System.out.println(pessoas);
  }
}
