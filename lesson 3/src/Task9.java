/* Є якась стрінга. Необхідно знайти і підрахувати кількість дублючих символів (черектерів) у цій строці. Наприклад:
String a = "Infinity";
Система має вивести:
'i' occurs 3 times
'n' occurs 2 times
Зверніть увагу, що підраховувати необхідно як малі, так і великі однакові букви.*/
public class Task9 {
    public static void main(String[] args) {
        String str = "Infinity".toLowerCase();

        for (int i = 0; i <= str.length()-1; i++) {
            String s = String.valueOf(str.charAt(i));
            int q = 0;
            for (int j = 0; j <= str.length()-1; j++) {
                String s1 = String.valueOf(str.charAt(j));
                if (s.equals(s1)) {
                    q = (q + 1);
                    if (q>=2) System.out.println(s + " occurs " + q + " times");
                }
            }
        }
    }
}