public class Task2 {
    public static void main(String[] args) {
        String word = "Welcome to Java World";
        String tag = "p";
        String Str3 = String.join( " ","<"+tag+">" , word +" </"+ tag +">");
        System.out.print(Str3);

    }
}
