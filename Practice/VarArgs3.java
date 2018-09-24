class VarArgs3{

	static void vaTest( int ... v ) {

		System.out.println("No. of arguments: "+v.length);
		System.out.println("Arguments: ");
		for( int x: v )
			System.out.println(x +" ");
	}
	static void vaTest( boolean ... v ) {

		System.out.println("No. of arguments: "+v.length);
		System.out.println("Arguments: ");
		for( boolean x: v ) 
			System.out.println(x +" ");
	}
	static void vaTest( String str, int ... v ) {

		System.out.println("String argument: "+str);
		System.out.println("No. of variable number of arguments: "+v.length);
		System.out.println("Arguments: ");
		for( int x: v )
			System.out.println(x +" ");
	}
	public static void main(String[] args) {
		
		vaTest( 1, 2, 3 );
		vaTest( "Shyam", 1, 2, 3, 4 );
		vaTest( true, false, true );
	}
}