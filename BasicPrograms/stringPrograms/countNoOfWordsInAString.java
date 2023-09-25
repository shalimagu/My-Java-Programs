package BasicPrograms.stringPrograms;

public class countNoOfWordsInAString {
    public static void main(String[] args) {

        String str1="I Am Shalima";
        int count=1;


        for(int i=str1.length()-1;i>=0; i--)
        {
            if (str1.charAt(i) == ' ')
            {

                count= count+1;
            }

        }

        System.out.print(count);



    }

}
