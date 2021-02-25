public class Pętle
{
    public static void main(String[] args)
    {
        //Zadanie 1 Napisz pętle, która wypisze znaki(A-Z) z tabeli ASCII
        //Wynikiem mają być wypisane znaki (!! CO DRUGI !!) .
      char litera = 'A';

      for (int i = 0; i < 26; i++) {
          if (i % 2 == 0)
              System.out.print(litera + "\t");
          litera++;
      }

            System.out.println(" ");

      //Zadanie 2 Napisz pętle, która wypisze ciąg fibonacciego o długości X
      //(gdzie x jest zdefinowana zmienną)
        int x = 0, y = 1, z, v = 10;
        for (int i = 0; i<v; i++){
            z = x + y;
            x = y;
            y = z;
            System.out.print(z + " ");
        }
    }
}
