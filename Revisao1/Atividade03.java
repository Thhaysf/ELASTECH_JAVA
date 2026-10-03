package Revisao1;

import java.util.Scanner;

public class Atividade03 {
public static void main(String[] args) {

/*
        3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
1 - Ver camisas
2 - Ver calças
3 - Sair
Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.
         */

        int opcao;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Selecione a opção no menu: \n 1 - Ver Camisas \n 2 - Ver calças \n 3 - Sair ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você selecionou ver Camisas.");
                    break;
                case 2:
                    System.out.println("Você selecionou ver calças!");
                    break;
                case 3:
                    System.out.println("Sair...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
        {

        }

    } }

