// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        System.out.print(primes[i] + "");
            System.out.print(primes[i] + "");
                primes[1] = true;

        System.out.print(primes[i] + "");

    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        // Output all values of the list
        for (int i = 2; i < primes.length; i++){
            if(primes[i]}
                System.out.print(primes[i] + "");

            }

        }

        System.out.println();



    }

}