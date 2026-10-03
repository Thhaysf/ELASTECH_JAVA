package Aula4;

public class Atv3EstruturasDeDescisao {
public static void main(String[] args) {
        /* 1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".
         */
        int idadeFaixaEtaria = 31;
        if (idadeFaixaEtaria < 13) {
            System.out.println("É Criança.");
        } else if (idadeFaixaEtaria <= 17) {
            System.out.println("É Adolescente.");
        } else if (idadeFaixaEtaria <= 59) {
            System.out.println("É Adulto.");
        } else {
            System.out.println("É Idoso.");

        }

        /* 2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.
         */

        double saldo = 500.00, compra = 320.00;
        if (saldo >= compra) {
            System.out.println("Compra aprovada!. Sobrou = R$ " + (saldo - compra) + " de saldo.");
        } else if (saldo < compra) {
            System.out.println("Compra não autorizada, saldo insuficiente !" + " Está faltando: " + (compra - saldo));
            ;
        }

        double novoSaldo = 320.00, novaCompra = 500.00;
        if (novoSaldo >= novaCompra) {
            System.out.println("Compra aprovada!. Sobrou = R$ " + (novoSaldo - novaCompra) + " de saldo.");
        } else if (novoSaldo < novaCompra) {
            System.out.println("Compra não autorizada, saldo insuficiente !" + " Está faltando: " + (novaCompra - novoSaldo));
            ;
        }

/*
3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".*/

        int var = 3;

        switch (var) {
            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Capuccino");
                break;
            case 3:
                System.out.println("Chocolate quente");
                break;
            case 4:
                System.out.println("Chá");
                break;
            default:
                System.out.println("Opção inválida");
        }
        /* 4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização.Faça o mesmo para precisa ter 18 anos e ter autorização.*/

        int idade = 17;
        String autorizacao = "Pode entrar.";

        if (idade >= 18) {
            System.out.println(autorizacao);
        } else if (idade <= 17) {
            System.out.println("Precisa ter 18 anos para ter autorização de entrada.");
        }

    /* teste com o SWITCH.
    int idade = 17;
        String autorizacao = "Pode entrar.";
        switch (idade) {
            case 1:
                System.out.println((idade > 18) + (autorizacao));
                break;
            case 2 :
                System.out.println((idade == 18) + (autorizacao));
                break;
            default:
                System.out.println((idade < 18) + " - Não autorizado, o acesso é para maiores de 18 anos. ");
*/


    }
}

