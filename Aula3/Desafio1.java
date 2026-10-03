package Aula3;

public class Desafio1 {
public static void main(String[] args) {        /* Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
        Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes. */

        int segundos = 3785;
        System.out.println("Minutos inteiros: " + (segundos / 60) + " e sobram: " + (segundos % 60));
    }
}
