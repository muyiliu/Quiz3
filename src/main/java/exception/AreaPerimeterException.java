package exception;

public class AreaPerimeterException extends Exception{

	private AreaPerimeterException failedAreaPerimeter;
	
	public AreaPerimeterException (double area){
		System.out.println("It does not fit requirment!");
	}
}