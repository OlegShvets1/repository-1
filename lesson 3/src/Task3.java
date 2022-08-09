public class Task3 {
    public static void main(String[] args) {
        str("The End", "End The", "End");
            }

    public static String str(String word1, String word2, String word3) {
        if (word1.startsWith(word3)) {
            System.out.println("Phrase 'word1' begins with 'The'");
        } else {
            System.out.println("Phrase 'word1' doesn`t begin with 'The'");
        }
        if (word2.startsWith(word3)) {
            System.out.println("Phrase 'word2' begins with 'The'");
        } else {
            System.out.println("Phrase 'word2' doesn`t begin with 'The'");
        }
        return word1;
    }
}





