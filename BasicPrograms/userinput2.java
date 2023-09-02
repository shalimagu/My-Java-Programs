package BasicPrograms;

import java.util.Scanner;

public class userinput2 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter you age");
        Scanner s1=new Scanner(System.in);
        age=s1.nextInt();
        System.out.println("You are   "+age+ "  Years old");
    }
}
