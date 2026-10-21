package projetopetshop;

public class PetshopQ6 {
  public static void main(String[] args) {
    
    //6°
  Pet [] listaPets = new Pet[5];

Pet pet1 = new Pet();

pet1.nome = "Mel";
pet1.especie = "Cachorro";
pet1.peso = 8.5;
pet1.porte = "Pequeno";

listaPets[0] = pet1;
System.out.println("--- PETS CADASTRADOS ---");

System.out.printf("%s (%s) - %.1f kg - Porte %s%n",listaPets[0].nome, listaPets[0].especie, listaPets[0].peso,listaPets[0].porte);

}
 }