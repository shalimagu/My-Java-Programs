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

    // write a program to print each words in new line
    public static class firstStringArray {
        public static void main(String[] args) {


            String first="This Is My First String";

            first+=" ";

            String Second="";

            for(int i=0;i<first.length();i++)
            {
                char c= first.charAt(i);
                        if(c!=' ')

                            Second=Second+c;


                        else {
                            System.out.println(Second);
                            Second="";
                        }


            }
           // System.out.println(Second);
        }
    }


    }

