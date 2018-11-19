package ex7s1;

class B2 extends B1 {
	public B2(int v) {
		super(v+1);
	}

	public String toString() {
		return "B2" + super.toString();
	}
}
