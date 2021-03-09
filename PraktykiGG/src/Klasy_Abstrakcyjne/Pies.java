package Klasy_Abstrakcyjne;

public class Pies extends Zwierze implements Domowezwierze, Pies2
{

    @Override
    public void badzMilutki()
    {
        System.out.println("hau hau");
    }

    @Override
    public void bawSie()
    {
        System.out.println("Bawi się");
    }

    @Override
    public void wiek()
    {
    }

    @Override
    public void nazwa()
    {
    }

}
