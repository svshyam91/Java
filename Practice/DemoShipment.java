/* This program illustrates the use of Multilevel Inheritance */

class Box {

	private double width;
	private double height;
	private double depth;

	// Constructor when all dimensions specified
	Box( double width, double height, double depth ) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// Constructor when no dimensions specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// Constructor to clone box
	Box( Box ob ) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// Constructor to make cube
	Box( double len ) {
		width = len;
		height = len;
		depth = len;
	}

	// Compute and return volume
	double volume() {
		return width*height*depth;
	}
}

class BoxWeight extends Box{
	double weight;

	// Constructor when all dimensions are specified
	BoxWeight( double width, double height, 
		double depth, double weight ) {

		super( width, height, depth );
		this.weight = weight;
	}

	// Constructor when no dimensions are specified 
	BoxWeight() {
		super();
		weight = -1;
	}

	// Constructor to clone box
	BoxWeight( BoxWeight ob ) {

		super( ob );
		weight = ob.weight;
	}

	// Constructor to make a Cube
	BoxWeight( double len, double weight ) {

		super( len );
		this.weight = weight;
	}
}

// Add Shiping Cose

class Shipment extends BoxWeight {

	double cost;

	// Constructor when all dimensions are specified 
	Shipment( double width, double height, 
		double depth, double weight, double cost ) {

		super( width, height, depth, weight );
		this.cost = cost;
	}

	// Constructor when no dimensions are specified
	Shipment() {

		super();
		cost = -1;
	}

	// Constructor for clone of box
	Shipment( Shipment ob ) {
		super( ob );
		cost = ob.cost;
	}

	// Constructor to make a cube
	Shipment( double len, double weight, double cost ) {

		super( len, weight);
		this.cost = cost;
	}
}

class DemoShipment {
	public static void main(String[] args) {
		Shipment shipment1 = new Shipment( 10, 20, 15.6, 10.5, 3.41 );
		Shipment shipment2 = new Shipment( 20, 30, 40.5, 10.2, 2.41 );

		double vol1 = shipment1.volume();
		System.out.println("The volume of shipment1 is "+ vol1);
		System.out.println("The weight of shipment1 is "+ shipment1.weight);
		System.out.println("The cost of shipment1 is "+shipment1.cost);

		double vol2 = shipment2.volume();
		System.out.println("The volume of shipment2 is "+vol2);
		System.out.println("The weight of shipment2 is "+shipment2.weight);
		System.out.println("The cost of shipment2 is "+shipment2.cost);
	}
}