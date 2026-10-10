package Aula10.AtvHashSet;

import java.util.HashSet;

public class AtvHashSetQ04 {
  public static void main(String[] args) {
   /*  4. Crie um HashSet com três CPFs e imprima. Depois remova um deles e
   imprima de novo, junto com o tamanho.*/

   HashSet<String> identificacao = new HashSet<>();
  identificacao.add("125.364.888-60");
  identificacao.add("125.684.899-70");
  identificacao.add("125.333.888-80");

  System.out.println(identificacao);

 identificacao.remove("125.364.888-60");
 System.out.println(identificacao);
 System.out.println(identificacao.size());
  }
}
