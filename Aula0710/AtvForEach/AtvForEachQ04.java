package Aula0710.AtvForEach;

public class AtvForEachQ04 {
  public static void main(String[] args) {
    /*4. Com um array de nomes, use for-each e um if para contar quantos mais de 5 letras. Mostre o total. Dica: usem o método length */

          String [] nomes = { "João", "Thiago", "Henrique" , "Leandro"};

          for (String nome : nomes) {
            System.out.println(nome);

            if (nome.length() >= 5 ) { 
              System.out.println("O nome que procuramos é: ");
            }
            }
          }

  }

