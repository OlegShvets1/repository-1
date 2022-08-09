public class Task5 {
    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";
        int x = a.length();
        int y = b.length();
        String c;
        if (x < y) {  c = String.join(" ",a,b,a);
            } else {  c = String.join(" ",b,a,b);
        }
        System.out.println (c);
    }
}
