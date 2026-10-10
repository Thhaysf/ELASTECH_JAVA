package Aula10.AtvHashSet;

import java.util.HashSet;
import java.util.List;

public class AtvHashSetQ02 {
  public static void main(String[] args) {
    /*2. Crie um HashSet de cores usando addAll. Depois use contains dentro
   de um if para avisar se a cor "verde" já está no conjunto ou não.
     */

   HashSet<String> cores = new HashSet<>();
   cores.addAll(List.of("verde", "branco", "amarelo", "azul"));
    
   if (cores.contains("verde")) {
     System.out.println("A cor Verde já está no conjunto");
   }
   else{
    System.out.println("A cor não está no conjunto");
   }
  }
}
