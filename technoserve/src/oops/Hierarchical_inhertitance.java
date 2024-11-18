package oops;
class Animal2{
	void eat() {
		System.out.println("animal is eating");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("dog is barking");
	}
}
class Cat extends Animal2{
	void voice() {
		System.out.println("cat is making noice as meo");
	}
}
class Elephant extends Animal2{
	void trumpet() {
		System.out.println("elephant is making noice as trumphet");
	}
}
public class Hierarchical_inhertitance {

	public static void main(String[] args) {
		Dog2 dog2=new Dog2();
		Cat cat=new Cat();
		Elephant elephant=new Elephant();
		dog2.eat();
		cat.eat();
		elephant.eat();
		dog2.bark();
		cat.voice();
		elephant.trumpet();
	}

}
