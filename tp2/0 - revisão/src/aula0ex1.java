import java.util.Scanner;

public class aula0ex1 {

    public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("DETERMINADOR DE NUMEROS PRIMOS");
        System.out.println("Forneca um numero inteiro:");
        int number = sc.nextInt();
        sc.close();
        return number;
    }

    public static boolean numberDivider(int number) {
        int i = 2;
        if (number == 0 || number == 1){
            return false;
        }
        while (i <= number / 2) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void resultPrint(int number, boolean isPrime) {
        if (isPrime) {
            System.out.println("O numero " + number + " eh primo.");
        } else {
            System.out.println("O numero " + number + " nao eh primo");
        }
    }

    public static void main(String[] args) {
        int number = readNumber();
        boolean isPrime = numberDivider(number);
        resultPrint(number, isPrime);
    }
}