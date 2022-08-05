/* Є якась стрінга. Необхідно знайти і підрахувати кількість дублючих символів (черектерів) у цій строці. Наприклад:
String a = "Infinity";
Система має вивести:
'i' occurs 3 times
'n' occurs 2 times
Зверніть увагу, що підраховувати необхідно як малі, так і великі однакові букви.*/
public class Task9 {
    public static void main(String[] args) {
        String str = "Infinity".toLowerCase();
        String findStr = "i";
        String findStrn = "n";
        System.out.println( "'i' occurs  "+ (str.split(findStr, -1).length - 1) + " times" );
        System.out.println( "'n' occurs  "+ (str.split(findStrn, -1).length - 1) + " times" );
    }
}

