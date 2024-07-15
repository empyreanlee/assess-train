package frequentChar;

//   Design a function that takes a string or sequence of characters as input and
//   returns the character that appears most frequently.
//   Eg 11189 => '1'
//   hello => l
//
import java.util.HashMap;

public class mostFrequent {
    String str;
    public void recurrent(String str){
        int count = 0;
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);

            if(count < map.get(c)){
                answer = c;
                count = map.get(c);
            }
        }
        System.out.println("The most Frequent char : "+ answer);
    }
    public static void main(String[] args) {
        mostFrequent most = new mostFrequent();
        most.recurrent("11122345");
    }
}
