package Klasy_Abstrakcyjne;

public class Wino implements PodajRocznikWina
{
    public int rocznikWina;
    public String markaWina;

    @Override
    public void rocznikWina()
    {
        System.out.println("1997");
    }

    @Override
    public void markaWina()
    {
        System.out.println("Monte");
    }
}
