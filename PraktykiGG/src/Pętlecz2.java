import java.util.Scanner;

public class Pętlecz2
{
    public static void main(String[] args) {
        //Zadanie 3 Napisz program który będzie obsługiwał instrukcje switcha.
        // Zadanie będzie polegało na tym aby użytkownik za pomocąpodania liczby od 1-5 wyszedł z Lochów.
        //Jako Twórca stwórz 5 “casów” z przypisanymi do nich drzwiami.
        //Tylko 1 drzwi są prawidłowe i prowadzą do wyjścia.Program ma nas pytać cały czas dopóki nie wybierzemy poprawnie!(Użyjcie pętli)
        Scanner sc = new Scanner(System.in);
        boolean programIsRunning = true;

        while (programIsRunning) {
            System.out.print("Podaj numer drzwi: ");
            String userInput = sc.next();

            switch (userInput) {
                case "1": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                case "2": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                case "3": {
                    programIsRunning = false;
                    break;
                }
                case "4": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                case "5": {
                    System.out.println("Złe drzwi >:)");
                    break;
                }
                default: {
                    System.out.println("Podałeś złe dane!");
                }
            }
        }

        System.out.println("Bravo skończyłeś lochy!");
        System.out.println();
        /*Zadanie 4
         Za pomocą zagnieżdżonej pętli (for w forze) wypisz poniższy przykład(W Konsoli).
         Następnie za pomocą modulo(%) wyświetl tylko liczby podzielne przez 3 i 2:*/

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i < 10; i++) {
            for (int n = 1; n < 10; n++) {
                if (i*n%2==0 && i*n%3==0){
                    System.out.print(i*n+"\t");}
                else {
                    System.out.print("X"+"\t");
                }
            }
            System.out.println();
        }
        System.out.println();
    /*Zaddanie 5
    Narysuj trójkąt za pomocą 2-óch pętli.*/
        int h  = 9;


        for (int i = 0; i < h; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("X ");
            }
            System.out.println();
        }
    }


























