public class Task5aa {
    public static void main(String[] args) {
        int num = 8;
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.print("Factorial of " + num + "  is  " + fact);
    }
}
