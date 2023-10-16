package Collection;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println(al.size());
		
		al.add(1);
		al.add(3);
		al.add(10);
		
		System.out.println(al.size());
		
		System.out.println(al.get(0));   // this gives the number present at the given index
		System.out.println(al.get(1));
		
		al.remove(0);    // removes the number at the given index
		
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
	}

}
