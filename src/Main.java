import java.util.Scanner;

public class Main {
  // Task 1
  static void digits(int n) {
    if (n < 10) {
      System.out.println(n);
      return;
    }
    digits(n / 10);
    System.out.println(n % 10);
  }

  // Task 2
  static int sum(int[] a, int i) {
    if (i == a.length) return 0;
    return a[i] + sum(a, i + 1);
  }

  // Task 3
  static boolean prime(int n, int d) {
    if (n <= 1) return false;
    if (d * d > n) return true;
    if (n % d == 0) return false;
    return prime(n, d + 1);
  }

  // Task 4
  static int fact(int n) {
    if (n == 0) return 1;
    return n * fact(n - 1);
  }

  // Task 5
  static int fib(int n) {
    if (n < 2) return n;
    return fib(n - 1) + fib(n - 2);
  }
  // Task 6
  static int pow(int a, int n) {
    if (n == 0) return 1;
    return a * pow(a, n - 1);
  }
  // Task 7
  static void rev(Scanner sc, int n) {
    if (n == 0) return;
    int x = sc.nextInt();
    rev(sc, n - 1);
    System.out.print(x + " ");
  }
  // Task 8
  static boolean onlyNums(String s, int i) {
    if (i == s.length()) return true;
    if (s.charAt(i) < '0' || s.charAt(i) > '9') return false;
    return onlyNums(s, i + 1);
  }

  // Task 9
  static int len(String s) {
    if (s.equals("")) return 0;
    return 1 + len(s.substring(1));
  }

  // Task 10
  static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Task 1
    System.out.println("Digits:");
    digits(5481);

    // Task 2
    int[] arr = {3, 2, 4, 1};
    int total = sum(arr, 0);
    System.out.println("Avg = " + (double) total / arr.length);
    // Task 3
    int num = 7;
    if (prime(num, 2))
      System.out.println("Prime");
    else
      System.out.println("Composite");

    // Task 4
    System.out.println("Fact = " + fact(5));

    // Task 5
    System.out.println("Fib = " + fib(5));

    // Task 6
    System.out.println("Pow = " + pow(2, 10));
    // Task 7
    System.out.println("Enter numbers:");
    rev(sc, 4);

    // Task 8
    String s = "123456";
    if (onlyNums(s, 0))
      System.out.println("\nYes");
    else
      System.out.println("\nNo");
    // Task 9
    System.out.println("Len = " + len("hello"));

    // Task 10
    System.out.println("GCD = " + gcd(32, 48));
  }

}