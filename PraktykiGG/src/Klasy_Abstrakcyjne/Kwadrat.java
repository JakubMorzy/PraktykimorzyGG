package Klasy_Abstrakcyjne;

public class Kwadrat implements ObliczeniaDlaFigur
{
    private double bokA;

    @Override
    public void obliczpole() {
        System.out.println( bokA * bokA);
    }

    @Override
    public void obliczobw() {
        System.out.println(bokA * 4);
    }

    public Kwadrat(double bokA) {
        this.bokA = bokA;
    }
}