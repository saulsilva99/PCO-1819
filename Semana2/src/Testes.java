
public class Testes {

	public static void main(String[] args) {
		String a = "linux,mac,windows";
		int b = a.length();
		//System.out.println(b);
		String [] c = a.split(",");
		//System.out.println(c[0]);
		String d = a.substring(0, 2);
		//System.out.println(d);
		
		for(String foo: c) {
			System.out.println(foo);
		}
	}

}
