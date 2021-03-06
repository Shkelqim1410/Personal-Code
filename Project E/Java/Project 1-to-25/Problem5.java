/*
    Smallest multiple
    Problem 5
        2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

        What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
public class Problem5 {

    public static void main(String [] arg) {
        System.out.println(findSmallestMultiple(10)); // 2520
        System.out.println(findSmallestMultiple(20)); // 232792560
    }

    public static long findSmallestMultiple(int n) {
        for (long i = n; i <= factorial(n); i += n) {
            if (isMultiple(i, n)) return i;
        }
        return -1;
    }
    
     public static boolean isMultiple(long x, int n) {
        for (int i = 1; i < n; i++) {
            if (x % i != 0) return false;
        }
        return true;
    }
    
    public static long factorial (long n) {
        if (n > 1) return n * factorial(n - 1);
        else if (n >= 0) return 1;
        else return -1;
    }
}