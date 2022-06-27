import java.io.*;
import java.util.Scanner;

class Results {
    public static Integer sumLength(String a, String b) {
        return a.length() + b.length();
    }

    public static String isLexicographical(String a, String b) {
        
        return (a.compareTo(b) > 0 ? "Yes" : "No");
    }

    public static String printStrings(String a, String b) {
        return Utils.capFirstLetter(a) + " " + Utils.capFirstLetter(b);
    }
}

class Utils {
    public static String capFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0,1).toUpperCase() + str.substring(1);
        }
    }
}

public class javaStringIntroduction {
    public static void main(String[] args) {
        
        Scanner entry = new Scanner(System.in);
        String a = entry.next();
        String b = entry.next();
        
        // Sum Lenghts
        System.out.println(Results.sumLength(a, b));

        // Compare lexicographical ordering
        System.out.println(Results.isLexicographical(a, b));

        // Print Concatenated Strings
        System.out.println(Results.printStrings(a, b));
        
    }
}
