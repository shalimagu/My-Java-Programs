package BasicPrograms.arrayPrograms;

//write a program to find max number in an array

public class maxNumberArray {
    public static void main(String[]args)

    {
        int[] age={23,78,90,56,67};
        int max= age[0];

        for(int i=1;i<age.length;i++)
        {
         if (age[i]>max)
         {
             max=age[i];
         }

        }
        System.out.println("The maximum number from the array is  "+max);
    }
}
