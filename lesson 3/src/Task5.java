public class Task5 {
    public static void main(String[] args) {
        String a = "hop";
        String b = "hello";
        int x = a.length();
        int y = b.length();
        if (x < y) { String c = String.join(" ",a,b,a); System.out.println (c);
            } else { String c = String.join(" ",b,a,b); System.out.println (c);
        }
    }
}
