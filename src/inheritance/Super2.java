package inheritance;

public class Super2 extends Super1 {

	public void eat() {
		System.out.println("dog is eating");
	}
	public void bark() {
		System.out.println("dog is barking");
	}
	public void work() {
		super.eat();
	}
}
