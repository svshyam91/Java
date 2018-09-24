/* This program passes variable number of arguments using array */


class PassArray {

	/* This function is static because else main() will not be able to call it
		since main() is declared as static.
		
		Remember: Static members can only call Static members of a class directly.
	*/
	static void vaTest( int v[] ) {
		System.out.println("The total number of arguments are:"+v.length);
		System.out.println("The arguments are:");
		for( int x: v )
			System.out.println(x+ " ");
		System.out.println();
	}

	public static void main(String[] args) {

		int v[] = {1, 2, 3};
		int v2[] = {10, 20};
		int v3[] = {};

		vaTest( v );
		vaTest( v2 );
		vaTest( v3 );  
	}

}