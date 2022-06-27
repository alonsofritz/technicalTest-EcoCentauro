import java.util.*;

class Result {
    public static void javaDatatypes(Integer t, Long n) {
        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
            System.out.println("* byte");
        }
        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
            System.out.println("* short");
        }
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
            System.out.println("* int");
        }
        if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
            System.out.println("* long");
        }
    }
}

public class javaDatatypes {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Integer t = entry.nextInt();
        
        for (Integer i = 0; i < t; i++) {
            
            try {
                Long n = entry.nextLong();
                System.out.println(n + " can be fitted in:");

                Result.javaDatatypes(t, n);

            } catch (Exception e) {
                System.out.println(entry.next() + " can't be fitted anywhere.");
            }
        }

        entry.close();

    }
}
