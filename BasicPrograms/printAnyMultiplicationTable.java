package BasicPrograms;
import java.util.Scanner;
public class printAnyMultiplicationTable {
    public static void main(String[] args) {
      int no;
      System.out.println("Please Enter which multiplication  table do u want to print");
      Scanner sc=new Scanner(System.in);
      no=sc.nextInt();

      for(int i=1;i<=10;i++)
      {
          System.out.println(no + "*"+ i +"=" +no*i);
      }



    }
}
