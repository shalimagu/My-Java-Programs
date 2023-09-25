package BasicPrograms.stringPrograms;
// program to find total capital letters , small letters,white space and digits
public class totalCapitalLettersInAString {
    public static void main(String[] args) {

        String str1 = "Do Not Stop L1earning";
        int count = 0;
        int lowerCase=0;
        int digit=0;
        int whitespace=0;

          for(int i=0;i<=str1.length()-1;i++) {
              char c = str1.charAt(i);

              if(Character.isUpperCase(c))
              {
                  count=count+1;

              }
              else if(Character.isLowerCase(c))
              {
                  lowerCase=lowerCase+1;
              }
              else if (Character.isDigit(c))
              {
                  digit=digit+1;
              }
              else if(Character.isWhitespace(c))
              {
                  whitespace=whitespace+1;
              }

          }
          System.out.println("Total UpperCase letters are: "+count);
        System.out.println("Total lowercase letters are: " +lowerCase);
        System.out.println("Total Digits are :" + digit);
        System.out.println("Total whitespaces are:"+ whitespace);
    }
}