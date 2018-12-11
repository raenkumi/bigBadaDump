package cifraCesar;

import java.util.*;

public class CifraCesar {

	public static void cryptMessage (String msg, int key) {
		String outputTextCypher = "";
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == 32) {
				outputTextCypher += ' ';
			} else {
				outputTextCypher += (char)(msg.charAt(i) + key);
			}
		}
		
		System.out.println(outputTextCypher);
	}
	
	public static void decryptMessage (String msg, int key) {
		String outputTextDecypher = "";
		for (int i = 0; i < msg.length(); i++) {
			if (msg.charAt(i) == 32) {
				outputTextDecypher += ' ';
			} else {
				outputTextDecypher += (char)(msg.charAt(i) - key);
			}
		}
		
		System.out.println(outputTextDecypher);
	}
	
	public static void main(String[] args){
		int key = 3;
		String inputText1 = "";
		String inputText2 = "";
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Oh, grande Legionário, informe-nos o texto a ser encriptado:");
		inputText1 = sc.nextLine();
		System.out.println("Oh, grande Legionário, informe-nos o texto a ser decriptado:");
		inputText2 = sc.nextLine();
		sc.close();
		
		cryptMessage(inputText1, key);
		decryptMessage(inputText2, key);
	}
}
