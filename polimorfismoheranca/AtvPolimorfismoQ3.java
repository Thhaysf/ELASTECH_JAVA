package polimorfismoheranca;

public class AtvPolimorfismoQ3 {
  public static void main(String[] args) {
    /*
    3. Crie a classe Professora, também filha de Pessoa, com o atributo
   disciplina e o método lancarNota(String aluna, double nota), que
   imprime algo como "Flora lançou nota 9.5 para Ana". Use printf
   com %.1f.

   Na Main, crie uma aluna e uma professora e dê valor aos atributos
   de cada objeto:

   Professora flora = new Professora();
   flora.nome = "Flora";
   flora.idade = 30;
   flora.disciplina = "Java e IA";

   Faça o mesmo com a aluna e chame os métodos das duas. */

  Professora flora = new Professora();
   flora.nome = "Flora";
   flora.idade = 30;
   flora.disciplina = "Java e IA";
   flora.apresentar();
flora.lancarNota("Thay", 9.5);


   Aluna thay = new Aluna();
   thay.nome = "Thay";
   thay.idade = 31;
   thay.curso = "Java e IA";
   thay.estudar();
  


  }
}
