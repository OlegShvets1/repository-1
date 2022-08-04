public class Task7 {
    public static void main(String[] args) {
        String str_0 = "Den, John, Will, Kate, Adam, Robin";
        String str_1 = str_0.replace(",","");
        String [] names = str_1.split(" ");
        for (String name: names){
        System.out.println(name);}
    }
}
