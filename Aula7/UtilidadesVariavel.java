package Aula7;

public class UtilidadesVariavel {

  //Atividade2
  static void saudar(String nome) {

  System.out.println("Olá! " + nome + " ,tudo bem?");
        
  }
  
  //Atividade3
  static void dobro(int numero){
  System.out.println(numero * 2);

  }
  //Atividade4

  public static double calcularMedia(double n1, double n2){
    return (n1 + n2) / 2;
  }
  
  public static boolean ehMaiorDeIdade(int idade){
    return idade >= 18;
  }

  
}
