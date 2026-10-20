package projetopetshop;

public class Pet {
  
  //4°
  String nome ;
  String especie;
  double peso;
  String porte;

  //5°
  String definirPorte(){

    if (peso < 10) {
        return "Pequeno";
}
else if (peso < 25) {
        return "Médio";

}
else {
        return "Grande";

}
  }
}
