/* This program demonstrate the implementation of 
	variable length arguments.
	
*/

class VarArgs {

	static void vaTest( int ... v ) {
		System.out.println("The total number of arguments are: "+v.length);
		System.out.println("The arguments are: ");
		for( int x: v ) {
			System.out.println(x + " ");
		}
	}

	public static void main(String[] args) {
		vaTest( 1, 2, 3, 4 );
		vaTest(1, 2, 3, 4, 5, 6);
		vaTest();
	}
}