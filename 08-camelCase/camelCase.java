import java.util.Scanner;

class Result {
    public static Integer camelCase(String s) {
        
        Integer count = 1;

        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                count++;
            }
        }

        return count;
    }
}

public class camelCase {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String s = entry.next();
        entry.close();

        System.out.println(Result.camelCase(s));
    }
}
