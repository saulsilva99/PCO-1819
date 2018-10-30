package exercicio43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner; 

public class CSVFiles {
	
	public void leituraCSV() throws FileNotFoundException{
		Scanner inputFromFile = new Scanner(new File("src/exercicio43/ficheiroexcell.csv"));
		while(inputFromFile.hasNextLine()) {
			System.out.println(inputFromFile.nextLine());
		}
	}

}
