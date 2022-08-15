/*   9. Write your own example of the recursive function. You can find a lot of examples on the Internet. */


public class Fibonachi_9 {
     static void fib(int n) {

        int num0 = 0;
        int num1 = 1;
        int num2;

        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i <= n; i++) {
            num2 = num0 + num1;

            System.out.print(num2 + " ");

            num0 = num1;
            num1 = num2;
        }
    }

    public static void main(String[] args) {
            fib(20);
    }
}