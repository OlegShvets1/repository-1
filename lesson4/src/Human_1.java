//    1)  Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
//        Requirements:
//        a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
//        b) Add to the class a constructor with parameters which initialize all the fields.
 public  class Human_1 {
    public int weight;
    public int age;
    public String firstName;
    public String lastName;
    public double height;

   Human_1(int weight, int age, String firstName, String lastname, double height) {
        this.weight = weight;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastname;
        this.height = height;

    }

    public static void main(String[] args) {
        Human_1 human_1 = new Human_1(80, 30, "Jackson", "Jack", 180);
        System.out.println(human_1.weight+" " + human_1.age+" "+human_1.firstName+" "+human_1.lastName+" "+human_1.height);
    }
}



