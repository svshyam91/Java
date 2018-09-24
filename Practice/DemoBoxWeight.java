/* This program illustrates the use of inheritance in java */

class Box {

	double width, height, length;

	/* Constructor when object of box class is passed
		for creating the clone of an object */
	Box( Box ob ) {
		width = ob.width;
		height = ob.height;
		length = ob.length;
	}

	/* Constructor used when all dimensions are specified */
	Box( double width, double height, double length ) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	/* Constructor used when no dimensions are specified */
	Box() {
		width = -1;
		height = -1;
		length = -1;
	}

	/* Constructor used when cube is to be created */	
	Box( double len ) {
		width = len;
		height = len;
		length = len;
	}

	double volume() {

		return width*height*length;
	}
}
class BoxWeight extends Box {
	double weight;

	BoxWeight( double width, double height, double length, double weight ) {

		this.width = width;
		this.height = height;
		this.length = length;
		this.weight = weight;
	}
}

class DemoBoxWeight {
	public static void main(String[] args) {
		
		BoxWeight mybox1 = new BoxWeight( 10, 20, 30, 40 );
		BoxWeight mybox2 = new BoxWeight( 11, 22, 33, 44 );

		System.out.println("The volume of mybox1 is: "+mybox1.volume());
		System.out.println(" The weight of mybox1 is: "+mybox1.weight+"\n");

		System.out.println("The volume of mybox2 is: "+mybox2.volume());
		System.out.println("The weight of mybox2 is: "+mybox2.weight);
	}
}