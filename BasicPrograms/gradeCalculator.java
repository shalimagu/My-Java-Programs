package BasicPrograms;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        int marks;
        System.out.println("please enter your marks to know your Grade");
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();

        if(marks>90 && marks<100)
        {
            System.out.println("Congrats you got Grade A");
        }
        else if(marks >80 && marks<90)
        {
            System.out.println("You got grade B");
        }
        else if(marks >70 && marks<80)
        {
            System.out.println("You got grade C");
        }
        else if(marks >50 && marks<70)
        {
            System.out.println("You got grade D");
        }
        else
        {
            System.out.println("Sorry you are failed");
        }


    }


}
