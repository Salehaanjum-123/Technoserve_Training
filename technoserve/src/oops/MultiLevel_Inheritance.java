package oops;
class Animal1{
	void eat() {
		System.out.println("animal is eating");
	}
}
class Mammal extends Animal1{
	void sleep() {
		System.out.println("Mamal is sleeping");
	}
}
class Dog2 extends Mammal{
	void  bark() {
		System.out.println("dog is barking");
	}
}
public class MultiLevel_Inheritance {
	public static void main(String[] args) {
		Dog2 dog=new Dog2();
		dog.eat();
		dog.sleep();
		dog.bark();
		
	}

}
