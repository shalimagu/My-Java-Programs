package BasicPrograms.stringPrograms;

public class findTotalLetersInAString {

    public static void main(String[] args) {
        int count=0;
        String str1= "how are u ";
        int total=str1.length();

        for(int i=str1.length()-1;i>=0; i--)
        {
            if (str1.charAt(i) == ' ')
            {
                count= count+1;
            }

        }
        System.out.print("Total letters are  ");
    System.out.println(total- count);
    }
}
