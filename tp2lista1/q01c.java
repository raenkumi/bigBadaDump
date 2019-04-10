package tp2lista1;

public class q01c {
    public static void main (String[] args) {
        System.out.println(recursivePell(15));
        System.out.println(iterativePell(15));
    }

    public static int recursivePell(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return 2 * recursivePell(n-1) + recursivePell(n-2);
    }

    public static int iterativePell(int n) {
        int sum0 = 0;
        int sum1 = 1;
        int totalSum = 0;
        int counter = 2;
        while (counter <= n) {
            totalSum = 2 * sum1 + sum0;
            sum0 = sum1;
            sum1 = totalSum;
            counter++;
        }
        return totalSum;
    }
}

