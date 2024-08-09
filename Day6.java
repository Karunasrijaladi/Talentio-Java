import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        // String s1 = "Karuna";
        // String s2 = "KARUNA";
        // String s3 = s1 + s2;
        // System.out.println(s3);
        // System.out.println(s1.length());
        // // String s4=s2.length(); should not do like that
        // // System.out.println(s4);
        // System.out.println(s1.toLowerCase());
        // System.out.println(s1.toUpperCase());
        // System.out.println(s2.toLowerCase());
        // System.out.println(s2.toUpperCase());
        // if (s1 == s2) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }
        // boolean isequal = s1.equals(s2);
        // System.out.println(isequal);
        // boolean is = s1.equalsIgnoreCase(s2);
        // System.out.println(is);
        // String st = "Hi,My name";
        // String sub = st.substring(4, 10);
        // System.out.println(sub);
        // String c = "This is java";
        // char ch = c.charAt(7);
        // System.out.println(ch);
        // int n = c.indexOf('a');
        // System.out.println(n);
        // String c1 = " This is java ";
        // System.out.println(c1);
        // String c2 = c1.trim();
        // System.out.println(c2);
        // String r = "K#a#r#u#n#a";
        // System.out.println(r.replace("#", ""));
        // String s4 = "&&&&&Hello&&&";
        // System.out.println(s4.ltrim("&"));
        // System.out.println(s4.rtrim());
        // String s1 = "KarthikEOU";
        // String s = s1.toLowerCase();
        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
        // s.charAt(i) == 'o'
        // || s.charAt(i) == 'u') {
        // System.out.println(s.charAt(i));
        // }
        // }
        // String s2 = "Karthik";
        // char[] ch = s2.toCharArray();
        // for (char c : ch) {
        // System.out.println(c);
        // }
        // String s3 = "APPle,Banana,Mango,Kiwi";
        // String[] arr = s3.split(",");
        // for (String c : arr) {
        // System.out.println(c);
        // }
        // String in reverse method
        // String s = "Karuna sri";
        // String rev = "";
        // for (int i = s.length() - 1; i >= 0; i--) {
        // rev = rev + s.charAt(i);
        // }
        // System.out.println(rev);
        // String o = "Hello World";
        // String rev = new StringBuilder(o).reverse().toString();
        // System.out.println(o);
        // System.out.println(rev);
        // String s2 = "VnitsHi!";
        // char[] ch = s2.toCharArray();
        // for (char c : ch) {
        // System.out.println(c);
        // }
        // System.out.println(Arrays.toString(ch));
        // program to join strings with delimiter
        // String[] s1 = { "Hello", "World", "vinitshi" };
        // String s = String.join("-", s1);
        // System.out.println(s);
        // Write a program to check string start with a prefix and ends with suffix
        // String s = "Hello";
        // String prefix = "He";
        // String suffix = "o";
        // if (s.startsWith(prefix) && s.endsWith(suffix)) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }
        // check whether the string is palindrome or not
        // String s1 = "madam";
        // String rev = "";
        // for (int i = s1.length() - 1; i >= 0; i--) {
        // rev = rev + s1.charAt(i);
        // }
        // if (s1.equals(rev)) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }
        // Write a program to count the specific character of a given string
        // String s = "Hello World";
        // int count = 0;
        // for (int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) == 'o') {
        // count++;
        // }
        // }
        // System.out.println(count);
        // find the longest word in the string
        // String[] s1 = { "Hello", "World", "vinitshi" };
        // String max = s1[0];
        // for (int i = 1; i < s1.length; i++) {
        // if (s1[i].length() > max.length()) {
        // max = s1[i];
        // }
        // }
        // System.out.println(max);
        // Convert the starting letter of the word into capital
        // String s = "hello world";
        // char[] ch = s.toCharArray();
        // ch[0] = Character.toUpperCase(ch[0]);
        // System.out.println(String.valueOf(ch));
        // Convert the starting letter of the each word in the string to capital
        String s = "hello world";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] ch = arr[i].toCharArray();
            ch[0] = Character.toUpperCase(ch[0]);
            arr[i] = String.valueOf(ch);
        }
        System.out.println(String.join(" ", arr));
    }
}
