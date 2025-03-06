package adsuscspoo2bn;

public class testaCarros {
    public testaCarros() {
    }

    public static void main(String[] args) {
        Carros C1 = new Carros("Fusca", "Branco", "Volkswagen", 120);
        C1.caracteristicas();
        C1.ligar();
        C1.acelerar((double)20);
        C1.frear();
    }
}
