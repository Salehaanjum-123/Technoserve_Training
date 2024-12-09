package exception;

public class ThrowExceptionDrmo {
	void validate(int age) {
	if(age<18) {
		throw new ArithmeticException("they are not eligible");
	}
	else {
		System.out.println("you are eligible");
	}
	
	
	
	
}
	
	

	public static void main(String[] args) {
		ThrowExceptionDrmo obj=new ThrowExceptionDrmo();
		obj.validate(4);
		
		
	}

}
