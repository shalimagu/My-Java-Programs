package BasicPrograms;

public class starpattern5 {


    public static void main(String[] args) {
       star5(5);

    }
    static void star5(int n)
    {
        for(int r=1;r<=n;r++)
        {
            for(int c=1;c<=r;c++)
            {
                System.out.print(c);
            }
            System.out.println();

        }


    }




}

