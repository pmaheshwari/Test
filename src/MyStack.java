import java.util.Stack;

public class MyStack {

	Object[] stack;
	int top = -1;
	public MyStack(){
		stack = new Object[10];
	}
	
	public void push(Object obj){
		if(top < stack.length){
			stack[top+1] =obj;
			top++;
		}else{
			System.out.println("Stack overflow");
		}
	}
	
	public Object pop(){
		Object poped  = null;
		if(top < stack.length && top != -1){
			poped = stack[top];
			stack[top] = null;
			top -- ;
		}
		else{
			System.out.println("Stack underflow");
		}
		return poped;
	}
	public static void main(String[] args) {
		
		
		MyStack stack = new MyStack();
		stack.push("jjl");
		stack.push("jjl");
		stack.push("jjl");
		stack.pop();
		System.out.println();
	}
}
