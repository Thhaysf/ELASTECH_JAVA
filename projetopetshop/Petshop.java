package projetopetshop;

import  java.util.Scanner;

public class Petshop {
  public static void main(String[] args) {
    
  String nome = "Mel";
  String especie = "Cachorro";
  double peso = 8.5;

System.out.printf("== FICHA DO PET === \nNome: %s\nEspécie: %s \nPeso: %.1f kg", nome, especie , peso);

Scanner sc = new Scanner(System.in);

String novoAnimal = sc.nextLine();

}
}