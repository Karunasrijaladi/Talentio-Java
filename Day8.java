import java.util.*;

public class Day8 {
    // String sname;
    // int age;

    // Day8(String sname, int age) {
    // this.sname = sname;
    // this.age = age;
    // }

    // void display() {
    // System.out.println("Student name is " + sname);
    // System.out.println("Student age is " + age);
    // }

    // public static void main(String[] args) {
    // Day8 s1 = new Day8("Karthik", 21);
    // Day8 s2 = new Day8("Karthik", 21);
    // s1.display();
    // s2.display();
    // double l;
    // double b;

    // Day8(double l, double b) {
    // this.l = l;
    // this.b = b;
    // }

    // double getArea() {
    // return (l * b);
    // }

    // double getperimeter() {
    // return (2 * (l + b));
    // }

    // public static void main(String[] args) {
    // Day8 d1 = new Day8(10, 20);
    // System.out.println("Area of Rectangle is " + d1.getArea());
    // System.out.println("Perimeter of Rectangle is " + d1.getperimeter());
    // }
    // }
    // String accno;
    // double bal;

    // Day8(String accno, double bal) {
    // this.accno = accno;
    // this.bal = bal;
    // }

    // public String getAcc() {
    // return accno;
    // }

    // public double getBal() {
    // return bal;
    // }

    // public void deposit(double amt) {
    // if (amt > 0) {
    // bal += amt;
    // }
    // }

    // public void withdraw(double amt) {
    // if (bal > 0 && amt <= bal) {
    // bal -= amt;
    // }
    // }

    // public static void main(String[] args) {
    // Day8 d1 = new Day8("1234", 1000);
    // System.out.println(d1.getAcc());
    // System.out.println(d1.getBal());
    // d1.deposit(1000);
    // d1.withdraw(500);
    // System.out.println(d1.getBal());
    // }
    // String Ename;
    // double sal;
    // int age;

    // public void getDetails(String Ename, double sal, int age) {
    // this.Ename = Ename;
    // this.sal = sal;
    // this.age = age;
    // }

    // public String getEname() {
    // return Ename;
    // }

    // public double getSal() {
    // return sal;
    // }

    // public void getAge() {
    // if (age < 0) {
    // System.out.println("Not Valid");
    // } else {
    // System.out.println(age);
    // }
    // }

    // public static void main(String[] args) {
    // Day8 d1 = new Day8();
    // Scanner sc = new Scanner(System.in);
    // d1.getDetails(sc.next(), sc.nextDouble(), sc.nextInt());
    // System.out.println(d1.getEname());
    // System.out.println(d1.getSal());
    // d1.getAge();
    // }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // Employee_age e1 = new Employee_age();
        // e1.getDetails(sc.next());
        // e1.getAge(sc.nextInt());
        // e1.display();

        // Employee_age e2 = new Employee_age();
        // e2.getAge(sc.next(), sc.nextInt());
        // e2.display();

        // Employee e3 = new Employee("Ram", 27, "Talentio");
        // e3.display();

        // Employee_age e4 = new Employee_age("Karthik", 27, "Karthika", "Kurthi");
        // e4.display();

    }
}

// class Employee {
// String name;

// public void getDetails(String name) {
// this.name = name;
// }
// }

// class Employee_age extends Employee {
// int age;

// public void getAge(int age) {
// this.age = age;
// }

// public void display() {
// System.out.println(name);
// System.out.println(age);
// }
// }
// single inheritance using super keyword
// class Employee {
// String name;

// public void getDetails(String name) {
// this.name = name;
// }
// }

// class Employee_age extends Employee {
// int age;

// public void getAge(String name, int age) {
// super.getDetails(name);
// this.age = age;
// }

// public void display() {
// System.out.println(super.name);
// System.out.println(age);
// }
// }
// class Person {
// String name;
// int age;

// Person(String name, int age) {
// this.name = name;
// this.age = age;
// }

// void display() {
// System.out.println("Employee Name: " + name);
// System.out.println("Employee Age: " + age);
// }
// }

// class Employee extends Person {
// String Company;

// Employee(String name, int age, String Company) {
// super(name, age);
// this.Company = Company;
// }

// void display() {
// super.display();
// System.out.println("Employee Company: " + Company);
// }
// }
// Multilevel inheritance

// class Person {
// String name;
// int age;

// Person(String name, int age) {
// this.name = name;
// this.age = age;
// }

// void display() {
// System.out.println("Employee Name: " + name);
// System.out.println("Employee Age: " + age);
// }
// }

// class Employee extends Person {
// String wifename;

// Employee(String name, int age, String wifename) {
// super(name, age);
// this.wifename = wifename;
// }

// void display() {
// super.display();
// System.out.println("Employee Wife: " + wifename);
// }
// }

// class Employee_age extends Employee {
// String childname;

// Employee_age(String name, int age, String Company, String childname) {
// super(name, age, Company);
// this.childname = childname;
// }

// void display() {
// super.display();
// System.out.println("Employee Child: " + childname);
// }
// }
// Hierarchical inheritance

// class Person {
// String name;
// int age;

// Person(String name, int age) {
// this.name = name;
// this.age = age;
// }
// }

// class Employee extends Person {
// String Company;

// Employee(String name, int age, String Company) {
// super(name, age);
// this.Company = Company;
// }
// }

// class Employee_age extends Person {
// String childname;

// Employee_age(String name, int age, String Company, String childname) {
// super(name, age);
// this.childname = childname;
// }
// }