package BasicPrograms;

import java.util.Scanner;

public class trafficlight {
    public static void main(String[] args) {
        System.out.println("Please enter which colour you are seeing now");
        Scanner sc=new Scanner(System.in);

        String colour=sc.next();

        switch(colour)
        {
            case "red":
            System.out.println("Next is yellow");
            break;
            case "yellow" :
                System.out.println("Next is Green");
break;
            case "green" :
                System.out.println("Next is red");

        }
    }
}
