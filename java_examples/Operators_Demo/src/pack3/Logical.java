package pack3;

public class Logical {
	
	public boolean logicalAND(boolean a,boolean b){
		boolean c= a && b;
		return c;
	}
	
	public boolean logicalOR(boolean a,boolean b) {
		boolean c= a || b;
		return c;
	}
	public boolean logicalNOT(boolean a) {
		boolean c= !a;
		return c;
	}
	
	public static void main(String[] args) {
		Logical L = new Logical();
		boolean a = true;
		boolean b = false;	
		System.out.println(a + " and " + b + " is " + L.logicalAND(a, b));
		System.out.println(a + " or " + b + " is " + L.logicalOR(a, b));
		System.out.println("not " + a + " is " + L.logicalNOT(a));
	}

}
