import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {
    
    private String pattern = "((\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4][0-9]|25[0-5])";
    
    public MyRegex() {
    
    }

    public String getPattern() {
        return this.pattern;
    }
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

}

public class javaRegex {
    public static void main(String[] args){
        
        Scanner entry = new Scanner(System.in);

        while(entry.hasNext()){
            String ip = entry.next();
            System.out.println(ip.matches(new MyRegex().getPattern()));
        }

    }
}
