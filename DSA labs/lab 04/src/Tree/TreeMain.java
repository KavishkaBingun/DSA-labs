package Tree;

import java.util.Scanner;

public class TreeMain {



	public static void main(String[] args) {
		
		Tree newTree = new Tree();
		
		newTree.insertNode(149, "Anusha");
		newTree.insertNode(167, "Kosala");
		newTree.insertNode(047, "Dinusha");
		newTree.insertNode(066, "Mihiri");
		newTree.insertNode(159, "Jayani");
		newTree.insertNode(118, "Nimal");
		newTree.insertNode(195, "Nishantha");
		newTree.insertNode(034, "Avodya");
		newTree.insertNode(105, "Bimali");
		newTree.insertNode(133, "Sampath");
		
		System.out.println("\n InOrder(left,root,right)\n");
		newTree.traverseinOrder();
		
		System.out.println("\n PreOrder(root,left,right)\n");
		newTree.traversepreOrder();
		
		System.out.println("\n PostOrder(left,right,root)\n");
		newTree.traversepostOrder();
		
		System.out.println("\n");
		
		int value;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter the employee number : ");
		value = sc.nextInt();
		newTree.find(value);
		
		System.out.println("\n");
		
		newTree.deleteAll();
		
		
		/*System.out.print("Enter the employee number : ");
		int value1 = sc.nextInt();
		newTree.find(value1);*/
		
		
		System.out.print("After delete method calling");
		newTree.callRecursive(133);

		System.out.println("\n InOrder(left,root,right)\n");
		newTree.traverseinOrder();
		
		System.out.println("\n PreOrder(root,left,right)\n");
		newTree.traversepreOrder();
		
		System.out.println("\n PostOrder(left,right,root)\n");
		newTree.traversepostOrder();
		
		Node n1 = new Node();
		System.out.println("\n");
		
		n1.displayNode();
		
		
		
		
		
		
		
	}

}
