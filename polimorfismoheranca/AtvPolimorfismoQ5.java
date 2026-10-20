package polimorfismoheranca;

public class AtvPolimorfismoQ5 {
  public static void main(String[] args) {
    /*
     (herança — método que recebe a mãe)

   Crie um método na sua classe Main:

   static void mostrarFicha(Pessoa p) {
       p.apresentar();
   }

   Chame ele três vezes, passando a aluna, a professora e a estagiária.

   O método não sabe quem vai receber, e funciona pros três.
     */
    Aluna thay = new Aluna();
        thay.nome = "Thay";
        thay.idade = 31;
        thay.curso = "Java e IA";

        Professora flora = new Professora();
        flora.nome = "Flora";
        flora.idade = 30;
        flora.disciplina = "Java e IA";

        Estagiaria estagiaria = new Estagiaria();
        estagiaria.nome = "Ana";
        estagiaria.idade = 26;

        mostrarFicha(thay);
        mostrarFicha(flora);
        mostrarFicha(estagiaria);
  }
  static void mostrarFicha(Pessoa p) {
    p.apresentar();
}
}
