package projetopetshop;

import java.util.Scanner;

public class PetshopQ2e3 {
  public static void main(String[] args) {
    
    //2° - 3° 

Scanner sc = new Scanner(System.in);

System.out.printf("== Informações do seu Pet para cadastro! == \nnome: ");
String novoAnimal = sc.nextLine();

System.out.println("Espécie: ");
String especieNovoAnimal = sc.nextLine();

System.out.println("Peso(kg):  ");
double pesoNovoAnimal = sc.nextDouble();

String porte;

if (pesoNovoAnimal < 10) {
  System.out.println( porte = "Pequeno");
}
else if (pesoNovoAnimal < 25) {
    System.out.println(porte = "Médio");

}
else {
      System.out.println(porte = "Grande");

}

System.out.printf("Seu Pet se chama: %s, é da espécie: %s, pesa: %.1f kg e tem o porte: %s.", novoAnimal, especieNovoAnimal , pesoNovoAnimal,porte );
  }
}
