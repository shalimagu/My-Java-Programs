package BasicPrograms;

 import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {

       System.out.println("Hello , Can you please type your name: ");
        Scanner s1=new Scanner(System.in);
       String name=s1.nextLine();
       System.out.println("Hello   " +name +"   Welcome to ATB4X");


    }
}
