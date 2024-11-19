package constructor;
class Myclass2
{
	String color;
	int cost;
	String brand;
	
	Myclass2(String color,	int cost,String brand){
		this.color=color;
		this.cost=cost;
		this.brand=brand;
		}
}

public class ParameterizedConst {

	public static void main(String[] args) {
		Myclass2 obj=new Myclass2("white",255252,"BMW");
		Myclass2 obj1=new Myclass2("black",7525855,"Audi");
		System.out.println(obj.color + " "+obj.cost+ " "+obj.brand);
		System.out.println(obj1.color + " "+obj1.cost+ " "+obj1.brand);


	}

}
