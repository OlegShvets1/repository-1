/*   3) Create 3 different classes to demonstrate the relationships "has-a" and "uses-a". They can be anything you want.
        For example: Car - Engine - Wheels */

public class Engine_3   {                                      // Engine_3  Has - a  Wheels_3
          private Wheels_3 wheels_3;

          public Engine_3 (Wheels_3 wheels_3){
             this.wheels_3 = wheels_3;
          }
    public static void main(String[] args){
              System.out.println("Has - a ");

    }
}
