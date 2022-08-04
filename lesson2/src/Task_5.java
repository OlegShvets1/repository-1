public class Task_5 {
    public static void main(String[] args) {
        System.out.println(getFactorial(6));
    }

    public static int getFactorial(int number) {
        int result = 1;
        while (number <= result) {
            result = number * (result-1);
        }
        return result;
    }
}


