package org.assign;
//   Question 1
//   Design a function that reverses the digits of an integer. For example, 50
//   should become 5 and -12 should become -21.

interface IntToString{
    void method(int number);
    String secondMethod(int number);
}
public class reverseInt {
    static class solution implements IntToString{
        int number;
        public String secondMethod(int number){
            StringBuilder str = new StringBuilder(String.valueOf(number));
            str.reverse();
            return str.toString();
        }
        int digit, reverse=0;
        @Override
        public void method(int number) {
            while(number != 0) {
                digit = number % 10;
                reverse = (reverse * 10) + digit;
                number = number / 10;
            }
            System.out.println(reverse);
        }
    }
    public static void main(String[] args) {
        solution obj = new solution();
        obj.number = 50;
        System.out.println(obj.secondMethod(obj.number));
        obj.method(obj.number);
    }
}
