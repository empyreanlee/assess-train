package org.assign;
//   Question 1
//   Design a function that reverses the digits of an integer. For example, 50
//   should become 5 and -12 should become -21.

interface IntToString{
    void method(int number);
    //String secondMethod(int number);
}
public class reverseInt {
     static class solution implements IntToString{
        int number;
        /**public String secondMethod(int number){
            StringBuilder str = new StringBuilder(String.valueOf(number));
            str.reverse();
            return str.toString();
        }**/
        int mod, reverse=0;
        @Override
        public void method(int number) {
            int originalNum = number;
            while(number != 0) {
                mod = number % 10;
                reverse = (reverse * 10) + mod;
                number /= 10;
            }
            System.out.println("The number "+ originalNum + " reversed is: " + reverse);
        }
    }
    public static void main(String[] args) {
        solution obj = new solution();
        obj.number = -50;
        obj.method(obj.number);
    }
}
