public class Task4 {
    public static void main(String[] args) {
        String str_1 = "ABCDEFGHIJK";
        String str_2 = str_1.toLowerCase();
        System.out.println(str_2.replaceAll("[aei]",""));
    }
}
