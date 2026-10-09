package Aula9.AtvArrayList;

import java.util.ArrayList;

public class AtvArrayListQ04 {
  public static void main(String[] args) {
    //4- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram. 

  ArrayList <String> cidades = new ArrayList<>();
cidades.add("Recife");
cidades.add("Olinda");
cidades.add("Jaboatão dos Guararapes");
cidades.add("Camaragibe");

cidades.remove(1);

System.out.println(cidades);
}
}
