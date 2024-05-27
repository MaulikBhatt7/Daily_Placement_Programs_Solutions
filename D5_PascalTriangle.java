import java.util.Scanner;
public class D5_PascalTriangle {
    static int combination(int n, int r) {
        if (n == r) {
            return 1;
        }
        if (r == 0) {
            return 1;
        }
        if (r == 1) {
            return n;
        }
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of  raw : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                int val = combination(i, k);
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
