import java.util.*;

public class Day10 {
    // public int add(int a, int b) {
    // return a + b;
    // }

    public static void main(String[] args) {
        // Main ob = new Main();
        // System.out.println(ob.add(10, 20));
        // System.out.println(Main.add(10, 20));
        // System.out.println(add(10, 20));
        // Day10 d = new Day10();
        // System.out.println(d.add(10, 20));
        // calculator c = new calculator();
        // System.out.println(c.add(10, 20));
        // System.out.println(c.sub(10, 20));
        // System.out.println(c.mul(10, 20));
        // System.out.println(c.div(10, 20));
        Calculator c = new Calculator();
        System.out.println(c.add(10, 20));
        System.out.println(c.sub(10, 20));
        System.out.println(c.mul(10, 20));
        System.out.println(c.div(10, 20));
        SumOddEven s = new SumOddEven();
        System.out.println(s.sumOdd(10));
        System.out.println(s.sumEven(10));
        Palindrome p = new Palindrome();
        System.out.println(p.palindrome(121));
        FibanocciSeries f = new FibanocciSeries();
        System.out.println(f.fib(5));
        Factorial z = new Factorial();
        System.out.println(z.fact(5));
        Armstrong a = new Armstrong();
        a.armstrong(153);
        Anagram an = new Anagram();
        System.out.println(an.anagram("kunal", "lunka"));
        Reverse r = new Reverse();
        System.out.println(r.reverse("kunal"));
        Sum w = new Sum();
        w.sum(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
        Sum1 s1 = new Sum1();
        System.out.println(s1.sum(12345));
        PrefectSquare ps = new PrefectSquare();
        System.out.println(ps.perfectSquare(6));
        // LeapYear l = new LeapYear();
        // System.out.println(l.leapYear(2020));
        Otp o = new Otp();
        System.out.println(o.otp());
    }
}

// calculator
// class calculator {
// int add(int a, int b) {
// return a + b;
// }

// int sub(int a, int b) {
// return a - b;
// }

// int mul(int a, int b) {
// return a * b;
// }

// int div(int a, int b) {
// return a / b;
// }
// }
// class Main {
// public static int add(int a, int b) {
// return a + b;
// }
// }
// calculator
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}

// sum of odd & sum of even
class SumOddEven {
    int sumOdd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    int sumEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}

// Palindrome
class Palindrome {
    boolean palindrome(int n) {
        int temp = n;
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (temp == rev) {
            return true;
        } else {
            return false;
        }
    }
}

// fibanocci
class FibanocciSeries {
    int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}

// factorial
class Factorial {
    int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }
}

// Armstrong
class Armstrong {
    void armstrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}

// Anagram
class Anagram {
    int anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return 0;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            return 1;
        } else {
            return 0;
        }
    }
}

// Reverse a string and no.of vowels
class Reverse {
    String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}

// sum of array
class Sum {
    int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}

// find how many vowels present in string
class Vowels {
    int vowel(String s) {
        int count = 0;
        String vowel = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++) {
            if (vowel.indexOf(s.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}

// find square & cube of a number
class Square {
    int square(int n) {
        return n * n;
    }

    int cube(int n) {
        return n * n * n;
    }
}

// Find Min and MAx from group of numbers & from a array
class MinMax {

    int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

// sum of digits
class Sum1 {
    int sum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
}

// LeapYear
class LeapYear {
    boolean leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                if (year % 400 == 0) {
                    return true;

                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
    }
}

// Prefect Square
class PrefectSquare {

    boolean perfectSquare(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    boolean per(int n) {
        int sq = (int) Math.sqrt(n);
        if (sq * sq == n) {
            return true;
        } else {
            return false;
        }
    }
}

// OTP generator
class Otp {
    int otp() {
        Random r = new Random();
        int otp = r.nextInt(100000);
        return otp;
    }
}