package Aula4.AtividadeEstDeDecisao;

public class AtvEstDecisaoQ01{
public static void main(String[] args) {


/* 1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".
         */
        int idadeFaixaEtaria = 31;
        if (idadeFaixaEtaria < 13) {
            System.out.println("É Criança.");
        } else if (idadeFaixaEtaria <= 17) {
            System.out.println("É Adolescente.");
        } else if (idadeFaixaEtaria <= 59) {
            System.out.println("É Adulto.");
        } else {
            System.out.println("É Idoso.");

        }
    }
}