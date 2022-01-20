package prob5;

public class MyStack {
	private String[] stack;
	
	public MyStack(int length) {
		stack = new String[length];
	}
	
	public void push(String inputVal) {
		
		if (stack[stack.length - 1] == null) {
			for (int i = 0; i < stack.length; i++) {
				if (stack[i] == null) {
					stack[i] = inputVal;
					break ;
				}
			}
		} else {
			String[] newStack = new String[stack.length + 1];
			for (int i = 0; i < stack.length; i++) {
				newStack[i] = stack[i];
			}
			newStack[newStack.length - 1] = inputVal;
			
			
			stack = new String[newStack.length];
			for (int i = 0; i < stack.length; i++) {
				stack[i] = newStack[i];
			}
			
			newStack = null;
		}
	}
	
	public String pop() {
		String popVal;
		
		if (stack.length == 1) {
			popVal = stack[0];
			stack[0] = null;
		} else {
			popVal = stack[stack.length - 1];
			
			String[] newStack = new String[stack.length - 1];
			for (int i = 0; i < newStack.length; i++) {
				newStack[i] = stack[i];
			}
			
			stack = new String[newStack.length];
			for (int i = 0; i < stack.length; i++) {
				stack[i] = newStack[i];
			}
		}
		return popVal;
	}
	
	public boolean isEmpty() {
		
		if (stack[0] == null ) {
			return true;
		} else {
			return false;
		}	
	}

}
