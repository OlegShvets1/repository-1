/*   5. Create a simple class with a bunch of constructors.
        All these constructors should take different number of parameters.
        Demonstrate in your class, how we can call one constructor from another. */


public class Person5 {
    public String name;
    public int age;
    public double weight;
    public int height;


    public Person5(String name) {
        this.name = name;

    }

    public Person5(String name, int age) {
        this.name = name;
        this.age = age;

    }

     public Person5(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

      public Person5(String name, int age, double weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public Person5(){
    this("Martin",27);
    }

    public static void main(String[] args) {
        Person5 person_1 = new Person5("Vlad", 30,70);
        System.out.println(person_1.name + " "+ person_1.age + " " +person_1.weight);
        Person5 person_2 = new Person5("Denis", 22,100, 180);
        System.out.println(person_2.name + " "+ person_2.age + " " +person_2.weight+" "+person_2.height);
        Person5 person_3 = new Person5("Elizabet", 19);
        System.out.println(person_3.name + " "+ person_3.age);
    }
}
