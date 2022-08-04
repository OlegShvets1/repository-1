public class Task4 {
    public static void main(String[] args) {
        String str_1 = "ABCDEFGHIJK";
        String str_2 = str_1.toLowerCase();
        String str_3 = str_2.replace("a","");
        String str_4 = str_3.replace("e","");
        String str_5 = str_4.replace("i","");
        System.out.println(str_5);
    }
}
