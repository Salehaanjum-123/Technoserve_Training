package oops;

class Animal4
{
	void makeSound() {
		System.out.println("animal makes a sound");
	}
}
class Dog4 extends Animal4
{
	void makeSound() {
		System.out.println("dog is barking ");
	}
}

class Cat4 extends Animal4
{
	void makeSound() {
		System.out.println("cat is barking ");
	}
}







public class MethodOvering_Inheritance {

	public static void main(String[] args) {
		Animal4 obj=new Animal4();
		Dog4 obj1=new Dog4();
		Cat4 obj2=new Cat4();
		
		obj.makeSound();
		obj1.makeSound();
		obj2.makeSound();
	}

}
