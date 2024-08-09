import java.util.HashSet;
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        // Books b = new Books();
        // b.open();
        // b.close();
        // b.read();
        // b.write();
        // DebitPayment d = new DebitPayment("XKqXq@example.com");
        // d.processPayment(800);
        // System.out.println(d.getPaymentDetails());

        // CreditPayment c = new CreditPayment("1234567890123456");
        // c.processPayment(100);
        // System.out.println(c.getPaymentDetails());
        // Manager m = new Manager();
        // m.getid(1);
        // m.getDetails("Karthik");
        // Lion l = new Lion();
        // l.walk();
        // l.eat();
        // l.sleep();
        // Vehicle v = new AM();
        // v.drive();
        // v.stop();
        // v.window();
        // v.Service();
        // v.start();
        // Addition a = new Addition();
        // int b = a.add(10, 20);
        // System.out.println(b);
        // int c = a.add(10, 20, 30);
        // System.out.println(c);
        // double d = a.add(10.5, 20.5);
        // System.out.println(d);
        // int[] arr = { 1, 2, 3, 4, 5 };
        // int r = a.add(arr);
        // System.out.println(r);
        // Scanner sc = new Scanner(System.in);
        // String u = sc.nextLine();
        // HashSet<Character> d = new HashSet<>();
        // for (char ch : u.toCharArray()) {
        // d.add(ch);
        // }
        // System.out.println(d);
        // int count = d.size();
        // System.out.println(count)//
        // Given two strings s and t, return true if they are equal when both are typed
        // into empty text editors. '#' means a backspace character.

        // Note that after backspacing an empty text, the text will continue empty.

        // Input: s = "ab#c", t = "ad#c"
        // Output: true

        // Input: s = "a##c", t = "#a#c"
        // Output: true

        // Input: s = "a#c", t = "b"
        // Output: false
        // String s = "ab#c";
        // String t = "ad#c";
        // System.out.println(backspaceCompare(s, t));

        // }

        // public static boolean backspaceCompare(String s, String t) {
        // int i = s.length() - 1, j = t.length() - 1, skipS = 0, skipT = 0;
        // while (i >= 0 || j >= 0) {
        // while (i >= 0) {
        // if (s.charAt(i) == '#') {
        // skipS++;
        // i--;
        // } else if (skipS > 0) {
        // skipS--;
        // i--;
        // } else {
        // break;
        // }
        // }
        // while (j >= 0) {
        // if (t.charAt(j) == '#') {
        // skipT++;
        // j--;
        // } else if (skipT > 0) {
        // skipT--;
        // j--;
        // } else {
        // break;
        // }
        // }
        // }
    }
}

// abstract class File {
// abstract void open();

// abstract void close();

// abstract void read();

// abstract void write();
// }

// class Books extends File {

// void open() {
// System.out.println("open");
// }

// void close() {
// System.out.println("close");
// }

// void read() {
// System.out.println("read");
// }

// void write() {
// System.out.println("write");
// }
// }
// abstract class Payment {
// abstract void processPayment();

// abstract String getPaymentDetails();
// }

// class CreditPayment extends Payment {
// private String cardNumber;

// CreditPayment(String cardNumber) {
// this.cardNumber = cardNumber;
// }

// void processPayment(double amount) {
// System.out.println("Processing credit card payment of $" + amount);
// }

// String getPaymentDetails() {
// return "Credit card number: " + cardNumber;
// }
// }

// class DebitPayment extends Payment {
// private String email;

// DebitPayment(String email) {
// this.email = email;
// }

// void processPayment(double amount) {
// System.out.println("Processing debit card payment of $" + amount);
// }

// String getPaymentDetails() {
// return "Debit card email: " + email;
// }
// }
// abstract class Employee {
// abstract void getDetails(String name);

// abstract void getid(int aid);
// }

// class Manager extends Employee {
// void getDetails(String name) {
// System.out.println("Manager name: " + name);
// }

// void getid(int aid) {
// System.out.println("Manager id: " + aid);
// }
// }
// interface topic
// interface ITopic {
// void display();
// }

// class Topic implements ITopic {
// public void display() {
// System.out.println("Java");
// }
// }
// interface Animal {
// void eat();

// void sleep();

// void walk();
// }

// class Lion implements Animal {
// public void eat() {
// System.out.println("Lion is eating");
// }

// public void sleep() {
// System.out.println("Lion is sleeping");
// }

// public void walk() {
// System.out.println("Lion is walking");
// }
// }
// interface car {
// void drive();

// void stop();
// }

// abstract class Vehicle implements car {
// abstract void window();

// abstract void Service();

// public void start() {
// System.out.println("Vehicle is starting");
// }
// }

// class AM extends Vehicle {
// public void drive() {
// System.out.println("Car is driving");
// }

// public void stop() {
// System.out.println("Car is stopping");
// }

// public void window() {
// System.out.println("Car has window");
// }

// public void Service() {
// System.out.println("Car has service");
// }
// }
// class Addition {
// int add(int a, int b) {
// return a + b;
// }

// int add(int a, int b, int c) {
// return a + b + c;
// }

// double add(double a, double b) {
// return a + b;
// }

// int add(int[] arr) {
// int sum = 0;
// for (int i = 0; i < arr.length; i++) {
// sum += arr[i];
// }
// return sum;
// }
// }