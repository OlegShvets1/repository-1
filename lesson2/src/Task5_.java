    public class Task5_ {
        public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }        public static int getFactorial(int number) {
        int result = 1;
        while (number > 0) {
            result = result * number;
            number--;
        }
        return result;
    }
}
