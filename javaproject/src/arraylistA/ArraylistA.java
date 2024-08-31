package arraylistA;

import java.util.ArrayList;

public class ArraylistA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList obj = new ArrayList();
		
		obj.add("Mumbai");
		obj.add(100);
		obj.add('A');
		obj.add("Pune");
		obj.add(null);
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		System.out.println(obj.isEmpty());
		
		System.out.println(obj.contains("Pune"));
		System.out.println(obj.get(3));
		obj.add(2,"Sneha");
		System.out.println(obj);
		
	}

}
