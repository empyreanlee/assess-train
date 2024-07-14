package pangram;

import java.util.HashMap;

public class Pangram {
    int count;
    public boolean pangram(String alphabet, String str) {

        str = str.replaceAll("\\s+","").toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<alphabet.length();i++){
            char ch = alphabet.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i <str.length(); i++ ){
            char ch = str.charAt(i);
            if(!map.containsKey(ch)) return false;
        }
        return true;
    }

        public static void main(String[] args) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String quest = "the lazy brown fox jumped over the  dogs tail";
        Pangram p = new Pangram();
        if(p.pangram(alpha, quest)) System.out.println("String \"" + quest + " is a Pangram");
        else System.out.println("String \"" + quest + " is not a Pangram");


        }
}
