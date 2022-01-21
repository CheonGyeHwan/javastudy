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

			stack = newStack;
		}
	}
	
	public String pop() throws MyStackException {
		if (isEmpty()) {
			throw new MyStackException("stack is empty");
			
		} else {
			String popVal = null;
			
			if (stack.length == 1 || (stack[1] == null)) {
				popVal = stack[0];
				stack = null;
			} else {
				for (int i = (stack.length - 1); i >= 0; i--) {
					if (stack[i] == null) { 
						continue; 
					}
					
					popVal = stack[i];
					
					String[] newStack = new String[i];
					for (int j = 0; j < newStack.length; j++) {
						newStack[j] = stack[j];
					}
					
					stack = newStack;
					break;
				}
			}
			return popVal;
		}
	}
	
	public boolean isEmpty() {
		
		if (stack == null ) {
			return true;
		} else {
			return false;
		}	
	}

}