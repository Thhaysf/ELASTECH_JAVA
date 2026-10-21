package projetopetshop;

import java.util.ArrayList;
import java.util.Scanner;

public class PetshopQ7 extends Pet {
  public static void main(String[] args) {
    //7°

    Scanner sc = new Scanner(System.in);

ArrayList<Pet> listaPets2 = new ArrayList<>();

int opcao = -1 ;
int total = 0;

while (opcao != 0) {

    System.out.println("=== PETSHOP ===");
    System.out.println("1 - Cadastrar pet");
    System.out.println("0 - Sair");

    System.out.print("Escolha: ");
    opcao = sc.nextInt();
    sc.nextLine();

    switch (opcao) {
        case 1:

    Pet pet = new Pet();

    System.out.print("Nome do pet: ");
    pet.nome = sc.nextLine();

    System.out.print("Espécie: ");
    pet.especie = sc.nextLine();

    System.out.print("Peso (kg): ");
    pet.peso = sc.nextDouble();
    sc.nextLine();

    pet.porte = pet.definirPorte();
    System.out.println("O porte é : " + pet.porte);

    listaPets2.add(pet);

    total++;
            break;

        case 0:
            System.out.println("Até logo!");
            break;

        default:
            System.out.println("Opção inválida.");
  }

  System.out.println("Agora são " + listaPets2.size() + " pet(s) cadastrado(s).");
}
  }
}

