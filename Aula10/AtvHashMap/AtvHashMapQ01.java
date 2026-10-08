package Aula10.AtvHashMap;

import java.util.HashMap;

public class AtvHashMapQ01 {
  public static void main(String[] args) {
    /*
    1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
   inteiro e depois use get para mostrar a idade de uma delas. */

   HashMap<String, Integer> pessoas = new HashMap<>();
   pessoas.put("Ana", 18);
   pessoas.put("Bia", 19);
   pessoas.put("Triz", 20);

   System.out.println(pessoas);
   System.out.println(pessoas.get("Triz"));

  }
}
