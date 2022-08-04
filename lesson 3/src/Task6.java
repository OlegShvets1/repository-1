public class Task6 {
    public static void main(String[] args) {
    String e_mail = "John_Smith@example.com";
    int i = e_mail.indexOf("@");
    int c = e_mail.length();
    String login1 = e_mail.substring(0,i);
    String login = login1.replace("_", " ");
    String domain = e_mail.substring(i+1,c);
            System.out.println ("login = " + login);
        System.out.println ("domain = " + domain);
    }
}
