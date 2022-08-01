public class Task7 {
    public static void main(String[] args) {
        int[] array = {19, 2, 7, 13, 4, 90, 53, 67, 78, 82};
        int sum = 0;
        for (int i = 1; i < array.length-1; i++) {
            sum+=array[i];
        }
        System.out.println("Sum = "+sum);


    }
}
