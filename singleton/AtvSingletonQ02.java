package singleton;

public class AtvSingletonQ02 {
  public static void main(String[] args) {
    /*
    2. Por que o construtor de um Singleton é private?
 */
System.out.println("resposta: Ele sendo private, impede que outra classe crie uma instância usando new, garantindo que o acesso ao objeto seja feito pelo método getInstancia()");
  }
}
