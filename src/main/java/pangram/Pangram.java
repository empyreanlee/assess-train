package pangram;

import java.util.HashMap;
import java.util.Scanner;

public class Pangram {
    int count;
    Scanner scanner;
    public boolean pangram(String alphabet, String str) {

        str = str.replaceAll("\\s+","").toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i <alphabet.length(); i++ ){
            char ch = alphabet.charAt(i);
            if(!map.containsKey(ch)) return false;
        }
        return true;
    }

        public static void main(String[] args) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String quest = "The quick brown fox jumps over the lazy dog";
        Pangram p = new Pangram();
        if(p.pangram(alpha, quest)) System.out.println("String \"" + quest + " is a Pangram");
        else System.out.println("String \"" + quest + " is not a Pangram \"");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an a example: ");
        //   Example  "When zombies arrive quickly fax judge pat"
        String isPangram = scanner.nextLine();
        if(p.pangram(alpha, isPangram)) System.out.println("String \"" + isPangram + " is a Pangram");
        else System.out.println("String \"" + isPangram + " is not a Pangram");



        }
}
