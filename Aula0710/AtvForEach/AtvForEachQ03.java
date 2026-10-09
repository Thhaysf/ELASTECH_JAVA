package Aula0710.AtvForEach;

public class AtvForEachQ03 {
  public static void main(String[] args) {
    //3. Com o array de notas {8, 6, 10, 7}, use for-each para somar todas e mostrar a soma e a média.

    int [] notas = { 8 , 6 , 10 ,7 }; 

    int soma = 0;

    for (int nota : notas) {
      soma += nota;
    }

    double media = (double) soma / notas.length; 

    System.out.println("Soma das notas: " + soma);
    System.out.println("Média das notas: " + media);

  }
}
