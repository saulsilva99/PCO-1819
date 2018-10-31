package exercicio43;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cell {
	StringBuilder sb;
	public String[][] arrayBi = new String[100][100];
	
	public Cell(String s) {
		
	}
	public Cell(int s) {
		
	}
	public Cell(double s) {
		
	}
	
	public void readFromFiles() throws FileNotFoundException {
		int i = 0;
		Cell celula;
		Scanner inputFromFile = new Scanner(new File("src/exercicio43/ficheiroexcell.csv"));
		while (inputFromFile.hasNextLine()) {

			String linha = inputFromFile.nextLine();
			for (int j = 0; j < linha.split(",").length; j++) {
				String colunas = linha.split(",")[j];
				arrayBi[i][j] = sb.append(colunas).toString();
				celula = new Cell(arrayBi[i][j]);
				// System.out.println("["+i+"]"+"["+j+"]"+arrayBi[i][j]);
			}
			i += 1;
		}
		inputFromFile.close();
	}

}
