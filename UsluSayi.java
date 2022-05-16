import java.util.Scanner;

public class UsluSayi {
    public static void main (String[]args) {

        Scanner keyboard = new Scanner(System.in);

        int number = keyboard.nextInt();
        int power = keyboard.nextInt();

        int numberCarpim=1;

        for(int sayac = 0; sayac < power ; sayac++){

            numberCarpim =  numberCarpim * number;


        }

        System.out.println(numberCarpim);





























    }
}
