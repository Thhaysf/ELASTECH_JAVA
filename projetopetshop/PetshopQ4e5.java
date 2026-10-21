package projetopetshop;

public class PetshopQ4e5 {
  public static void main(String[] args) {
    //4°
Pet petShopNovo = new Pet();

petShopNovo.nome = "Mel";
petShopNovo.especie = "Cachorro";
petShopNovo.peso = 8.5;

 //5°
    
petShopNovo.porte = petShopNovo.definirPorte();

System.out.println("== Informações do seu Pet para cadastro! ==\nNome: "+ petShopNovo.nome + "\nEspécie: " + petShopNovo.especie+ "\nPeso: " + petShopNovo.peso + "kg\nPorte: "+ petShopNovo.porte);

  }
}
