package org.assign;

//    Write a recursive function to calculate the factorial of a number

public class factorial {
        static int calculateFactorial(int number) {
            if (number == 0) {
                return 1;
            } else {
                return number * calculateFactorial(number - 1);
            }
        }
    public static void main(String[] args) {
            int number = 5;
            int fact = calculateFactorial(5);
            System.out.println("The factorial of "+ number + " is " + fact);

    }
}
