class StringDemo {

	public static void main(String[] args) {
		String myString1 = "My name is Shyam";
		String myString2 = "I live in Lucknow";
		String myString3 = "I'm pursuing B.tech from ABESIT";
		String myString4 = "My name is Shyam";

		System.out.println("The length of myString1: "+ myString1.length());
		System.out.println("The length of myString2: "+ myString2.length());
		System.out.println("The length of myString3: "+ myString3.length());
		
		if( myString1.equals(myString4) )
			System.out.println("myString1 and myString4 are equal strings.");
		else
			System.out.println("myString1 and myString4 are not equal strings.");
		if( myString1.equals(myString3) )
			System.out.println("myString1 and myString3 are equal strings.");
		else
			System.out.println("myString1 and myString3 are not equal strings");

		// Printing the charaters of string3
		int i = 0;
		int l = myString3.length();
		System.out.println("The characters of myString3 are:");
		for( i = 0; i < l; i++ ) {
			System.out.println("i = "+i+": "+myString3.charAt(i));
		}
	}
}