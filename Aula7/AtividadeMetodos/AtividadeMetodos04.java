package Aula7.AtividadeMetodos;

import java.util.Scanner;

public class AtividadeMetodos04 {
  public static void main(String[] args) {
    /*
    4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.

    */

    Scanner sc = new Scanner(System.in);
    UtilidadesVariavel calcular = new UtilidadesVariavel();

    System.out.println(" Calcule a média: \n 1° nota: " );
    double n1 = sc .nextDouble();

    System.out.println("2° nota: " );
    double n2 = sc .nextDouble();

    double media = UtilidadesVariavel.calcularMedia(n1, n2);

        System.out.printf("A média das notas é: %.2f", media);

}
}