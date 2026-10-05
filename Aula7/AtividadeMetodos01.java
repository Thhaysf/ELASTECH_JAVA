package Aula7;

import java.util.Scanner;

public class AtividadeMetodos01 {
  public static void main(String[] args) {
    /*1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
    O método vai fora do main, mas dentro da classe, no mesmo nível do main, logo abaixo dele. Se você tentar criar um método dentro do main, não compila.
     */

    Scanner sc = new Scanner(System.in);
  

    mostrarBoasVindas();
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = sc.nextInt();
      

  }
    public static void mostrarBoasVindas() {
    System.out.println("Bem-vinda ao curso de Java!");
  }
}
