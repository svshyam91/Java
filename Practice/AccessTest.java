class Test {
	int a;
	public int b;
	private int c;

	void setc( int i ) {
		c = i;
	}

	int getc() {
		return c;
	}
}

class AccessTest {
	public static void main(String[] args) {
		Test ob = new Test();
		ob.a = 10;
		ob.b = 20;

		// ob.c = 30;	// Error
		ob.setc(30);
		int c = ob.getc();
		System.out.println("a, b and c = "+ob.a+" "+ob.b+" "+c);
	}
}