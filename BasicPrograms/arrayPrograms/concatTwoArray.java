package BasicPrograms.arrayPrograms;

import java.util.Scanner;

// not completed
public class concatTwoArray {
    public static void main(String[] args) {
        System.out.println("how many elements do u want to add");
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();

        System.out.println("enter elements to s2");

        int s2[]=new int[s1];
        for(int j=0;j<s2.length;j++)
        {
            s2[j]=sc.nextInt();
        }
        System.out.println("enter elements to s3");

        int s3[]=new int[s1];
        for(int i=0;i<s3.length;i++)
        {
            s3[i]=sc.nextInt();
        }
        System.out.println("concat");
        int s4[ ]=new int [s1*2];
        for(int i=0;i<s2.length;i++)
        {
          s4 [i] =s2[i];
        }

        for(int i=0;i<s3.length;i++)
        {
            s4[s2.length+i]=s3[i];

        }
        for(int i=0;i<s4.length;i++)
        {
            System.out.print(s4[i]+" ");
        }












       }


    }

