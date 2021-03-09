package Klasy_Abstrakcyjne;

public class Samochod implements Pojazd
{
    public boolean stop;

    @Override
    public void stop()
    {
        System.out.println("Zatrzymuje się");
    }

    public void skrecwLewo()
    {
        System.out.println("Skręcam w lewo");
    }
}
