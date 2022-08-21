package Task_1;

/*  1)  Write a simple java program to demonstrate composition of classes.
        Tips:
        a) Create several classes A, B, C;
        b) Add functionality of classes B and C to the class A without using inheritance.
        c) Create a test class and demonstrate how we can use functionality of classes B and C via
        created object of the class A;
 */

public class Relax {
    public Tv tv;
    public  Radio radio;

    public Relax(Tv tv, Radio radio) {
        this.tv = tv;
        this.radio = radio;
    }
       public void relax() {
        System.out.println("Relax : Tv channel - " + tv.getChannel() + ";  Relax : Radio music - "+ radio.music+"; Radio news - "+radio.news);
    }
}

