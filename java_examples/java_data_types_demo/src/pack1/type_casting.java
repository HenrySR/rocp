package pack1;

public class type_casting {

	public static void main(String[] args) {
		int x = 1000;
		
		double d1 = x;
		System.out.println("d1 Value: " + d1);
		
		char c ='A';
		
		int y = c;
		System.out.println("y Value: "+ y);
		y= 100;
		c=(char)y;
		System.out.println("c Value: "+c);
		
		float f = 99.88f;
		int z=(int)f;
		System.out.println("z value: " +z);
	}

}
