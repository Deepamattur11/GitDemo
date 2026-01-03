
public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo obj1=new MethodsDemo();
		obj1.display();
		
		MethodsDemo2 obj2=new MethodsDemo2();
		obj2.display();
		
		print();

	}
public void display() {
	System.out.println("Hello world");
}

public static void print() {
	System.out.println("Static method can be called without object");
}
}
