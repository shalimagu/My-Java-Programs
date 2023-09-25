package BasicPrograms.stringPrograms;

import java.sql.SQLOutput;

public class stringcreation {
    public static void main(String[] args) {
        String string1 = "My First String";
        String string2 = "  My Second String";
        String str3 ;
        System.out.println("String concat  "+ (str3 = string1 + string2) );
        System.out.println("String Length= " + str3.length());
        System.out.println("Change into LoweCase: " + str3.toUpperCase());
        System.out.println("Find Character at 3rd position :" + str3.charAt(3));
        System.out.println("Find string contain word First :" + str3.contains("First"));
        System.out.println(str3.isBlank());
        System.out.println(string1.substring(0,5));
    }
}




