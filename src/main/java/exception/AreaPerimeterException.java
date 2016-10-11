package exception;

public class AreaPerimeterException extends Exception{

private double area;
	
	public AreaPerimeterException (double checkarea)throw new AreaPerimeter{
		/*
		 * trying to throw this to AreaPerimeter, but I dont why I cannot do that
		 */
		
		if (area <= 0){
		this.area = area;
		area = (s*(s-side1)*(s-side2)*(s-side3));
		}
		else
		{
			chackarea = getArea;
		}
	}
}
	public double getarea()
	{
		return area;
	}
}