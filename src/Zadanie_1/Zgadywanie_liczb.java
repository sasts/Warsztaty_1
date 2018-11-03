package Zadanie_1;

import java.util.Random;
import java.util.Scanner;

public class Zgadywanie_liczb {

    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        //System.out.println(number);
        Scanner scan = new Scanner(System.in);
        System.out.print("Zgadnij liczbę: ");
        while ( !scan.hasNextInt()) {
            scan.next();
            System.out.println("To nie jest liczba.");
        }
        int guessNumber = scan.nextInt();
        do {
            if ( guessNumber < number ) {
                System.out.println("Za mało.");
                System.out.print("Zgadnij liczbę: ");
                guessNumber = scan.nextInt();
            }
            if ( guessNumber > number ) {
                System.out.println("Za dużo.");
                System.out.print("Zgadnij liczbę: ");
                guessNumber = scan.nextInt();
            }
        } while ( number != guessNumber);
        if ( guessNumber == number ) {
            System.out.println("Zgadłeś!");
        }
    }
}
