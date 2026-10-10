package Aula10.AtvHashSet;

import java.util.HashSet;

public class AtvHashSetQ01 {
  public static void main(String[] args) {
    /*1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
   com o repetido. */

   HashSet<String> nomes = new HashSet<>();
  nomes.add("João");
  nomes.add("Luana");
  nomes.add("João");
  nomes.add("Cibele");
System.out.println(nomes);
        System.out.println(nomes.size());


  }
}
