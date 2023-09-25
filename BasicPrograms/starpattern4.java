package BasicPrograms;

public class starpattern4 {

    public static void main(String[] args) {

      star4(5);

    }

    static void  star4(int n)
    {
       for(int r=1;r<=n;r++)
       {
           for(int c=1;c<=n-r+1;c++ )
           {
               System.out.print("*");
           }
           System.out.println();
       }

    }


}
