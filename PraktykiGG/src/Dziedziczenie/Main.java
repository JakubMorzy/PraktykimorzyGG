package Dziedziczenie;

public class Main
{
        //Zadanie 1
    public static void main(String[] args)
        {
        Kwadrat kwadrat = new Kwadrat(4);
        System.out.println(kwadrat.obliczPole());

        Prostokąt prostokat = new Prostokąt(4,2);
        System.out.println(prostokat.poleProstokata());

        //Zadanie 2
        System.out.println();
        Pies pies = new Pies(4,4,"Azor","czarna",12 );
        pies.dajGłos();

        //Zadanie 3
        System.out.println();
        spawacz spawacz = new spawacz("niebezpieczna", 1525.25, "cały");
        spawacz.wykonujePrace();

        //Zadanie 4
        //a. Odp: Metodą 1 i 4.
        //b. Odp: Nie widać metody numer trzy.
        }
        }