package Stack;

//implementing stack class
public class Stack {
	//attributes in stack class
	private int top;
	private int maxSize;
	private char[]stackArray;
	
	//constructer in stack class to assign values to attributes
	public Stack(int S) {
		
		this.top = -1; //at first stack is empty
		this.maxSize = S;
		this.stackArray = new char[maxSize];
		
	}
	//check the stack is empty
	public boolean isEmpty() {
		return (top == -1);
	}
	//chech the stack is full
	public boolean isFull() {
		return (top == maxSize - 1);
	}
	//push elements to stack
	public void push(char ch) {
		if(!isFull() ) {
			top ++ ;
			stackArray[top]=ch;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	//pop elements from the stack
	public char pop() {
		if(!isEmpty()) {
			char temp = stackArray[top];
			top --;
			return temp;
			
		}
		
		else {
			System.out.println("Stack is empty");
		}
		
		return 0;
	}
	//display the top value of the stack
	public char peek() {
		if(!isEmpty()) {
			return stackArray[top];
			
		}else {
			System.out.println("Stack is empty");
			return 0;
		}
	}
	//display the stack
	public void display() {
		System.out.println("Printing Values in stack");
		
		int i = top;
		
		while (i>=0) {
			System.out.println(stackArray[i] + " ");
			i--;
		}
	}

	

}
