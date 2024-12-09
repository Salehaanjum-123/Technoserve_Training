
package Static;

public class staticVariable {
	String name;
	double price;
	public static String category="smart phone";

	public staticVariable(String name,double price) {
		this.name=name;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("name "+name);
		System.out.println("price"+price);
		System.out.println("category "+category);
		System.out.println();

	}
	public static void main(String[] args) {
		staticVariable mobile1=new staticVariable("Redmi",15000);
		staticVariable mobile2=new staticVariable("Oppo",20000);
		System.out.println("mobile 1 info:");
		mobile1.displayDetails();
		System.out.println("mobile 2 info:");
		mobile2.displayDetails();
	}

}
