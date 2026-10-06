package Aula4.AtividadeEstDeDecisao;

public class AtvEstDecisaoQ04 {
  public static void main(String[] args) {
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
