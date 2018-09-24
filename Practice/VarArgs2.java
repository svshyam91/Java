/*
	This program implements the variable length arguments with 
	normal arguments.
*/

class VarArgs2 {
	static void vaTest( int a, int b, int c, int ... v ) {
		System.out.println(" The first argument a: "+a);
		System.out.println(" The second argument b: "+b);
		System.out.println(" The third argument c: "+c);
		System.out.println(" The length of variable length arguments is: "+v.length);
		System.out.println(" The variable length arguments are:");
		for( int x: v ) {
			System.out.println(x+ " ");
		}
	}
	public static void main(String[] args) {
		vaTest( 1, 2, 3, 4, 5, 6, 7 );
		vaTest( 1, 2, 3 );
		vaTest( 1, 2, 3, 4 );
		vaTest( 1, 2, 3, 4, 5 );
	}
}