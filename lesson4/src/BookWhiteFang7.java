/*  7)   Create a simple class with some fields.
         Demonstrate in your class how we can use initialization blocks. */


public class BookWhiteFang7 {

    public static String nameOfTheAutor;
    public static int year;
    public static int edition;

   static  {
        nameOfTheAutor = "Jack London";        // blocks  initialization.
        year = 1906;                          //
        edition = 20000;                    //
    }

    public BookWhiteFang7() {
        this.nameOfTheAutor = nameOfTheAutor;
        this.year = year;
        this.edition = edition;
       }
    public static void main(String[] arg){
        BookWhiteFang7 bookWhiteFang7 = new BookWhiteFang7();
        System.out.println("Name of the autor -  " + bookWhiteFang7.nameOfTheAutor+"."  + "  Year - " + bookWhiteFang7.year+"." +   "  Edition - " + bookWhiteFang7.edition+".");

    }
}
