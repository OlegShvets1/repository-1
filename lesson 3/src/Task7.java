public class Task7 {
    public static void main(String[] args) {
        String str_0 = "Den, John, Will, Kate, Adam, Robin";
        String[] names = str_0.split(", ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

