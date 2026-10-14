package Aula0810;

public class AtvPolimorfismoQ4 {
  public static void main(String[] args) {
    /*(herança — quem não sobrescreve)

   Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve
   o apresentar() e não acrescenta nada.

   Na Main, crie o objeto, dê valor aos atributos, guarde ele numa
   variável do tipo da mãe e chame o método apresentar().

   O que saiu? Por quê?
     */

   Estagiaria estagiaria = new Estagiaria();

estagiaria.nome = "Thay";
estagiaria.idade = 31;

Pessoa pessoa = estagiaria;

pessoa.apresentar();
  }
}
