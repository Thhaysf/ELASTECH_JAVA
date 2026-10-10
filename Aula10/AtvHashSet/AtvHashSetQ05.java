package Aula10.AtvHashSet;

import java.util.HashSet;

public class AtvHashSetQ05 {
  public static void main(String[] args) {
    /*
    5. Crie um HashSet com três frutas e percorra ele com for,
   imprimindo uma por linha. */

   HashSet<String> frutas = new HashSet<>();
   frutas.add("maçã");
   frutas.add("uva");
   frutas.add("morango");
   for (String fruta : frutas) {
    System.out.println(fruta);
   }
  }
}
