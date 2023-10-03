package BasicPrograms.arrayPrograms;
//write a program to find duplicate number in an array
public class findDuplicateIntArray {
    public static void main(String[] args) {

        int age[]={12,34,67,89,90,5,12};
        int duplicate=age[0];
        for(int i=0;i<age.length;i++)
        {
            if(age[i]==duplicate)
                duplicate= age[i];
        }
        System.out.println(duplicate);
    }
}
