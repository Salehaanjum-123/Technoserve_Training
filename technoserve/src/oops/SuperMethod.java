package oops;
class Animal5{
	void makeSound() {
		System.out.println("Animal makes sound");
	}
}

class Dog5 extends Animal5{
	void makeSound() {
		super.makeSound();
		System.out.println("Dog barks");
	}
}


public class SuperMethod {

	public static void main(String[] args) {
		Dog5 dog=new Dog5();
		dog.makeSound();
	}

}
