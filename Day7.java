import java.util.*;
public class Day7 {
    public static void main(String[] args) {
        // String s = "Guntur";
        // StringBuffer rev = new StringBuffer();
        // for (int i = s.length() - 1; i >= 0; i--) {
        // rev.append(s.charAt(i));
        // }
        // System.out.println(rev);
        // System.out.println(rev.toString());
        // // to check whether the given string is anagram or not
        // String s2 = "Madam";
        // String s1 = s2.toLowerCase();
        // String rev1 = "";
        // for (int i = s1.length() - 1; i >= 0; i--) {
        // rev1 = rev1 + s1.charAt(i);
        // }
        // if (s1.equals(rev1)) {
        // System.out.println("The given string is anagram");
        // } else {
        // System.out.println("The given string is not anagram");
        // }
        // Write a Program to find how many words are there in this sentence and
        // determine which is longest and shortest
        // String sentence = "Hi, Welcome to my Yt Channel";
        // String[] words = sentence.split(" ");
        // System.out.println(words.length);
        // Arrays.sort(words);
        // System.out.println(words[0]);
        // System.out.println(words[words.length - 1]);
        // // WAP TO remove all the vowels from the given String
        // String name = "Karthikeou";
        // String name1 = name.replaceAll("[aeiou]", "");
        // System.out.println(name1);
        // // Program to check whether the given string is valid mail-id
        // String mail = "9G9kHexample.com";
        // if (mail.contains("@") && mail.contains(".")) {
        // System.out.println("Valid mail-id");
        // } else {
        // System.out.println("Invalid mail-id");
        // }
        // // WAP to check whether the given String is palindrome or not
        // String str = "madam";
        // String revstr = "";
        // for (int i = str.length() - 1; i >= 0; i--) {
        // revstr = revstr + str.charAt(i);na
        // }
        // if (str.equals(revstr)) {
        // System.out.println("The given string is palindrome");
        // } else {
        // System.out.println("The given string is not palindrome");
        // }
        // WAP to check whether the String Password is Strong or not and first character
        // should be capital
        // and password should contain atleast one special character and one digit
        // System.out.println("Enter the password");
        // Scanner sc = new Scanner(System.in);
        // String password = sc.nextLine();
        // if (password.length() < 6) {
        // System.out.println("Password should not be less than 6 characters");
        // } else if ((!password.matches("[a-zA-Z0-9@_]+"))) {
        // System.out.println("Password should contain atleast one special character and
        // one digit");
        // } else {
        // if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
        // System.out.println("Strong Password");
        // } else {
        // System.out.println("Password should start with capital letter");
        // }
        // }
        // checking String is palindrome or not using two pointer technique
        // String str1 = "madam";
        // int i = 0;
        // int j = str1.length() - 1;
        // while (i < j) {
        // if (str1.charAt(i) != str1.charAt(j)) {
        // System.out.println("The given string is not palindrome");
        // break;
        // }
        // i++;
        // j--;
        // }
        // if (i >= j) {
        // System.out.println("The given string is palindrome");
        // }
        // String password = "Karthik@123!";

        // if (password.length() < 6) {
        // System.out.println("Password must be at least 6 characters long.");
        // } else {
        // boolean isValid = true;

        // char firstChar = password.charAt(0);
        // if (!Character.isUpperCase(firstChar)) {
        // System.out.println("First character must be uppercase.");
        // isValid = false;
        // }

        // boolean hasDigit = false;
        // for (int i = 0; i < password.length(); i++) {
        // if (Character.isDigit(password.charAt(i))) {
        // hasDigit = true;
        // break;
        // }
        // }
        // if (!hasDigit) {
        // System.out.println("Password must contain atleast 1 digit.");
        // isValid = false;
        // }

        // boolean hasSpecialSymbol = false;
        // String specialSymbols = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?";
        // for (int i = 0; i < password.length(); i++) {
        // if (specialSymbols.indexOf(password.charAt(i)) != -1) {
        // hasSpecialSymbol = true;
        // break;
        // }
        // }
        // if (!hasSpecialSymbol) {
        // System.out.println("Password must contain atleast 1 spl symbol.");
        // isValid = false;
        // }

        // if (isValid) {
        // System.out.println("Password is valid.");
        // }
        // }
    }
}
