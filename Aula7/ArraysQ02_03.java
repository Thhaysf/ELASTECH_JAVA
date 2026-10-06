package Aula7;

public class ArraysQ02_03 {
  public static void main(String[] args) {
     //2 — Crie um array com as notas {8, 6, 10, 7, 9}.  um laço, mostre todas, uma por linha, assim: "Nota 1: 8".
        //3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

        int [] notas = {8 ,6 ,10 ,7 ,9};
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
    System.out.println("Nota " + (i + 1) + ":  " + notas[i]);
    soma += notas[i];

}

double media = (double) soma / notas.length;

System.out.println("Soma: " + soma);
System.out.println("Média: " + media);
        
  }
}
