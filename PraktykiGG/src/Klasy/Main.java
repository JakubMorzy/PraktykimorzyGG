package Klasy;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //zadanie 1
        System.out.println();
        Trojkat trojkat = new Trojkat(1,2,30);
        trojkat.ObliczPole();
        System.out.println(trojkat.getPole());
        //zadanie  2
        System.out.println();
        Prostokat prostokat = new Prostokat(5,6);
        prostokat.PoleProstokat();
        System.out.println(prostokat.PoleProstokat());
        prostokat.Przekatne();
        System.out.println(prostokat.Przekatne());
        //zadanie 3
        System.out.println();
        if(trojkat.getBokA()> prostokat.getBokA()){
            System.out.println("Bok trójkąta o wymiarach "+trojkat.getBokA()+" jest większy od boka prostokąta o wymarach "+prostokat.getBokA());
        }
        if(trojkat.getBokA()< prostokat.getBokA()) {
            System.out.println("Bok prostokąta o wymiarach " + prostokat.getBokA() + " jest większy od boka trójkąta o wymiarach " + trojkat.getBokA());
        }
        //zadanie 4
        System.out.println();
        Scanner scan = new Scanner(System.in);
        boolean dzialaProgram = true;
        while(dzialaProgram) {
            kalkulator kalkulator = new kalkulator();
            System.out.println("1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie, 5-stop");
            int choice = scan.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Wybrałeś dodawanie. Wskaż liczby: ");
                    double a = scan.nextDouble();
                    double b = scan.nextDouble();
                    System.out.println("Dodawnie = "+kalkulator.dodawanie(a,b));
                    break;
                case 2:
                    System.out.println("Wybrałeś odejmowanie. Wskaż liczby: ");
                    double c = scan.nextDouble();
                    double d = scan.nextDouble();
                    System.out.println("Odejmnowanie = "+kalkulator.odejmowanie(c,d));
                    break;
                case 3:
                    System.out.println("Wybrałeś mnożenie. Wskaż liczby: ");
                    double e = scan.nextDouble();
                    double f = scan.nextDouble();
                    System.out.println("Mnożenie = "+kalkulator.mnozenie(e,f));
                    break;
                case 4:
                    System.out.println("Wybrałeś dzielenie. Wskaż liczby: ");
                    double g = scan.nextDouble();
                    double h = scan.nextDouble();
                    System.out.println("Dzielenie = "+kalkulator.dodawanie(g,h));
                    break;
                case 5:
                    System.out.println("Wybrano opcje powodującą zakończenie korzystania z kalkulatora.");
                    dzialaProgram = false;
                    break;
            }
        }

        System.out.println();
        okrag okrag = new okrag(8,5);
        System.out.println("Pole= "+okrag.Pole()+"\n Obwod= "+okrag.Obwod());
        System.out.println(okrag.getPromien());

    }
}