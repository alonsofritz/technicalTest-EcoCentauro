import java.util.Scanner;

class UsernameValidator {
    public static final String regularExpression = "([a-zA-Z])(\\w){7,29}";

    public UsernameValidator() {
    
    }
}

public class validUsernameChecker {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        Integer n = Integer.parseInt(entry.nextLine());

        for (Integer i = 0; i < n; i++) {
            
            String userName = entry.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }

        entry.close();
    }
}