import java.util.*;

public class aula0ex4 {
    public static void main(String[] args) {
        String word = scan();
        boolean isPalindrome = stringChecker(word);
        printResult(word, isPalindrome);
    }

    public static String scan() {
        Scanner reader = new Scanner(System.in);
        System.out.println("CHECADOR DE PALÍNDROMOS");
        System.out.println("Insira uma palavra para ver se ela é um palíndromo");
        String word = reader.nextLine();
        reader.close();
        return word;
    }

    public static boolean stringChecker(String word) {
        char[] normalWord = word.toCharArray();
        char[] invertedWord = new char[normalWord.length];
        int i = 0;
        int j = normalWord.length - 1;

        while (i < normalWord.length) {
            invertedWord[j] = normalWord[i];
            i++;
            j--;
        }

        if (java.util.Arrays.equals(normalWord, invertedWord)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printResult(String word, boolean isPalindrome) {
        if (isPalindrome){
            System.out.println(word + " é um palíndromo!");
        } else {
            System.out.println(word + " não é um palíndromo!");
        }
    }
}
