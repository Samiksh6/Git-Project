package Collection;

import java.util.Stack;

public class stacklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stk = new Stack<String>();
		
		stk.push("Red");
		stk.push("Yellow");
		stk.push("Blue");
		stk.push("Green");
		
		System.out.println(stk.peek());  // it reads the last value
		System.out.println(stk.size());
		System.out.println(stk.pop());   // it reads and removes the last value
		System.out.println(stk.size());
		
		
	}

}
