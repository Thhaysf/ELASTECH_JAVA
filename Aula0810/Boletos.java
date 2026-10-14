package Aula0810;

public class Boletos implements MeioDePagamento{
 @Override
    public void pagar(double valor) {
        System.out.printf("Boleto de R$ %.2f gerado com sucesso. \n", valor);
    }
}
  

