package Aula4.AtividadeEstDeDecisao;

public class AtvEstDecisaoQ02{ 
public static void main(String[] args) {
        

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
      }
    }