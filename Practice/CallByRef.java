class Test {
	int i, j;

	void meth( Test ob ) {
		ob.i = ob.i * 2;
		ob.j = ob.j / 2;
	}
}

class CallByRef {
	public static void main(String[] args) {
		Test ob = new Test();
		ob.i = 10;
		ob.j = 20;
		System.out.println("Before: i = "+ob.i+" j = "+ob.j);
		ob.meth( ob );
		System.out.println("After: i = "+ob.i+" j = "+ob.j); 
	}
}