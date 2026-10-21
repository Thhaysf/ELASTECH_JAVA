package singleton;

import java.util.zip.CRC32C;

public class Carrinho {
  /*
   Crie uma classe Singleton chamada Carrinho que:
-tenha um atributo quantidadeItens, começando em 0;
-tenha um método adicionarItem() que soma 1 à quantidade;
-tenha um método getQuantidadeItens() que devolve a quantidade. */

  private static Carrinho instancia = new Carrinho();

private int quantidade = 0 ;

private Carrinho () {

}

  public static Carrinho getInstancia() {
        return instancia;
    }

  private int quantidadeItens(){
    return 0;
  }

  public void adicionarItem(){
      quantidade++;
  }

   public int getQuantidadeItens(){
        return quantidade;
    }
}
