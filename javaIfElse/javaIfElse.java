import java.util.*;

class Result{
    public static String javaIfElse(Integer n) {

        if (n % 2 != 0) {
            return "Weird";
        } else if (n >= 2 && n < 5) {
            return "Not Weird";
        } else if (n >= 6 && n <= 20) {
            return "Weird";
        } else if (n > 20) {
            return "Not Weird";
        } else {
            return "Error State";
        }
    }
}

public class javaIfElse {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        Integer n = entry.nextInt();

        System.out.println(Result.javaIfElse(n));

        entry.close();
    }
}
