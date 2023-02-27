// Define a function that takes an integer argument and returns a logical value true or false depending on if the integer is a prime.
//
//Per Wikipedia, a prime number ( or a prime ) is a natural number greater than 1 that has no positive divisors other than 1 and itself.
public class IsNumberPrime {

    public static void main(String[] args) {
        int n=-5;
        System.out.println(Prime.isPrime(n));

    }
}

class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for(int i=2 ;i<=Math.sqrt(num)+1;i++){
            if(num%i==0 && num!=i) {
                return false;
            }
        }
        return true;
    }
}