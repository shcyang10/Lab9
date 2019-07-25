package co.grandcircus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*
 * @ Sean Yang
 */
import java.util.Scanner;

public class Lab9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		ArrayList<String> itemsOrdered = new ArrayList<String>();
		ArrayList<Double> itemsPrice = new ArrayList<Double>();
		
		System.out.println("Welcome to Sean's Market!");
		
		Map<String, Double> items = new HashMap<>();
		items.put("apple\t", 0.99);
		items.put("banana\t", 0.59);
		items.put("cauliflower", 1.59);
		items.put("dragonfruit", 2.19);
		items.put("Elderberry", 1.79);
		items.put("figs\t", 2.09);
		items.put("grapefruit", 1.99);
		items.put("honeydew", 3.49);
		
		while (cont == "y") {
			System.out.println("Item\t\t\t\t\tPrice");
			System.out.println("=============================================");
			System.out.println(displayMenu(items));
			System.out.println("What item would you like to order? ");
			String userChoice = scan.nextLine();
			itemsOrdered.add(userChoice);
			itemsPrice.add(items.get(userChoice));
			System.out.println(displayMenu(items));
			
			
			//System.out.println(displayCart(itemsOrdered, itemsPrice));
		}
		System.out.println("Average price per item in order was" + averagePrice(itemsPrice, itemsOrdered.size()));
		}

	public static double averagePrice(ArrayList<Double> itemsPrice, int x) {
		double average = 0.0;
		for(int i = 0; i < x; i++) {
			average += itemsPrice.get(i) / x; 
		}
		return average;
	}
//
//	public static String displayCart(ArrayList<String> itemsOrdered, ArrayList<Double> itemsPrice) {
//		
//		return null;
//	}

	public static String displayMenu(Map<String, Double> items) {
		StringBuilder result = new StringBuilder();

		for(String key : items.keySet()) {
			result.append(key + "\t\t\t\t$" + items.get(key) + "\n");
		}
		return result.toString();
	}
}

