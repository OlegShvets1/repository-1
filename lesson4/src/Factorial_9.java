/*   9. Write your own example of the recursive function. You can find a lot of examples on the Internet. */


public  class Factorial_9 {
    static  int Factorial_9(int n) {
        if (n <= 1) return 1;
        return Factorial_9(n - 1) * n;
    }

    public static void main(String[] args) {
           System.out.println( Factorial_9(6));
    }
}