package arrays;

import java.util.Random;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        //Przykład 5
        double[] power = {23.45, -2.22, 45.90, 67.45, -56, 234.11, -34.8, 90.4, -77};
        for(int i = 0; i < power.length; i++){
            System.out.println("Power["+i+"] = "+power[i]);
        }
        double min = 9999;
        double max = -9999;
        int mormin = 0;
        int mormax = 0;

        for ( int i = 0; i < power.length; i++){
            if (power[i] < min) {
                min = power[i];
                mormin = i;
            }
            if (power[i] > max){
                max = power[i];
                mormax = i;
            }
        }
        System.out.println();
        System.out.println("Po zamianie: \n");
        power[mormin] = max;
        power[mormax] = min;
        for(int i = 0; i < power.length; i++){
            System.out.println("Power["+i+"] = "+power[i]);
        }
        //Przykład 6
        double[] power6=power;
        int x = power.length-1;
        int h = power.length / 2;
        for(int i=0; i < h; i++){
            double y=power6[i];
            power6[i] = power6[x];
            power6[x] = y;
            x--;

        }
        System.out.println();

        for(int i = 0; i < power6.length; i++){
            System.out.println("Power["+i+"] = "+power6[i]);
        }
        //Przykład 7
        System.out.println();

        Random random = new Random();
        int wylosowanaliczba;

        wylosowanaliczba= random.nextInt(power.length);
        double pierwsza=power[wylosowanaliczba];
        System.out.println("Wylosowano : "+pierwsza);
        wylosowanaliczba= random.nextInt(power.length);
        double druga=power[wylosowanaliczba];
        System.out.println("Wylosowano : "+druga);
        if(druga==pierwsza){
            System.out.println(pierwsza+" Jest równa "+druga);
        }
        if(druga>pierwsza){
            System.out.println(druga+" Jest większa od "+pierwsza + "\n Czyli :"+pierwsza+" Jest mniejsza od "+druga);
        }
        if(druga<pierwsza){
            System.out.println(druga+" Jest mniejsza od "+pierwsza+"\nCzyli :"+"\n"+pierwsza+" Jest większa od "+druga);
        }

        //Przykład 8
        Scanner scanner = new Scanner(System.in);
        String[] person = new String[4];

        System.out.println("Wybierz Imie :");
        person[0] = scanner.next();

        System.out.println("Wybierz Rasa :");
        person[1] = scanner.next();

        System.out.println("Wybierz Klasa :");
        person[2] = scanner.next();

        System.out.println("Wybierz broń :");
        person[3] = scanner.next();

        System.out.println("Twoja postać to : \n" + person[0] + "\n" + person[1] + "\n" + person[2] + "\n" + person[3]);


    }
}
