public class Task10 {
    public static void main(String[] args) {
        int[] array = {5, 0, -2,  6, 6, 7, 9, 10, 13, 13, 123, 123};
        int max1 = array[0];
        for (int j : array) {
            if (j > max1);
                max1 = j;
        }
        System.out.println("max1 =" + max1);

        int max2 = array[0];
        for (int c : array) {
            if  (c < max1)
                max2 = c;
        } System.out.println("max2 =" + max2);

    }
}



