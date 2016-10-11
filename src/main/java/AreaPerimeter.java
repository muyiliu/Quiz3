import exception.AreaPerimeterException;
import java.io.*;

public class AreaPerimeter extends GeometricObject{
	
	public double side1 = 1;
	public double side2 = 1;
	public double side3 = 1;
	

	/*
	 * set three sides for tranigle
	 */
	public AreaPerimeter(int side1,int side2,int side3){
		this.side1 = side1;
		this.side2 = side2;
		 this.side3 = side3;
	}
	/*
	 * return to three sides' value
	 */
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
		}
	
		public double getSide3(){
			return side3;
			}
	/*
	 * set three sides again
	 */
	public void setThree_sides(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

}	
	/*
	 * (non-Javadoc)
	 * @see GeometricObject#getPerimeter()
	 */
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
		
	}
	/*
	 * (non-Javadoc)
	 * @see GeometricObject#getArea()
	 */ public double getArea(){
		double s = (getPerimeter())/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	public String toString(){
		return "Area is" + getArea() +"Perimeter is " + getPerimeter()+"Color is"+getColor() +"Filled is"+ isFilled();
	}
	
	public void CheckArea (double area)throws AreaPerimeterException {
		if (area<= 0)
		{
		
			
			System.out.print("It's not fit requirement");
		}
		else
		{
			double checkarea = getArea();
			throw new AreaPerimeterException(checkarea);
			
		}
	}
}
