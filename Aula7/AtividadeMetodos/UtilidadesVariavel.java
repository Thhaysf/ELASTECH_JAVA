package Aula7.AtividadeMetodos;

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
  
  //Atividade5

  public static boolean ehMaiorDeIdade(int idade){
    return idade >= 18;
  }

  //atividade6
 public static int soma(int n1, int n2){
  return (n1 + n2);
  }

  public static int soma(int n1, int n2 , int n3){
  return (n1 + n2 + n3);
  }

public static double soma(double n1,double n2 ){
  return (n1 + n2);
  }

  //Atividade7

  public static void saudacao() {
    System.out.println("Olá!");
}

public static void saudacao(String nome) {
    System.out.println("Olá, " + nome + "!");
}
}

  

