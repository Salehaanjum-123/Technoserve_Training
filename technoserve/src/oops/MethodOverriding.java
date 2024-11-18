package oops;

class Vehicles{
	void move() {
		System.out.println("the vehicle moves");
	
	}
}
class car extends Vehicles{
	void move() {
		System.out.println("the car rides");
	}
}
class bicycle extends Vehicles{
		void move() {
			System.out.println("the bicycle pedals");
		}
}
class aeroplane extends Vehicles{
			void move() {
				System.out.println("the aeroplane flies");
			}
}

public class MethodOverriding {

	public static void main(String[] args) {
     Vehicles obj=new Vehicles();
     obj=new car();
     obj.move();
     obj=new bicycle();
     obj.move();
     obj=new aeroplane();
     obj.move();
	}
}

