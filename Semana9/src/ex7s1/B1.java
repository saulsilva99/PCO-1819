package ex7s1;

class B1 extends A {
	
	public B1(int v) {
		super(v);
	}
	public int getValue() {
		return super.get();
	}

	@Override
	public String toString() {
		return "B1" + get();
	}
}
