package singleton;


public class AtvSingletonQ04 {
  
public static void main(String[] args) {
/*
  4. O que acontece se alguém tentar escrever isto fora da classe?

java
Configuracao c = new Configuracao(); */
System.out.println(" Considerando que o construtor é private, ocorre um erro de compilação, impedindo que outra classe crie uma instância diretamente usando new. Para obter o objeto, devemos utilizar o método getInstancia().");

}
}
