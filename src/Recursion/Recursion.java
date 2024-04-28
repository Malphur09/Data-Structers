package Recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Digit Sum of 1234: " + digitSum(1234) );
        System.out.println("Digit Sum of 123: " + digitSum(123) );
        System.out.println("Digit Sum of 12: " + digitSum(12) );
        System.out.println("Digit Sum of 99: " + digitSum(99) );
        System.out.println("Digit Sum of 55: " + digitSum(55) );
    }
    public static int digitSum(int n) {
        return (n < 10 ) ? n :(n % 10) + digitSum(n / 10);
    }
}

