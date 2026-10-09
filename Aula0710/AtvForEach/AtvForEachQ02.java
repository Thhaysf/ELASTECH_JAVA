package Aula0710.AtvForEach;

import java.util.ArrayList;
import java.util.List;

public class AtvForEachQ02 {
  public static void main(String[] args) {
    //2. Crie um ArrayList com 5 notas e imprima todas usando for-each.

    ArrayList <Double> notas = new ArrayList<>();

    notas.addAll(List.of(7.0, 8.5, 6.3, 8.0, 5.5));

    for (double nota : notas) {
      System.out.println(nota);
      
    }
  }
}
