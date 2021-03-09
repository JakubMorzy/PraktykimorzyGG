package Klasy_Abstrakcyjne;

public class Main

{
    public static void main(String[] args)
    {
        //Zadanie 1
        Zwierze zwierze = new Zwierze()
        {
            @Override
            public void badzMilutki()
            {
            }

            @Override
            public void wiek()
            {
            }

            @Override
            public void nazwa()
            {
            }
        };
        zwierze.wiek();
        zwierze.nazwa();
        zwierze.sprawdzCzyZyje();
        zwierze.czyjestzdrowe();
        System.out.println();

        //Zadanie 2

        Samochod samochod = new Samochod();
        samochod.skrecwLewo();
        samochod.stop();
        System.out.println();

        //Zadanie 3

        Wino wino = new Wino();
        wino.markaWina();
        wino.rocznikWina();
        System.out.println();

        //Zadanie 4
        
        Pies pies = new Pies();
        pies.badzMilutki();
        pies.bawSie();
        System.out.println();

        //Zadanie 5

        Kwadrat kwadrat=new Kwadrat(12);
        kwadrat.obliczpole();
        kwadrat.obliczobw();
    }
}