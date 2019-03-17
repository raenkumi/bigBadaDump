// TODO
// 1. função que faça a leitura dos números e inclua-os numa lista

import java.util.*;

public class aula0ex3 {
    public static void main(String[] args) {
        //int[] integers = integerInput();
        int[] integers = {169, 4, 100, 64, 9, 16, 225, 121, 81, 196, 25, 36, 144, 49};
        int numberOfIntegers = evenIntegerRead(integers);
        evenPrint(numberOfIntegers);
    }

    public static int integerInput () {
        //FUNÇÃO NÃO ESTÁ COMPLETA (NÃO FUNCIONA!)
        Scanner reader = new Scanner(System.in);
        System.out.println("DETERMINADOR DE PARES");
        System.out.println("Forneça até 1000 números inteiros quaisquer");
        int integers = reader.nextInt();
        reader.close();
        return integers;
    }

    public static int evenIntegerRead(int[] integers){
        int evenInArrayCount = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0){
                evenInArrayCount++;
            }
        }
        return evenInArrayCount;
    }

    public static void evenPrint(int number) {
        System.out.println("Há " + number  + " números pares na lista.");
    }
}
