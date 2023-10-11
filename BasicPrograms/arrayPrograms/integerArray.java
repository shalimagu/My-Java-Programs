package BasicPrograms.arrayPrograms;

import java.util.Arrays;

public class integerArray {

    public static void main(String[] args) {
        int numbers[] = {23, 48, 78, 90, 89};
        System.out.println("number at first position is  "+numbers[0]);
        System.out.println("The array length is : "+numbers.length);
        System.out.println("The sum of array is  :"+Arrays.stream(numbers).sum());
        System.out.println("The max of array is :"+ Arrays.stream(numbers).max());
        System.out.println("The min of array is :"+Arrays.stream(numbers).min());
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The numbers are:+"+numbers[i]);


        }
    }

}
