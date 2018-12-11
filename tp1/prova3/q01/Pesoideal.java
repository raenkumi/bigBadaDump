package pesoideal;

import java.util.*;

public class Pesoideal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua altura (em centímetros)");
		double altura = sc.nextDouble();
		sc.close();
		
		double pesoIdealHomem = 52 + 1.9 * (altura - 152.4) / 2.54;
		double pesoIdealMulher = 49 + 1.7 * (altura - 152.4) / 2.54;
		
		System.out.println("Peso ideal para Homem com altura de " 
				+ altura
				+ " é de: "
				+ pesoIdealHomem
				+ " kg.");
		
		System.out.println("Peso ideal para Mulher com altura de " 
				+ altura
				+ " é de: "
				+ pesoIdealMulher
				+ " kg.");
		
	}

}
