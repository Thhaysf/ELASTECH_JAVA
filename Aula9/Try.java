package Aula9;

import java.util.Scanner;

public class Try {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

try {
    int resultado = 10 / 0;
    System.out.println(resultado);

} catch (ArithmeticException e) {
    System.out.println("Não dá pra dividir por zero!");

} finally {
    System.out.println("Isso sempre roda.");
}

System.out.println("O programa continua.");
}
}
