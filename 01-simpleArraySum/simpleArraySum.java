import java.util.*;

class Result {
    public static Integer simpleArraySum(Integer[] entryArray) {
        Integer sum = 0;

        for(Integer i = 0; i < entryArray.length; i++) {
            sum += entryArray[i];
        }

        return sum;
    }
}

class Utils {
    public static boolean checkLimitEntry(String[] tempEntryArray){
        for(Integer k = 0; k < tempEntryArray.length; k++){
          if (Integer.parseInt(tempEntryArray[k].trim()) > 1000)
            return true;
        }
        return false;
    }
}

public class simpleArraySum {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        Integer arrayCount = -1;
        while(arrayCount < 0 ) {
            arrayCount = Integer.parseInt(entry.nextLine().trim());
        }

        
        String[] tempEntryArray = entry.nextLine().split(" ");
        while(tempEntryArray.length > arrayCount || Utils.checkLimitEntry(tempEntryArray)){
            tempEntryArray = entry.nextLine().split(" ");
        }
        
        Integer[] entryArray = new Integer[arrayCount];

        for (Integer it = 0; it < arrayCount; it++) {
            Integer arrayItem = Integer.parseInt(tempEntryArray[it].trim());
            entryArray[it] = arrayItem;
        }
        
        Integer result = Result.simpleArraySum(entryArray);

        System.out.println(result);

        entry.close();
 
    }
}