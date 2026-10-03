package Revisao1;

import java.util.Scanner;

public class Atividade01 {
  public static void main(String[] args) {

        /*
1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
         */
   Scanner scanner = new Scanner(System.in);

        System.out.println("Qual lanche deseja: ");
        String lanche = scanner.nextLine();
        System.out.println("É uma ótima escolha!\n");
        System.out.println("Valor do lanche: ");
        Double valor = scanner.nextDouble();


        if (valor > 30.00) {
            System.out.printf("Você ganhou um desconto de R$5,00!, Este é o valor final do seu %s: R$ %.2f\n", valor - 5.00);
        } else {
                System.out.printf(" Somente aguardar o preparo! Obrigada pela preferência!.");
            }

        scanner.close();
        }

    }

