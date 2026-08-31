package FilesExamples;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

// An example of taking user input and writing them to a file
public class Students {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner inUser = new Scanner(System.in);

		//NOTE - Folder is based on which file you are in when running this
		// If in "ClassExamples", use "./FilesExamples/FilesOutput/output.txt"
		// If in "FilesExamples", use "./FilesOutput/output.txt"
		PrintWriter outFile = new PrintWriter("./FilesExamples/FilesOutput/output.txt");

		for(int i = 0; i < 5; i++){
			System.out.print("Enter a student's name :: ");
			String student = inUser.nextLine();

			outFile.println(student);
		}

		outFile.close();
		inUser.close();
	}
}
