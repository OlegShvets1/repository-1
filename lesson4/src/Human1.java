//    1)  Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
//        Requirements:
//        a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
//        b) Add to the class a constructor with parameters which initialize all the fields.
 public  class Human1 {
    public int weight;
    public int age;
    public String firstName;
    public String lastName;
    public double height;

   Human1(int weight, int age, String firstName, String lastname, double height) {
        this.weight = weight;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastname;
        this.height = height;

    }

    public static void main(String[] args) {
        Human1 human1 = new Human1(80, 30, "Jackson", "Jack", 180);
        System.out.println(human1.weight+" " + human1.age+" "+human1.firstName+" "+human1.lastName+" "+human1.height);
    }
}



