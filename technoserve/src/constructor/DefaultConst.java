package constructor;

class Myclass1
{
	String color;
	int cost;
	String brand;
	
	Myclass1(){
		color="Pink";
		cost=2000000;
		brand="BMW";
		}
}

public class DefaultConst {

	public static void main(String[] args) {
		Myclass1 obj=new Myclass1();
		System.out.println(obj.color + " "+obj.cost+ " "+obj.brand);
		
	}

}
