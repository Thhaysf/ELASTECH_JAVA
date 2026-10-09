package Aula9.AtvArrayList;

import java.util.ArrayList;
import java.util.List;

public class AtvArrayListQ02 {
  public static void main(String[] args) {
    //2- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem. 

    ArrayList <String> frutas = new ArrayList<>();
    frutas.addAll(List.of("Manga", "Acerola", "Abacaxi", "Maçã"));
  
    System.out.println(frutas.get(0));
    System.out.println(frutas.get(frutas.size() - 1));
    System.out.println(frutas.size());
  }
}
