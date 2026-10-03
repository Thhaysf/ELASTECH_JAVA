package Aula5;

import java.util.Scanner;

public class AtividadeScannear {

public static void main(String[] args) {
            //1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."


        Scanner scanner  = new Scanner(System.in);
        Variaveis variaveis = new Variaveis();

    System.out.println("Digite seu nome :");
        variaveis.nome = scanner .nextLine();
        System.out.println("Digite sua idade :");
        variaveis.idade = scanner .nextInt();


        System.out.printf("Oi %s, você tem %d anos e vai fazer %d no próximo aniversário. \n", variaveis.nome, variaveis.idade, variaveis.idade + 1);


        //2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.


        System.out.println("Digite sua idade :");
        variaveis.idade = scanner .nextInt();


        System.out.println("Digite o ano do seu nascimento :");
        variaveis.anoNascimento = scanner .nextInt();


        System.out.printf("soma = %d\nsubtração = %d\nmultiplicação = %d\ndivisão = %d\nresto = %d", variaveis.idade + variaveis.anoNascimento, variaveis.idade - variaveis.anoNascimento, variaveis.idade * variaveis.anoNascimento, variaveis.anoNascimento / variaveis.idade, variaveis.idade % variaveis.anoNascimento);


        //3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.


        System.out.println("\nQual a sua nota: ");
        variaveis.nota = scanner .nextDouble();


        if (variaveis.nota >= 7 ){
            System.out.println("Aprovada!");
        }
        else if (variaveis.nota >=5 ){
            System.out.println("Em recuperação!");
        } else {
            System.out.println("Reprovada!");


        }
        //4 - Peça um número e mostre a tabuada dele de 1 a 10.



        System.out.println("\nDigite um número:  ");
        variaveis.numero = scanner .nextInt();


        for (int i = 1; i <=10 ; i++){
            System.out.println(variaveis.numero *(i));


        }


    }
}

