/*
    Highly divisible triangular number
    Problem 12
        The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:

        1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

        Let us list the factors of the first seven triangle numbers:

        1: 1
        3: 1,3
        6: 1,2,3,6
        10: 1,2,5,10
        15: 1,3,5,15
        21: 1,3,7,21
        28: 1,2,4,7,14,28
        We can see that 28 is the first triangle number to have over five divisors.

        What is the value of the first triangle number to have over five hundred divisors?
*/
public class Euler12 {

    public static void main(String [] arg) {

        long start = System.currentTimeMillis();

        int j = 0;
        int n = 0;
        int numberOfDiv = 0;

        while(numberOfDiv <= 500) {

            numberOfDiv = 0;
            j++;
            n = triangleNumber(j);
            //System.out.print("\t"+":"+j+": "+n+" - "+Math.sqrt(n)+"\t\n");
            for(int i = 1; i <=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    numberOfDiv++;
                }
            }

            numberOfDiv *= 2;
        }

        long finish = System.currentTimeMillis();
        
        System.out.println(j);
        System.out.println(n);
        System.out.println("Time taken: " + (finish - start) + " milliseconds");
    }

    public static int triangleNumber(int number) {
        int sum = 0;
        for(int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}