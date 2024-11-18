package oops;
class MethodOverloadingImp{
	public int add(int a,int b) {
		return a+b;
		
	}
	public int add(int a, int b,int c) {
		return a+b+c;
	}
	public double add(int a, double b) {
		return a+b;
	}
}
public class methodOverloading {

	public static void main(String[] args) {
		MethodOverloadingImp obj=new MethodOverloadingImp();
		System.out.println(obj.add(4,8));
		System.out.println(obj.add(4,8,7));
		System.out.println((obj.add(2,3.3)));
	}

}
