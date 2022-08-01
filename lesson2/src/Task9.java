public class Task9 {
        public static void main(String[] args) {
                int[] a = new int[8];
                System.out.print("Оригінальний масив:  ");
                for (int i = 0; i < a.length; i++) {
                        a[i] = (int) (Math.random() * 100);
                        System.out.print(a[i] + "  ");
                }
                System.out.println();
                int temp = 0;
                System.out.print("Масив відсортований від максимального значення до мінімального:  ");
                for (int i = 0; i < a.length; i++) {
                        for (int j = i + 1; j < a.length; j++) {
                                if (a[i] < a[j]) {
                                        temp = a[i];
                                        a[i] = a[j];
                                        a[j] = temp;
                                }
                        }
                        System.out.print(a[i] + "  ");

                }
                System.out.println();
                int tem = 0;
                System.out.print("Масив відсортований від мінімального значення до максимального:  ");
                for (int i = 0; i < a.length; i++) {
                        for (int j = i + 1; j < a.length; j++) {
                                if (a[i] > a[j]) {
                                        tem = a[i];
                                        a[i] = a[j];
                                        a[j] = tem;
                                }
                        }
                        System.out.print(a[i] + "  ");

                }

        }
}








