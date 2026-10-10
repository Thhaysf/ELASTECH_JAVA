package Aula10.AtvArrayDeque;

import java.util.ArrayDeque;

public class AtvArrayDequeQ06 {
  public static void main(String[] args) {
    /*
    6. Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
   - se estiver vazia  -> "Não tem ninguém na fila."
   - se tiver gente    -> "Próximo: [nome]"
   Depois adicione uma pessoa e teste de novo. */
    
   ArrayDeque <String> fila = new ArrayDeque<>();
   
   if (fila.isEmpty()) {
    System.out.println("Não tem ninguem na fila.");
  
   }
   else {
    System.out.println("Próximo: " + fila.peek());
   }
   /*com pessoa.

   ArrayDeque <String> fila = new ArrayDeque<>();

      fila.add("Thayná");
      if (fila.isEmpty()) {
    System.out.println("Não tem ninguem na fila.");
  
   }
   else {
    System.out.println("Próximo: " + fila.peek());
   }

*/
  }
}
