package Aula3;

public class Atv2Aritmeticos {
public static void main(String[] args) {
        /*0- Rode esse código:
        System.out.println("2 + 2 = " + 2 + 2);.
        Agora rode:
        System.out.println("2 + 2 = " + (2 + 2)); */

        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));
        // No primeiro exemplo entende-se que é uma String(texo), por isto, não soma os números. No segundo exemplo a soma é efeutada pois está entre (), oque possibilita a operação ser realizada.

        /* 1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto. */

        int valorA = 10;
        int valorB = 3;

        System.out.println("soma = " + (valorA + valorB));
        System.out.println("subtração = " + (valorA - valorB));
        System.out.println("multiplicação = " + (valorA * valorB));
        System.out.println("divisão = " + (valorA / valorB));
        System.out.println("resto = " + (valorA % valorB));

        /* 2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.
         */

        Double numeroA = 10.0;
        Double numeroB = 3.0;

        System.out.println("soma = " + (numeroA + numeroB));
        System.out.println("subtração = " + (numeroA - numeroB));
        System.out.println("multiplicação = " + (numeroA * numeroB));
        System.out.println("divisão = " + (numeroA / numeroB));
        System.out.println("resto = " + (numeroA % numeroB));

        /* 3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média
         */
        int notaUm = 8;
        int notaDois = 6;
        int notaTres = 10;

        System.out.println("soma = " + (notaUm + notaDois + notaTres));
        System.out.println("média = " + (notaUm + notaDois + notaTres / 3));

        /* 4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.
         */
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println("Resultado da Operação = " + (a + b * c ));

        /* 5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5. */

        System.out.println("Resultado da Operação = " + ((a + b ) * c ));

    }
}
