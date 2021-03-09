package Klasy_Abstrakcyjne;

abstract public class Zwierze
{
    public abstract void badzMilutki();

    abstract public void wiek();
    abstract public void nazwa();

    public void sprawdzCzyZyje()
    {
        System.out.println("To zwierze jeszcze żyje.");
    }

    public void czyjestzdrowe()
    {
        System.out.println("To zwierze jest zdrowe!");
    }
}