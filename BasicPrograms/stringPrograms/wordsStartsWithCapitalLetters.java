package BasicPrograms.stringPrograms;

import java.sql.SQLOutput;
import java.util.*;


//  find number of words which are starting with  capital letters
//ctrl+alt+l
public class wordsStartsWithCapitalLetters {
    public static void main(String[] args) {

        boolean shal = true;
        String str1 = "I Am shalima";
        String[] c = str1.split(" ");

        for (int i = 0; i < c.length; i++)
        {
            shal = true;
            if (Character.isUpperCase(c[i].charAt(0)))
            {

                shal = false;
            }
            if (shal == false) {
                System.out.print(c[i] + " ");
            }
        }


    }
}
