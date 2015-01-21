import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;


public class _10_OrderOfProducts {

	public static void main(String[] args) {
		
		File orderFile = new File("src/_10_Order.txt");
		File productFile = new File("src/_10_Products.txt");
		File outputFile = new File("src/_10_Output.txt");
		
		ArrayList<Products> productList = new ArrayList<Products>();
		try(
				Scanner inputProduct = new Scanner(productFile);
				Scanner inputOrder = new Scanner(orderFile);
				FileWriter output = new FileWriter(outputFile); 
				){
			while (inputProduct.hasNextLine()) {
				
				String[] product = inputProduct.nextLine().split("[\\s]+");
				productList.add(new Products(product[0], Double.parseDouble(product[1])));
			}
			Double sum = 0d;
			while (inputOrder.hasNextLine()) {
				String[] order = inputOrder.nextLine().split("[\\s]+");
				for (Products product : productList) {
					if (product.getName().equals(order[1])) {
						Double priceProduct = product.getPrice();
						Double quantity = Double.parseDouble(order[0]);
						sum += priceProduct * quantity;
					}
				}
			}
			output.write(String.format("Sum = %.2f", sum));
			output.close();
			
		} catch (FileNotFoundException fnfEx) {
			
			System.out.println("File Not Found");
			fnfEx.printStackTrace();
			
		} catch (IOException ioEx) {
					System.out.println("Error");
					ioEx.printStackTrace();
		}
	}
}

class Products {
	private String name;
	private Double price;

	public Products(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%6.2f %s%n", price, name);
	}

}