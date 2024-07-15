package pangram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

//   Design a function that determines whether a given string is a pangram. A
//pangram is a sentence or phrase containing every letter of the alphabet at
//least once. Punctuation and case are typically ignored. For example, the
//string "The quick brown fox jumps over the lazy dog" is a pangram, while
//"Hello, world!" is not.

public class Pangram {
    public static boolean pangram(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> chars = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) chars.add(c);
        }
        return chars.size() == 26;
    }
    public static void main(String[] args) {
        //String alpha = "abcdefghijklmnopqrstuvwxyz";
        String quest = "The quick brown fox jumps over the lazy dog";
        if(pangram(quest)) System.out.println("String \"" + quest + " is a Pangram");
        else System.out.println("String \"" + quest + " is not a Pangram \"");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an a example: ");
        //   Example  "When zombies arrive quickly fax judge pat"
        String isPangram = scanner.nextLine();
        if(pangram(isPangram)) System.out.println("String \"" + isPangram + " is a Pangram");
        else System.out.println("String \"" + isPangram + " is not a Pangram");
        }
}
