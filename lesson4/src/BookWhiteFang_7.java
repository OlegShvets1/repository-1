/*  7)   Create a simple class with some fields.
         Demonstrate in your class how we can use initialization blocks. */


public class BookWhiteFang_7 {

    public static String nameOfTheAutor;
    public static int year;
    public static int edition;

   static  {
        nameOfTheAutor = "Jack London";        // blocks  initialization.
        year = 1906;                          //
        edition = 20000;                    //
    }

    public BookWhiteFang_7() {
        this.nameOfTheAutor = nameOfTheAutor;
        this.year = year;
        this.edition = edition;
       }
    public static void main(String[] arg){
        BookWhiteFang_7 bookWhiteFang_7 = new BookWhiteFang_7();
        System.out.println("Name of the autor -  " + bookWhiteFang_7.nameOfTheAutor+"."  + "  Year - " + bookWhiteFang_7.year+"." +   "  Edition - " + bookWhiteFang_7.edition+".");

    }
}
