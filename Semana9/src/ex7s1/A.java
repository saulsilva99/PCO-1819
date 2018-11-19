package ex7s1;

class A {
	private int value;

	public A(int v) {
		value = v;
	}

	public final int get() {
		return value;
	}

	@Override
	public String toString() {
		return "A" + value;
	}
}
