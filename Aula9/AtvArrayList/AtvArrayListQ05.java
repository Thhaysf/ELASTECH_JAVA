package Aula9.AtvArrayList;

import java.util.ArrayList;

public class AtvArrayListQ05 {
  public static void main(String[] args) {
    //5- Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)

     ArrayList <String> nomes = new ArrayList<>();
nomes.add("Luana");
nomes.add("Pablo");
nomes.add("Ricardo");
nomes.add("Laura");
nomes.add("Rezende");

    for (int i = 0 ; i < nomes.size() ; i++ ) {
      System.out.println(i + ": " + nomes.get(i));
    }



  }
  
}
