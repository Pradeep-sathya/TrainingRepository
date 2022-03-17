package abst.com;
public class Rectangle extends Shape implements TwoDInterface,ThreeDInterface{

	 @Override
	public void draw() {
	System.out.println("Drawing rectangle");
	}

	 @Override
	public void calculatearea() {
	int area=length*breadth;
	System.out.println("Area of the rectangle is "+area);
	}

	 @Override
	public void draw3DShape() {
	}

	 @Override
	public void draw2DShape() {
	System.out.println("2D Rectangle");
	}

	}
