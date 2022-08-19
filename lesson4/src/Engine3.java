/*   3) Create 3 different classes to demonstrate the relationships "has-a" and "uses-a". They can be anything you want.
        For example: Car - Engine - Wheels */

public class Engine3   {                                      // Engine_3  Has - a  Wheels_3
          private Wheels3 wheels3;

          public Engine3 (Wheels3 wheels3){
             this.wheels3 = wheels3;
          }
    public static void main(String[] args){
              System.out.println("Has - a ");

    }
}
