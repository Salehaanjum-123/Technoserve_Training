package technoserve;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implicit
		byte b=127;
		int i=b;
		System.out.println(i);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		//explicit
		double d1=10.52d;
		long l=(long) d1;
		System.out.println(l);
	}

}
