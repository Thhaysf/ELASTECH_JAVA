package aula0710;

import java.util.ArrayList;

public class AtvInterface3 {
public static void main(String[] args) {
  

ArrayList <Veiculo> veiculo = new ArrayList<>();

veiculo.add(new Carro());
veiculo.add(new Moto());

for (Veiculo Veiculo : veiculo) {
    Veiculo.ligar();
  Veiculo.acelerar();

}

}

}

