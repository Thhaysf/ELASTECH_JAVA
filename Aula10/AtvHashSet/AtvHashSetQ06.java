package Aula10.AtvHashSet;

import java.util.HashSet;

public class AtvHashSetQ06 {
  public static void main(String[] args) {
    /*Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
   imprima o isEmpty() de novo. */
     
    HashSet <String> vazio = new HashSet<>();
    System.out.println(vazio.isEmpty());

    vazio.add("não está mais vazio");
    System.out.println(vazio.isEmpty());
  }
}
