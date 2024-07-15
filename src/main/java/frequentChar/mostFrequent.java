package frequentChar;

//   Design a function that takes a string or sequence of characters as input and
//   returns the character that appears most frequently.
//   Eg 11189 => '1'
//   hello => l
//
import java.util.HashMap;

public class mostFrequent {
    String str;
    public static char recurrent(String str){
        int count = 0;
        char mostfrequent = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<str.length()-1;i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);

            if(count < map.get(c)){
                mostfrequent = c;
                count = map.get(c);
            }
        }
        return mostfrequent;
    }
    public static void main(String[] args) {
        char mostfrequent = recurrent("11122345");
        System.out.println("The most Frequent char : " + mostfrequent);
    }
}
