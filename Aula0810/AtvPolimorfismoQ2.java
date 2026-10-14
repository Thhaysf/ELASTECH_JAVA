package Aula0810;

public class AtvPolimorfismoQ2 {
  public static void main(String[] args) {
    /*
    2. (mesma classe — muda o TIPO do parâmetro)

   Crie a classe Painel com QUATRO métodos chamados exibir, cada um
   recebendo um tipo diferente: String, int, boolean e double.
   Cada um imprime de um jeito, dizendo que tipo recebeu.

   Chame os quatro.

   Depois pense: por que o System.out.println() aceita texto, número,
   boolean e objeto, ao invés de ter um método println para cada? É exatamente isso que vocês acabaram de fazer.
 */

   Painel painel = new Painel();
   painel.exibir(3.5);
   painel.exibir(true);
   painel.exibir(5);
   painel.exibir("Lógica");

  }
}
