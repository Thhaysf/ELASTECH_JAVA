package Revisao1;

public class Atividade04 {
    public static void main(String[] args) {
    
  /*
        4 - Crie uma classe chamada Pet.

Dê a ela três atributos: nome (String), raca (String) e peso (double).

Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).

Atribua valores para os atributos de cada um deles.

Imprima os dados dos dois pets concatenando textos e variáveis.
         */
        // gato - nome : meow raça: siamês peso: 6.900kg
        //cachorro - nome: bilu raça : poodle peso: 10.0kg

        Pet gato = new Pet();
        gato.nome = "meow";
        gato.peso = 6.900;
        gato.raca = "Siamês";

        System.out.printf("Quero te apresentar meu Pet, o nome dele é: %s, da raça: %s, ele pesa: %.2f kg. \n", gato.nome, gato.raca, gato.peso);

        Pet cachorro = new Pet();
        cachorro.nome = "bilu";
        cachorro.peso = 7.700;
        cachorro.raca = "Poodle";

        System.out.printf("Quero te apresentar meu Pet, o nome dele é: %s, da raça: %s, ele pesa: %.3f kg.", cachorro.nome, cachorro.raca, cachorro.peso);

    }
}
