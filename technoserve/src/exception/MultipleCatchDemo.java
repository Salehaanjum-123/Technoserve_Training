package exception;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		int num[]=new int [4];
		try {
			num[9]=50/0;
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array is out of Bound "+e.getMessage());
			
		}catch(ArithmeticException e) {
			System.out.println("An enexpected error is occured "+e.getMessage());
		}
	}

}
