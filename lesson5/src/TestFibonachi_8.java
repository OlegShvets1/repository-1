
/*   8. Answer the question: What is a public access? Create a simple program to demonstrate the public access.
        You can use tips from the task 3.

        Public: The access level of a public modifier is everywhere. It can be accessed from within the class,
         outside the class, within the package and outside the package.

        Загальнодоступний: рівень доступу загальнодоступного модифікатора є всюди. До нього можна отримати
        доступ із класу,  поза класом, із пакета та поза пакетом.   */


public class TestFibonachi_8 {
    public static void main(String[] arg){
        Fibonachi_3 a = new Fibonachi_3();
        a.fib(15);
    }
}