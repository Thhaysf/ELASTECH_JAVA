package Aula10.AtvHashMap;

import java.util.HashMap;

public class AtvHashMapQ02 {
  public static void main(String[] args) {

    /*
    2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
  imprima, e depois faça put de "café" DE NOVO com valor 7.50.
  Imprima outra vez e veja o que aconteceu com o tamanho.
     */

  HashMap <String, Double> produtos = new HashMap<>();
  produtos.put("café" , 5.00);
  //System.out.println(produtos);

  produtos.put("café", 7.50);
  System.out.println(produtos);


  }
}