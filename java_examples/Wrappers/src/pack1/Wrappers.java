package pack1;

public class Wrappers {

	public static void main(String[] args) {
		String s="1231.123";
		System.out.println("string: "+s);
		double d = Double.parseDouble(s);
		System.out.println("double: "+d);
		s= d+"";
		Integer i = 19;
		float fa = Float.parseFloat(s);
		System.out.println("fa: "+ fa);
		float f = i.floatValue();
		System.out.println("float: " + f);
		long l = i.longValue();
		System.out.println("long: " + l);
	}

}
