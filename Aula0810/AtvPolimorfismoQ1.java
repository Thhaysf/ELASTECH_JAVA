package Aula0810;

public class AtvPolimorfismoQ1 {
  public static void main(String[] args) {
  /*
  1. (mesma classe — muda a QUANTIDADE de parâmetros)

   Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
   - recebe um double (lado do quadrado)  -> lado * lado
   - recebe dois double (base e altura)   -> base * altura
   - recebe um int (raio do círculo)      -> 3.14159 * raio * raio

   Chame os três na Main e imprima os resultados.
   */

Calculadora calculadora = new Calculadora();

calculadora.calcularArea(3.9);
calculadora.calcularArea(36.1, 50.0);
calculadora.calcularArea( 3 );

}
}
