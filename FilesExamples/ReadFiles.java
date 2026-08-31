package FilesExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class ReadFiles{
	public static void main(String[] args){

		// We try to read a file, but this may result in errors
		// We catch the expected errors below to deal with them
		try{
			//NOTE - Folder is based on which file you are in when running this
			// If in "ClassExamples", use "./FilesExamples/FilesInput/numbers.txt"
			// If in "FilesExamples", use "./FilesInput/numbers.txt"
			// Comment out the line below and uncomment the line below it to introduce an error
			File inFile = new File("./FilesExamples/FilesInput/numbers.txt");
			// File inFile = new File("./numbers.txt");

			Scanner input = new Scanner(inFile);

			// Here we ask the Scanner if an integer can be read
			while(input.hasNextInt()){
				// while there are integers to read, we read them
				int output = input.nextInt();
				System.out.println(output);
			}

			// Always make sure to close your Scanners after use!
			input.close();
		}

		catch(FileNotFoundException error){
			System.out.println("File wasn't found! We might need a search party!");
		}

		catch(IOException error){
			System.out.println(error);
		}

	}

}

