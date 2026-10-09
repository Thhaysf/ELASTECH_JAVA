package Aula9.AtvArrayList;

import java.util.ArrayList;

public class AtvArrayListQ03 {
  public static void main(String[] args) {
    // 3- Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois. 

     ArrayList <String> nomes = new ArrayList<>();
nomes.add("João");
nomes.add("Erica");
nomes.add("Leandra");
nomes.add("Rogerio");

System.out.println(nomes);

nomes.set(0, "Rogerio");

System.out.println(nomes);

  }
}
