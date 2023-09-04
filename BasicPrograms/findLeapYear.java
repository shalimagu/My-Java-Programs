package BasicPrograms;

import java.util.Scanner;

public class findLeapYear {

    public static void main(String[] args) {
        int year;
        System.out.println("Hello there, please enter the year");
        Scanner sc=new Scanner(System.in);
        year=sc.nextInt();
         if((year%4==0) && (year%100!=0) || (year%400==0))
         {
    System.out.println(year + "  is a leap year");

         }
         else
             System.out.println(year+"  is not a leap year");
    }
}
