package aula0810;

public class Professora extends Pessoa {
  String disciplina;

  public void lancarNota (String aluna, double nota){
System.out.printf("%s lançou nota %.1f para a %s. \n",nome,  nota, aluna) ;

  }
@Override 
public void apresentar () {
System.out.println("Oi, sou " + nome + " e ensino " + disciplina + " .");

/* void apresentar(String cargo) {
    System.out.println("Oi, sou " + nome + ", " + cargo);*/

}
}
