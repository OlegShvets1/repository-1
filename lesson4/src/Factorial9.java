/*   9. Write your own example of the recursive function. You can find a lot of examples on the Internet. */


public  class Factorial9 {
    static  int Factorial9(int n) {
        if (n <= 1) return 1;
        return Factorial9(n - 1) * n;
    }

    public static void main(String[] args) {
           System.out.println( Factorial9(6));
    }
}