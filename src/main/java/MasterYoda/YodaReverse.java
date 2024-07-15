package MasterYoda;

//  Question 6

//  Master Yoda, a renowned Jedi Master from the Star Wars universe, is known
//  for his unique way of speaking. He often reverses the order of words in his
//  sentences. For example, instead of saying "I am home" he might say "Home
//  am I" Design a function that takes a sentence as input and returns a new
//  sentence with the words reversed in the same order that Master Yoda would
//  use.
public class YodaReverse {

    public static String reverseYoda(String str){
        String[] arr =  str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for(int i = arr.length-1; i>=0; i--){
            reversed.append(arr[i]).append(" ");
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String str = "Hello World , I am Master Yoda";
        String reversed = reverseYoda(str);
        System.out.println(reversed);
    }
}
