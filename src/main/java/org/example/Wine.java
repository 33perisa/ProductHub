package org.example;

public class Wine extends Product {
    double zapreminaBoce;
    private static final double dodatniPorez = 10;

    public Wine(String nazivProizvoda, double barKod, double osnovnaCena, double zapreminaBoce) {
        super(nazivProizvoda, barKod, osnovnaCena);
        this.zapreminaBoce = zapreminaBoce;

    }
    @Override
    public double izracunajFinalnuCenu() {
        return super.izracunajFinalnuCenu() * (1 + dodatniPorez / 100);
    }

    @Override
    public String infString() {
        return super.infString() + "\n" +
                "Zapremina boce vina: " + zapreminaBoce;
    }

}