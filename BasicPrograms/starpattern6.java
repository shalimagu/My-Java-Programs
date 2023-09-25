package BasicPrograms;

public class starpattern6 {

// not complete
    public static void main(String[] args) {
star6(5);
    }
    static void star6(int n)
    {
        for(int r=1;r<=n;r++)

        {
            for(int c=1;c<=n-r+1;c++)
            {
                System.out.print("*");
            }

System.out.println();
        }
    }
}
