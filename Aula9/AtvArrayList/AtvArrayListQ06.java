package Aula9.AtvArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AtvArrayListQ06 {
  public static void main(String[] args) {
    //6- Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.

    ArrayList<String> nomes = new ArrayList<>();
    nomes.add("Jeronimo");
    nomes.add("Beatrice");
    nomes.add("Noemi");
    nomes.add("Aurora");
    nomes.add("Pyetra");

    Scanner novoNome = new Scanner(System.in);
        System.out.println("Digite um nome: ");
        String procurado = novoNome.nextLine();

        int posicao = nomes.indexOf(procurado);

        if (posicao != -1) {
            System.out.println(procurado + " está na lista, na posição " + posicao);
        } else {
            System.out.println(procurado + " não está na lista.");
        }
    }
}