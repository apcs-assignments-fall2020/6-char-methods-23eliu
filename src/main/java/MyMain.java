import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (!(ch >= 65 && ch <= 90)) {
            return ch;
        }
        else {
            ch = (char) (ch + 32);
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String lfin = "";
        for (int i = 0; i < str.length()-1; i++) {
            lfin += (toLower(str.charAt(i)));
        }
        lfin += toLower(str.charAt(str.length()-1));
        return lfin;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (!(ch >= 97 && ch <= 122)) {
            return ch;
        }
        else {
            ch = (char) (ch - 32);
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String ufin = "";
        for (int i = 0; i < str.length()-1; i++) {
            ufin += (toUpper(str.charAt(i)));
        }
        ufin += toUpper(str.charAt(str.length()-1));
        return ufin;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a string");
        String input = scan.next();
        System.out.println("What would you like to make your string, lowercase or uppercase?");
        String choose = scan.next();
        if (choose == "lowercase") {
            System.out.println(myToLowerCase(input));
        }
        if (choose == "uppercase") {
            System.out.println(myToUpperCase(input));
        }
        scan.close();
    }
}
