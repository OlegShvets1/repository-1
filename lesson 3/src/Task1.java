public class Task1 {
    public static void main(String[] args) {
        System.out.println(getStr("AE_1381"));
        System.out.println(getStr(""));
    }

    public static String getStr(String str) {
        if (str.length() == 1) {
            return str.substring(0, 1);
        } else {
            return str.substring(0, 2);
        }
    }
}



