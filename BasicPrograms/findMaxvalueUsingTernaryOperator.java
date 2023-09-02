package BasicPrograms;

public class findMaxvalueUsingTernaryOperator {
    public static void main(String[] args) {
        int a=23,b=35,c=67,max;
        max=(a>b && a>c)?a:
                (b>a && b>c)?b:c;
        System.out.println("The max of 23,35 and 67 is  :"+max);

    }
}
