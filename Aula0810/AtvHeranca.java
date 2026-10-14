package Aula0810;

public class AtvHeranca {
  public static void main(String[] args) {
    
    Aluna aluna = new Aluna();
    aluna.nome = "Joana "; 
    aluna.idade = 20;
    aluna.apresentar();
    aluna.curso = "Odontologia";
    aluna.estudar();
    
    Professora professora = new Professora();
    professora.nome = "Flora";
    professora.disciplina = "anti-cáries";
    professora.apresentar();

    professora.lancarNota("Joana", 9.5);

  }
}
