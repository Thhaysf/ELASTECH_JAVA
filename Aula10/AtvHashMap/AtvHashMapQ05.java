package Aula10.AtvHashMap;

import java.util.HashMap;

public class AtvHashMapQ05 {
 public static void main(String[] args) {
 /* 
  5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
   Remova uma delas e imprima de novo.
  */
   HashMap<String, Double> notasAlunas = new HashMap<>();
  notasAlunas.put("Aluna01", 3.5);
notasAlunas.put("Aluna02", 6.5);
notasAlunas.put("Aluna03", 9.0);

System.out.println(notasAlunas);
System.out.println(notasAlunas.size());
 } 
}
