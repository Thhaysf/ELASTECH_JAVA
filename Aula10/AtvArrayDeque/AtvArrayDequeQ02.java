package Aula10.AtvArrayDeque;

import java.util.ArrayDeque;
import java.util.List;


public class AtvArrayDequeQ02 {
  public static void main(String[] args) {
    /*2. Crie uma fila com addAll. Use peek para mostrar quem é o próximo e
   imprima a fila logo depois. Repare que ela não mudou.
     */

  ArrayDeque<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("bebê", "criança", "jovem", "adulto", "idoso"));

        System.out.println(fila.peek());
      
        System.out.println(fila);
}
}
