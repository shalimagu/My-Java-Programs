package BasicPrograms.arrayPrograms;
//write a program to find min number in an array
public class findMinArray {
    public static void main(String[] args) {
        int age[]={23,56,78,67,50,3};
        int min=age[0];
        for(int i=1;i<age.length;i++)

        {

            if(age[i]<min)
            {
                min=age[i];
            }
        }
        System.out.println("The minimum number from the array is  "+min);



    }
}
