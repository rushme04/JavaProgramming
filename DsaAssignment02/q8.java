package DsaAssignment02;
interface Flyable{
	void fly();
}
interface Swimmable{
	void swim();
}
class duck implements Flyable,Swimmable{
	String name;
	duck(String name){
		this.name=name;
	}
	public void fly() {
		System.out.println(name+" is flying.");
	}
	public void swim() {
		System.out.println(name+" is swimming.");
	}
	void display() {
		System.out.println("Duck Name: "+name);
		System.out.println("Capabilities: ");
		fly();
		swim();
	}
}

public class q8 {

	public static void main(String[] args) {
		duck one= new duck("bob");
		one.display();
//		one.fly();
//		one.swim();

	}

}
