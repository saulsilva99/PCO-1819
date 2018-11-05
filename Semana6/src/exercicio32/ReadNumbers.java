package exercicio32;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ReadNumbers {
	int inc = 0;
	double min;
	double max;
	double total = 0;
	double average;
	
	public void number() {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		while (true) {
			System.out.print("Enter a number ('end' to stop): ");
			if(sc.hasNext()) {
				if(sc.hasNextDouble()) {
					double numb = sc.nextDouble();
					if(inc == 0) {
						max = numb;
						min = max;
					}
					max = Math.max(max, numb);
					min = Math.min(min, numb);
					total += numb;
					inc+=1;
					average = total/inc;
				}else {
					String word = sc.next();
					if(word.equals("end")) {
						break;
					}else {
						System.out.println("'"+word+"' not understood");
					}
				}
			}
		}
		if(inc == 0) {
			System.out.println("Min="+ "N/A"+" Max= "+"N/A"+" Average= "+"N/A");
		}else{
			System.out.println(total);
			System.out.println(inc);
			System.out.println("Min="+ min+" Max= "+max+" Average= "+average);
		}
	}
}
