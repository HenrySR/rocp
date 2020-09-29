package pack1;

import java.util.HashSet;
import java.util.Set;

public class PlaneMain {

	public static void main(String[] args) {
		Set<Airplane> planeList =new HashSet<>();
		planeList.add(new Airplane(100,"Delta",175.0d,4.6f));
		planeList.add(new Airplane(101,"Delta",125.0d,4.1f));
		planeList.add(new Airplane(102,"Delta",75.0d,2.6f));
		planeList.add(new Airplane(100,"Delta",175.0d,4.6f));
		planeList.add(new Airplane(100,"Delta",195.0d,3.6f));
		planeList.add(new Airplane(103,"Delta",175.0d,4.6f));
		printPlanes(planeList);
	}

	private static void printPlanes(Set<Airplane> planeList) {
		for(Airplane a:planeList) {
			System.out.println(a);
		}
		
	}

}
