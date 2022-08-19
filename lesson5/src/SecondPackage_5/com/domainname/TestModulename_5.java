package SecondPackage_5.com.domainname;/*  5. Create 2 classes with the same name, but put them in different packages. For example, com.domainname.modulename.
       Create a third class with the main method.
       In the main method create two different objects of your classes specifying the full name of the classes (including packages). */
import FirstPackage_5.com.domainname.modulename;

public class TestModulename_5 {
    public static void main (String[] arg){
        FirstPackage_5.com.domainname.modulename a = new modulename("Apple", 10, "Pear");
        System.out.println(a.d+"  "+a.n+"  "+a.x);
        SecondPackage_5.com.domainname.modulename b = new SecondPackage_5.com.domainname.modulename(12, 14343, "Cucumber");
        System.out.println(b.a+"  "+b.b+"  "+b.c);
    }
}
