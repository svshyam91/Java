/* This program illustrates the use of super keyword */

class Box {

	private double width;
	private double height;
	private double depth;

	// Construct clone of an object
	Box( Box ob ) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// Constructor when all dimensions are specified
	Box( double width, double height, double depth ) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	// Constructor when no dimension is specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// Constructor when cube is created
	Box( double len ) {
		width = len;
		height = len;
		depth = len;
	}

	// Compute and return volume 
	double volume() {
		return (width*height*depth);
	}
}

class BoxWeight extends Box {

	double weight;

	// Constructor when object is passed
	BoxWeight( BoxWeight ob ) {
		super(ob);
		weight = ob.weight;
	}

	// Constructor when all dimensions specified
	BoxWeight( double width, double height, double depth, double weight ) {

		super( width, height, depth );
		this.weight = weight;
	}

	// Constructor when no dimensions specified
	BoxWeight() {
		super();
		weight = -1;
	} 

	// Constructor when cube is created 
	BoxWeight( double len, double weight ) {
		super( len );
		this.weight = weight;
	}

}

class DemoSuper {

	public static void main(String[] args) {

		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight mybox3 = new BoxWeight();
		BoxWeight mycube = new BoxWeight(2, 3);
		BoxWeight myclone = new BoxWeight(mybox1);

		double vol1 = mybox1.volume();
		System.out.println("The volume of the mybox1 is "+vol1);
		System.out.println("The weight of mybox1 is "+mybox1.weight);
		System.out.println();

		double vol2 = mybox2.volume();
		System.out.println("The volume of mybox2 is "+vol2);
		System.out.println("The weight of mybox2 is "+mybox2.weight);
		System.out.println();

		double vol3 = mybox3.volume();
		System.out.println("The volume of mybox3 is "+vol3);
		System.out.println("The weight of mybox3 is "+mybox3.weight);
		System.out.println();

		double volcube = mycube.volume();
		System.out.println("The volume of cube is "+volcube);
		System.out.println("The weight of mycube is "+mycube.weight);
		System.out.println();

		double myclonevol = myclone.volume();
		System.out.println("The volume of myclone is "+myclonevol);
		System.out.println("The weight of myclone is "+myclone.weight);
		System.out.println();
	}
}