import java.util.Scanner;

class Result {
    public static String hackerrankInString(String s) {
        String targetSubString = "hackerrank";

        if (s.length() < targetSubString.length()) {
            return "NO";
        }

        Integer j = 0;
        for (Integer i = 0; i < s.length(); i++) {
            if (j < targetSubString.length() && s.charAt(i) == targetSubString.charAt(j)) {
                    j++;
            }
        }
        
        return (j == targetSubString.length() ? "YES" : "NO");
    }
}

public class hackerrankInAString {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Integer q = entry.nextInt();
        while (!(q >= 2 && q <= Math.pow(10, 2))){
            q = entry.nextInt();
        }

        for(Integer i = 0; i < q; i++){
            String s = entry.next();

            while(!(s.length() >= 10 && s.length() <= Math.pow(10, 4))){
                s = entry.next();
            }

            System.out.println(Result.hackerrankInString(s));
        }

        entry.close();
    }
}
