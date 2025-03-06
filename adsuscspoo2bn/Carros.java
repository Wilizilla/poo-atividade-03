package adsuscspoo2bn;

public class Carros {
    //Atibutos
    String modelo;
    String cor;
    String marca;
    double velocidadeMax;

    public Carros(String modelo, String cor,  String marca, double velocidadeMax) {
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.velocidadeMax = velocidadeMax;
    }

    //métodos
    public void ligar() {
        System.out.println("Ligado");
    }

    public void frear() {
        System.out.println("Freando");
    }

    public void acelerar(double kms) {
        System.out.println("Acelera até " + kms + " Km/s");
    }

    public void caracteristicas() {
        System.out.println("Dados do modelo " + this.modelo + "\nCor: " + this.cor + "\nMarca: " + this.marca + "\nVelocidade Máxima: " + this.velocidadeMax + "\n");
    }
}
