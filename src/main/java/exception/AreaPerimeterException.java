package exception;

public class AreaPerimeterException extends Exception{

private double area;
	
	public AreaPerimeterException (double area)
	{
		this.area = area;
	}
	public double getarea()
	{
		return area;
	}
}