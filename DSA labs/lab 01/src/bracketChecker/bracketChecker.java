package bracketChecker;

//import stack class in stack package
import Stack.Stack;

public class bracketChecker {
	//declare a attribute to get the input string
	private String inputStr;
	//create a constructor to assign the value
	public bracketChecker(String in) {
		this.inputStr = in; //3 + (( 6 * 2) – 3)
	}
	
	public void checkBracket() {
		//get the length of the input string to a variable
		int size = inputStr.length();//11
		//take that string length as the stack size
		Stack newStack = new Stack(size);//maxSize = 11
		
		for(int i=0;i<size;i++) { /*in here when meet a open bracket it push the open bracket and when meet a close bracket 
		it pop a pushed elements. then if a inserted String is a valid one it should pop all the pushed elements at the end */
			
			if(inputStr.charAt(i) == ('(')) {
				newStack.push('(');
				
			}
			else if(inputStr.charAt(i) == (')')) {
				newStack.pop();
			}
		}
		//check the stack is not empty
		if(!newStack.isEmpty()) {
			//if stack is not empty it is a invalid string
			System.out.println("Invalid String");
		}
		else {
			//if stack is empty it is a valid string
			System.out.println("Valid String");
			
		}
		
		
		
	}
	

	
}
