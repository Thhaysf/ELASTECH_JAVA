package Aula2;

public class AtvConcatencaoQ02 {
  public static void main(String[] args) {
      // 2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"


       String produto = "canecas";
       Double preco = 12.50;
       int quantidade = 4;


       System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + (preco * quantidade) + ".");


  }
}
