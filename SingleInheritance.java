package day13;

class Animal{
	void makesound() {
		System.out.println("sound");
	}
}
 class Cat extends Animal{
	 @Override
 void makesound() {
	 System.out.println("Cat meows");}
 }
 class Dog extends Cat{
	 @Override
	 void makesound() {
		 System.out.println("Dog barks ");}
	 }
	 

public class SingleInheritance {
	public static void main(String args[]) {
		Cat c=new Cat();
		c.makesound();
		Dog d=new Dog();
		d.makesound();
	} 

}
