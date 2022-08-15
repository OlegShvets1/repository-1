/* 2)   Implement the method fight() depending on weight, strength and age of the boxer:
        You should write the dependency by yourself. The method should return true or false if our boxer won or lost.
        Requirements:
        a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;*/

public class Boxer_2 {
    public int age;
    public int weight;
    public int strength;

    public Boxer_2(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer_2 anotherBoxer) {

        Integer resultOurBoxer = this.age + this.weight + this.strength;
        Integer resultAnotherBoxer = anotherBoxer.age + anotherBoxer.weight + anotherBoxer.strength;
        return resultOurBoxer > resultAnotherBoxer;
    }

    public static void main(String[] args) {
        Boxer_2 OurBoxer = new Boxer_2(60, 102, 30);
        Boxer_2 AnotherBoxer = new Boxer_2(43, 90, 40);
        System.out.println(OurBoxer.fight(AnotherBoxer));

    }
}
