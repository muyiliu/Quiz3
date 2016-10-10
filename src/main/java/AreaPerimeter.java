public class AreaPerimeter extends GeometricObject{
	
	public double side1 = 1;
	public double side2 = 1;
	public double side3 = 1;
	


	public AreaPerimeter(int side1,int side2,int side3){
		this.side1 = side1;
		this.side2 = side2;
		 this.side3 = side3;
	}
	
	public double getSide1(){
		return side1;
	}
	public double getSide2(){
		return side2;
		}
	
		public double getSide3(){
			return side3;
			}
	
	public void setThree_sides(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

}
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
		
	}
	
	public double getArea(){
		double s = (getPerimeter())/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	public String toString(){
		return "Area is" + getArea() +"Perimeter is " + getPerimeter()+"Color is"+getColor() +"Filled is"+ isFilled();
	}
}
