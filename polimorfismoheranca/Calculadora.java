package polimorfismoheranca;

public class Calculadora {
  
  public void calcularArea(double ladodoquadrado){
    System.out.println( (ladodoquadrado * ladodoquadrado));

  }

public void calcularArea(double base, double altura){
    System.out.println( (base * altura));
  }

public void calcularArea(int raio){
    System.out.println((3.14159 *(raio * raio)));
  }


}
