package BasicsOfJAva;

public class Bitwiseoperators {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		//bitwise and
		System.out.println("(a&b) :" +(a &b));
		//bitwise or
		System.out.println("(a|b) :" +(a|b));
		//xor (^)
		System.out.println("(a^b) :" +(a^b));
		//not
		System.out.println("(~a) :" +(~a));
		//left shift
		System.out.println("(a<<3) :" +(a<<3));
		//right shift
		System.out.println("(a>>2) :" +(a>>2));
	}

}
