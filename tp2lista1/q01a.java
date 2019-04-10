package tp2lista1;

public class q01a {
    public static void main(String[] args) {
        System.out.println(squareSumRecursive(100));
        System.out.println(squareSumIterative(100));
    }

    public static int squareSumRecursive(int n) {
        if (n == 1)
            return n;
        else
            return (n * n) + squareSumRecursive(n - 1);
    }

    public static int squareSumIterative(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n*n;
            n--;
        }
        return sum;
    }
}
