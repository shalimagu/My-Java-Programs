package BasicPrograms.arrayPrograms;

public class concatArray2 {
    public static void main(String[] args) {
       int array1[]={1,2,3,4,5};
       int array2[]={6,7,8,9,10,11};
       System.out.println("Array1 contains " + array1.length+ "  elements" );
        System.out.println("Array2 contains " + array2.length+ "  elements" );
        int array3[]= new int [array1.length +array2.length];


    for(int i=0;i<array1.length;i++)
{
     array3 [i]=array1[i];
}
        for(int i=0;i<array2.length;i++)
        {
            array3[array1.length+i]=array2[i];
        }

        System.out.println("Elements are");
        for(int i=0;i<array3.length;i++)
        {
            System.out.print(array3[i]+" ");}

    }





}
