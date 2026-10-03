package Aula5;

public class AtividadeLooping {
public static void main(String[] args) {
            int repeticao = 0;
        while (repeticao < 6) {
            System.out.println("Olá!");
            repeticao++;
        }
        int bateria = 50;

        while (bateria < 100) {
            System.out.println("Carregando... " + bateria + "%  \uD83D\uDD0B");
            bateria += 25;
        }
    }

}
