package listaProdutos;

public class ListaProdutos {

	public static void main(String[] args) {
		String[][] shoppingList = new String[][]  {   
			{"A Sutil Arte De Ligar O Foda-Se", "2", "23.90"},   
			{"Box Harry Potter - Série Completa", "1", "139.90"},
			{"A História da Arte", "5", "438.90"}
			}; 
						
		double totalPrice = 0;
		
		for(int i = 0; i < shoppingList.length; i++) {
			totalPrice += Double.parseDouble(shoppingList[i][2]) * Integer.parseInt(shoppingList[i][1]);
		}
				
		System.out.println("Lista de Compras:");
		System.out.println(" ");

		for (int i = 0; i < shoppingList.length; i++) {
			System.out.println("Livro: " + shoppingList[i][0]);
			System.out.println("R$" + shoppingList[i][2]);
			System.out.println("Qtd: " + shoppingList[i][1]);
			System.out.println(" ");

		}
		
		System.out.println("Total: R$" + totalPrice);
	}
}
	
	
