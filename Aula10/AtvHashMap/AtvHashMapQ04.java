package Aula10.AtvHashMap;

import java.util.HashMap;

public class AtvHashMapQ04 {
  
  public static void main(String[] args) {
   /* 4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
   Use getOrDefault para mostrar a quantidade de um produto que existe
   e de um que não existe (devolvendo 0). Depois tente com get normal
   no que não existe e compare.*/ 

   HashMap<String, Integer> estoque = new HashMap<>();
estoque.put("Caixas", 100);
estoque.put("Sapatos", 600);

System.out.println(estoque.getOrDefault("Caixas", 0));
System.out.println(estoque.getOrDefault("Sapatilhas", 0));

System.out.println(estoque.get("Caixas"));
System.out.println(estoque.get("Sapatilhas"));

  }
}
