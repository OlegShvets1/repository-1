public class Task3 {
    public static void main(String[] args) {
        System.out.println(getStr(""));
        System.out.println(getStr1(""));
    }

    public static String getStr(String str) {
        String word1 = "The End";
        String word3 = "The";
        if (word1.startsWith(word3)) {
            str = "Phrase 'word1' begins with 'The'";
        } else {
            str = "Phrase 'word1' doesn`t begin with 'The'";
        }
        return str;
    }

    public static String getStr1(String str1) {
        String word2 = "End The";
        String word3 = "The";
        if (word2.startsWith(word3)) {
            str1 = "Phrase 'word2' begins with 'The'";
        } else {
            str1 = "Phrase 'word2' doesn`t begin with 'The'";
        }
        return str1;
    }
}





