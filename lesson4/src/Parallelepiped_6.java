/*   6)   Create a simple class with any 3 fields.
          Demonstrate in your class how we can use "this" keyword to refer to the object,
          from which a constructor or a method was invoked.  */


public class Parallelepiped_6 {
    public int a;
    public int b;
    public int c;


    public Parallelepiped_6(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void  Volume(){
        int d;
        this.a = a;
        this.b = b;
        this.c = c;
    d = a * b * c;
    System.out.println(d);
         }
 public  static void main(String[] args)  {
       Parallelepiped_6 parallelepiped_6 = new Parallelepiped_6(10,20,30);
       parallelepiped_6.Volume();
    }
}
