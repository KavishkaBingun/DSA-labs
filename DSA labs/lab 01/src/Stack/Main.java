package Stack;

public class Main {

	public static void main(String[] args) {
		
		int i =0;
		
		Stack stack = new Stack(5);
		stack.push('S');
		stack.push('T');
		stack.push('A');
		stack.push('C');
		stack.push('K');
		
		stack.display();
		
		System.out.println("\n");
		System.out.println("Peak value is : " + stack.peek());
		System.out.println("\n");
		
		
		while(!stack.isEmpty()) {
			
			char ch1 = stack.pop();
			System.out.println("Top deleated element is : " + ch1);
			i++;
			
			
		}
		
	
		
		

	}
	
	

}
