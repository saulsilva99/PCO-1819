package exercio35;
import java.util.Arrays; 

public class Alfagrama {
	public static String word;
	public Alfagrama(String w){
		word = w;
	}
	public static String orderAsc() {
		char[] c =  word.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	static boolean isAlfagrama(String w) {
		int n = (w.compareTo(orderAsc()));
		if( n == 0) {
			return true;
		}else {
			return false;
		}
	}
}
