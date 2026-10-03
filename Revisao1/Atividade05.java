package Revisao1;

import java.util.Scanner;

public class Atividade05 {
  public static void main(String[] args) {
    
  /*
    5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).

Na classe principal, faça um laço for que repita 3 vezes.

A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.

Instancie um novo Produto e guarde nele os valores digitados.

Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.
     */
        //ProdutoA - bolsa , R$ 45.00
        //ProdutoB - caderno , R$ 22.99

        Scanner scanner = new Scanner(System.in);
        ProdutoEx05 produtoA = new ProdutoEx05();


        for (int i = 0; i < 3; i++) {

            System.out.println("Digite o nome do produto: ");
            produtoA.nome = scanner.nextLine();

            System.out.println("Digite o preço do produto: ");
            produtoA.preco = scanner.nextDouble();

            scanner.nextLine();

        }
            if (produtoA.preco > 100.00) {
                System.out.printf(" O produto %s tem o valor de %.2f.\n Produto caro!", produtoA.nome, produtoA.preco);

            } else {
                System.out.printf("O produto %s tem o valor de %.2f. \n Produto com preço acessível!", produtoA.nome, produtoA.preco);
            }


    }
}
