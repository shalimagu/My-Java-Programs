package BasicPrograms.switchPrograms;

import java.util.Locale;
import java.util.Scanner;

public class PrintVowels {

    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc=new Scanner(System.in);
        String c= sc.next();
        c=c.toLowerCase(Locale.ROOT);
        switch(c)
        {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            {
                System.out.println("Its a vowel");
                break;
            }
            default:
            {
                System.out.println("A consonant");
            }




        }
    }
}
