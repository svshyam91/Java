/* 
	This program shows how private members of superclass are not 
	accessable to subclass. 

*/

// Superclass
class A {

	int i;
	private int j;			// Chance this variable to public to run the program

	void setij( int i, int j ) {
		this.i = i;
		this.j = j;
	}

}

class B extends A {

	int total;

	void sum() {
		total = i+j; 		// Error since j is not accessable here
	}

}

class Access {
	public static void main(String[] args) {
		B subOb = new B();
		subOb.setij( 10, 20 );
		subOb.sum();
		System.out.println("the sum of two numbers is "+ subOb.total );
	}
}