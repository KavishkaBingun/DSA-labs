package QueueX;

import java.util.Scanner;

public class QueApp {



	public static void main(String[] args) {
		//creating object in QueueX class
		QueueX queuex = new QueueX(5);
		//creating object in Scanner class to get keyboard inputs
		Scanner sc =new Scanner(System.in);
		//declare a variable to store keyboard inputs
		int inputStr;
		//for loop to store keyboard inputs in queuex queue
		for(int i=0;i<5;i++) {
			System.out.print("Enter Transaction ID "+ (i+1) + " : ");
			//store keyboard inputs in inputStr variable
			inputStr = sc.nextInt();
			//insert keyboard inputs to queuex queue
			queuex.insert(inputStr);
		}
		//creating objects from QueueX class
		QueueX oddqueuex = new QueueX(5);
		QueueX evenqueuex = new QueueX(5);
		
		int value;
		
		while(!queuex.isEmpty()) {
			value = queuex.remove();
			//if value is even insert that value to evenqueuex queue
			if(value%2==0) {
				evenqueuex.insert(value);
				
			}
			else {//if value is odd insert that value to oddqueuex queue
				oddqueuex.insert(value);
			}
			
			
		}
		System.out.println("\n");
		
		System.out.println("PC1");
		while(!evenqueuex.isEmpty()) {
			//desplay values in evenqueuex by removing
			int value1 = evenqueuex.remove();
			System.out.println("Transaction : "+value1);
		}
		System.out.println("\n");
		
		System.out.println("PC2");
		while(!oddqueuex.isEmpty()) {
			//desplay values in evenqueuex by removing
            int value2 = oddqueuex.remove();
			System.out.println("Transaction : "+value2);
		}
		
		

	}

}
