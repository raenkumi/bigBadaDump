package tp2lista1;

public class q01b {
    public static void main(String[] args) {
        System.out.println(recursivePower(5, 11));
        System.out.println(iterativePower(5, 11));
    }

    public static int recursivePower(int n, int k) {
        if (k == 0)
            return 1;
        else
            return n * recursivePower(n, k - 1);
    }

    public static int iterativePower(int n, int k) {
        int result = n;
        while (k > 1) {
            result = result * n;
            k--;
        }
        return result;
    }
}
