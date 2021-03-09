package wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        try {

            int[] tablica = new int[4];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {


                tablica[i] = scanner.nextInt();
                System.out.println("Tablica[" + i + "] ma Wartość " + tablica[i]);
            }
        }
        catch (InputMismatchException inputMismatchException){
            System.out.println("Błedne Liczby");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Przekroczona Wielkość Tablicy");
        }
    }

}



