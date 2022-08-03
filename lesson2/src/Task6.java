public class Task6 {
    public static void main(String[] args) {
        System.out.println("a)");
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }
        System.out.println("b)");

        for (int y = 0; y <= 4; y++) {
            if (y == 0 || y == 4) {
                for (int x = 0; x <= 7; x++) {
                    System.out.print(" *");
                }
                System.out.println("");
            } else {
                for (int x = 0; x <= 7; x++) {
                    if (x == 0 || x == 7) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
        }


        System.out.println("c)");

        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("d)");
        int n = 5;
        for (int y = 1; y <= n; y++) {
            for (int x = 1; x <= n - y; x++) {
                System.out.print("  ");
            }
            for (int c = 1; c <= (y * 2) - 1; c++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}









