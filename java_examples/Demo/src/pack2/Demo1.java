package pack2;

public class Demo1 {
	
	public void helloNonStatic() {
		System.out.println("Hello from non static block");
	}
	
	public void helloNonStaticAgain() {
		System.out.println("Hello again");
	}
	
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.helloNonStatic();
		d.helloNonStaticAgain();
	}

}
