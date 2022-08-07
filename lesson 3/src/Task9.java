/* Є якась стрінга. Необхідно знайти і підрахувати кількість дублючих символів (черектерів) у цій строці. Наприклад:
String a = "Infinity";
Система має вивести:
'i' occurs 3 times
'n' occurs 2 times
Зверніть увагу, що підраховувати необхідно як малі, так і великі однакові букви.*/
public class Task9 {
    public static void main(String[] args) {
        String str = "Infinity".toLowerCase();
        String findStr1 = "i";
        String findStr2 = "n";
        int q = 0;
        int s = 0;
        for (int i = 0; i <= str.length(); i++) {
            String s1 = String.valueOf(str.charAt(i));
            if (findStr1.equals(s1)) {
                q = q + 1;
                System.out.println(findStr1 + " occurs " + q + " times");
            }
        }

//        for (int i = 0; i <= str.length(); i++) {
//            String s1 = String.valueOf(str.charAt(i));
//            if (findStr2.equals(s1)) {
//                s = s + 1;
//
//            }
//        }  System.out.println(findStr2 + " occurs " + s + " times");
    }
}


