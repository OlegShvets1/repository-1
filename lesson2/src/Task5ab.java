public class Task5ab {
    public static void main(String[] args) {
        System.out.println(getFactorial(3));
    }

    public static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
