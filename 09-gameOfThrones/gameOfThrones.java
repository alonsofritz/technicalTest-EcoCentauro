import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Result {
    public static String gameOfThrones(String s) {
        Integer odd = 0;
        Integer even = 0;
        Map<Character, Integer> letters = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(letters.containsKey(c))
                letters.put(c, letters.get(c) + 1);
            else
                letters.put(c, 1);
        }

        for(Integer frequency : letters.values()) {
            if(frequency % 2 == 1) {
                odd++;
                continue;
            }
            if(frequency % 2 == 0) {
                even++;
            }
        }

        if(odd > 1) {
            return "NO";
        } else {
            return "YES";
        }
    }
}

public class gameOfThrones {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        String s = entry.nextLine();
        while(s.length() < 1  || s.length() > Math.pow(10, 5)) {
            s = entry.nextLine();
        }

        System.out.println(Result.gameOfThrones(s));

        entry.close();
    }
}
