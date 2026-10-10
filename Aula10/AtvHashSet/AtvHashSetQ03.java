package Aula10.AtvHashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class AtvHashSetQ03 {
  public static void main(String[] args) {
    /*3. Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
   tirar os repetidos. Imprima os dois e compare.
     */

   ArrayList <String> nomes = new ArrayList<>();

   nomes.add("Paçoca");
   nomes.add("farofa");
   nomes.add("aurora");
   nomes.add("meow");
   nomes.add("meow");

     HashSet <String> lista = new HashSet<>(nomes);
    System.out.println(nomes);

    System.out.println(lista);


  }
}
