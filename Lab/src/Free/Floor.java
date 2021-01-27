package Free;

import Interfaces.Drying;

public class Floor implements Drying {
    private double wetarea;
    private boolean wet;
    private final double SQ;

    public Floor(double sq) {
        this.SQ = sq;
    }

    public boolean isWet() {
        return wet;
    }

    public double getSQ() {
        return SQ;
    }

    public void flood(double percent){
        wetarea = percent * SQ / 100;
    }

    public double getWetarea() {
        return wetarea;
    }

    @Override
    public void dry(double cleanArea) {
        wetarea -= cleanArea;
        if (wetarea > 0){
            wet = true;
        }
    }

    @Override
    public String toString() {
        if (getWetarea() > 0.2 * getSQ())
            return "Flood" ; //"Потоп";
        else return "wet floor"; //"Мокрый пол";
    }
}
