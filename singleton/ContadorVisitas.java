package singleton;

public class ContadorVisitas{
  /*
  6.  Crie uma classe Singleton chamada ContadorVisitas que:
-tenha um atributo total, começando em 0;
-tenha um método registrarVisita() que soma 1 ao total;
-tenha um método getTotal() que devolve o total. */

  private static ContadorVisitas instancia = new ContadorVisitas();
    private int total = 0;

     private ContadorVisitas() {
    }
    
    public static ContadorVisitas getInstancia() {
        return instancia;
    }

    public void registrarVisita() {
        total++;
    }

    public int getTotal() {
        return total;
    }
  }
