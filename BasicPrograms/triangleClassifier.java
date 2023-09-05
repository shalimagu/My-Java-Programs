package BasicPrograms;

import java.util.Scanner;

public class triangleClassifier {
    //equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal).
    public static void main(String[] args) {


        int side1, side2, side3;
        System.out.println("Please enter the side length of triangle");
        Scanner sc = new Scanner(System.in);
        side1 = sc.nextInt();
        side2 = sc.nextInt();
        side3 = sc.nextInt();

        if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("isosceles");
        } else if (side1 == side2 && side2 == side3 ) {
            System.out.println("equilateral");
        } else
            System.out.println("scalene");
    }
}
