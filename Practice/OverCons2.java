class Box {

	double width, height, length;

	// Constructor that takes object as Parameter
	Box( Box ob ) {
		width = ob.width;
		height = ob.height;
		length = ob.length;
	}

	// Constructor that takes 3 parameters
	Box( double width, double height, double length ) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	// Constructor that takes no dimensions
	Box() {
		width = -1;
		height = -1;
		length = -1;
	}

	// Constructor that takes 1 dimension and makes cube
	Box( double len ) {
		width = len;
		height = len;
		length = len;
	}

	double volume() {
		return width*height*length;
	}
}

class OverCons2 {
	public static void main(String[] args) {
		
		Box mybox1 = new Box();
		Box mybox2 = new Box(10, 20, 30);
		Box mybox3 = new Box(50);

		Box myclone = new Box(mybox1);

		// get volume of mybox1
		System.out.println("The volume of mybox1 is "+mybox1.volume());

		// get volume of mybox2
		System.out.println("The volume of mybox2 is "+mybox2.volume());

		// get volume of mybox3
		System.out.println("The volume of mybox3 is "+mybox3.volume());

		// get volume of colned box 
		System.out.println("The volume of cloned box is "+myclone.volume());
	}
}