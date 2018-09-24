class Box {

	double width, length, height;

	// Constructor that takes all dimensions
	Box( double width, double height, double length ) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	// Constructor that takes no dimension
	Box() {
		width = -1;
		height = -1;
		length = -1;
	}

	// Constructor for the cube 
	Box( double len ) {
		this.width = len;
		this.height = len;
		this.length = len;
	}

	double volume() {

		return width*height*length;
	}
}
class OverCons {
	
	public static void main(String[] args) {

		// create boxes using different constructors
		Box mybox1 = new Box(); // No arguments
		Box mybox2 = new Box(3, 4, 5); 		// Passing all dimensions
		Box mybox3 = new Box(4);	// Make cube

		/* Calculating the volume of Box having no dimensions initialized */
		System.out.println("The volume of box is "+mybox1.volume());

		/* Calculating the volume of Box having all dimensions initialized */
		System.out.println("The volume of mybox2 is "+mybox2.volume());

		/* Calculating the volume of cube */
		System.out.println("The volume of cube mybox3 is "+mybox3.volume());
	}
}