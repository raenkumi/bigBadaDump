import java.util.*;

public class aula0ex2 {
    public static void main(String[] args) {
        int triangleSides[] = new int[3];

        for (int i = 0; i < 3; i++) {
            triangleSides[i] = readSide(i);
        }

        boolean isPossible = triangleCalculus(triangleSides);
        resultPrint(isPossible);
    }

    public static int readSide(int sideNumber) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Forneca o tamanho do lado " + (sideNumber + 1));
        int size = reader.nextInt();
        return size;
    }

    public static boolean triangleCalculus(int[] sides) {
        if (Math.abs(sides[0] - sides[1]) < sides[2] && sides[2] < sides[0] + sides[1]
            || Math.abs(sides[0] - sides[2]) < sides[1] && sides[2] < sides[0] + sides[2]
            || Math.abs(sides[2] - sides[1]) < sides[0] && sides[0] < sides[2] + sides[1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void resultPrint(boolean isPossible){
        if (isPossible){
            System.out.println("Um triangulo eh possivel.");
        } else {
            System.out.println("Um triangulo nao eh possivel");
        }
    }
}