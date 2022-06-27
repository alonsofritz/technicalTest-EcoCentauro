import java.util.*;
import java.lang.Math;

class Result {
    public static long repeatedString(String s, long n) {

        long num = n/s.length();
        long rem = n%s.length();
        long countChar = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                
                countChar += num;
                if (i < rem) {
                    countChar++;
                }
            }
        }

        return countChar;
    }
}

public class repeatedString {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String s = entry.next();
        long n = entry.nextLong();
        
        while(!(1 <= s.length() && s.length() <= 100) || !(1 <= n & n <= Math.pow(10, 6))) {
            s = entry.next();
            n = entry.nextLong();
        }

        System.out.println(Result.repeatedString(s, n));

        entry.close();
    }
}
