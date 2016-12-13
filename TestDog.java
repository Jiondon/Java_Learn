
class Animal{
	public void move(){
		System.out.println("animal can move");
		
	}
}

class Dog extends Animal{
	public void move(){
		super.move();
		System.out.println("dog can run and go");
	}
}
public class TestDog {
	public static void main(String[] args){
		Dog b = new Dog();
		b.move();
	}
}
