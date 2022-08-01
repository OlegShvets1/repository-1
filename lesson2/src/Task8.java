public class Task8 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 3!=0)  continue;
            if (i % 5!=0)  continue;
            if (i % 2!=1)  continue;
            System.out.println("i = " + i);
        }
    }
}
