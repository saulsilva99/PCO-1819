package exercio32;


public class SomeClass {
	private int fieldA;
	int fieldB;
	public SomeClass() {
		setA(0);
		setB(0);
	}

	SomeClass(int a, int b) {
		setA(a);
		setB(b);
	}
	private int getA() {
		return fieldA;
	}
	public int getB() {
		return fieldB;
	}
	void setA(int a) {
		fieldA = a;
	}
	private void setB(int b) {
		fieldB = b;
	}

	public static void main(String[] args) {
		SomeClass x = new SomeClass();
		SomeClass y = new SomeClass(1, x.getB());
		SomeClass z = new SomeClass(x.getA(), 1);
		z.setA(x.getB());
		z.setB(y.getB());
		z.fieldA = 3;
		z.fieldB = 4;
		x.setA(3);
		x.setB(3);
		x.fieldA = 6;

		System.out.println(x.getA());
	
	}

}
