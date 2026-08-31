package FilesExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Invoice {
	public static void main(String[] args) throws FileNotFoundException{
		// Finding and opening our .csv file
		//NOTE - Folder is based on which file you are in when running this
		// If in "ClassExamples", use "./FilesExamples/FilesInput/invoice.csv"
		// If in "FilesExamples", use "./FilesInput/invoice.csv"
		File inFile = new File("./FilesExamples/FilesInput/invoice.csv");
		Scanner input = new Scanner(inFile);

		// Initial lines of our invoice
		System.out.printf("%20s\n", "Invoice");
		System.out.printf("====================================\n");
		System.out.printf("%-10s%-10s%-10s%-10s\n", "Item", "Quantity", "Price", "Total");
		System.out.printf("------------------------------------\n");

		double sumTotal = 0;

		// Reading from the .csv file
		while(input.hasNextLine()){
			// Line from the .csv
			// Lines have the format "Item,Quantity,Price"
			String line = input.nextLine();
			String[] values = line.split(",");

			// Parts of the invoice
			String item = values[0];
			int quantity = Integer.parseInt(values[1]);
			double price = Double.parseDouble(values[2]);
			double total = price * quantity;
			sumTotal += total;

			// Formatted output for invoice
			// Learn more about printf modifiers here:
			// https://www.w3schools.com/java/ref_output_printf.asp
			System.out.printf("%-10s%-10d%-10.2f$%-10.2f\n", item, quantity, price, total);
		}
		System.out.printf("------------------------------------\n");
		System.out.printf("%30s%.2f\n", "$", sumTotal);

		input.close();
	}
}
