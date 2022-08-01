public class Task5 {
    static int factorial(int n){
        int f1 = 1;
        for (int i = 1; i <=n; i ++){
            f1 = f1*i;
        }
        return f1;
    }
    public static void main(String[] args){
        System.out.println(factorial(8));
    }
}


