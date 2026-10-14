package Aula0710;

import java.util.ArrayList;

public class AtvInterface  {

  public static void main(String[] args) {
    
  /*Cachorro dog = new Cachorro();
  dog.emitirSom();

  Animal bidu = new Cachorro();
  Animal salem = new Gato();

  bidu.emitirSom(); salem.emitirSom();  */
    
  ArrayList <Animal> animais = new ArrayList<>();

animais.add(new Cachorro());
animais.add(new Gato());

for (Animal Animal : animais) {
    Animal.emitirSom();
}
  }
}