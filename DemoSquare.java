//2.	Create a class named Square that contains data fields
//for height, width, and surfaceArea, and a method named 
//computeSurfaceArea(). Create a child class named Cube.
//Cube contains an additional data field named depth, 
//and a computeSurfaceArea() method that overrides 
//the parent method.
//Write an application that instantiates a Square object and a 
//Cube object and displays the surface areas of the objects. 
//Save the files as Cube.java, Square.java, and DemoSquare.java.

package studyopedia;
 class Square{
	 float height,width,surfacearea;
	 void computeSurfaceArea( float h,float w)
	 {
		 height=h;
		 width=w;
		 surfacearea=height*width;
		 System.out.println("Surface area of square :"+surfacearea);
		 
	 }
 }
 class Cube extends Square
 {
	 float depth;
	 void computeSurfaceArea(float d)
	 {
		 depth=d;
	 }
	 void computeSurfaceArea( float h,float w)
	 {
		 height=h;
		 width=w;
		 surfacearea=height*width*depth;
		 System.out.println("Surface area of cube :"+surfacearea);
		 
	 }
 }
public class DemoSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Square s = new Square();
      s.computeSurfaceArea(12,4);
      Cube c= new Cube();
      c.computeSurfaceArea(3);
      c.computeSurfaceArea(12,4);
	}

}
