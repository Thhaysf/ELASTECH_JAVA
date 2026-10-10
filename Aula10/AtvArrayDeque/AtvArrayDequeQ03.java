package Aula10.AtvArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class AtvArrayDequeQ03 {
  public static void main(String[] args) {
    /*
    3. Mesma fila. Agora use poll para atender o primeiro e imprima a fila
   depois. Compare com o exercício 2.
    */
    ArrayDeque<String> fila = new ArrayDeque<>();

        fila.addAll(List.of("bebê", "criança", "jovem", "adulto", "idoso"));

        System.out.println(fila.poll());
        System.out.println(fila);
  }
}
