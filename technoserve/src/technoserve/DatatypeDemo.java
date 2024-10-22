package technoserve;

public class DatatypeDemo {

	public static void main(String[] args) {
		byte byteMax=127;
		byte byteMin=-128;
		System.out.println("Min range of byte is "+byteMin + " Max range of byte is "+byteMax);
		
		
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("Min range of short is "+ shortMin + " Max range of short is "+shortMax);

		
		int Maxint=2147483647;
		int Minint=-2147483648;
		System.out.println("int range of short is "+ Minint + " Max range of int is "+Maxint);

		long Maxlong= 922337036854775807L;
		long Minlong=-922337036854775808L;
		System.out.println("long range of short is "+ Minlong + " Max range of long is "+Maxlong);

		float f= 3234.1414243278345f;
		double d=3456.1412351234567890234567891d;
		System.out.println("float value is "+f +" double is "+d);

		boolean status=false;
		System.out.println("boolean value is "+status);
		
		char c='M';
		System.out.println("char value is "+c);

		
	}

}
