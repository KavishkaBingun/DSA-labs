package Tree;

public class Node {
	
	public int empNo;
	public String empName;
	public Node leftChild;
	public Node rightChild;

	public Node() {
		
	}
	
	public void displayNode() {
		System.out.println("Employee No: \t"+empNo  + "\tEmployee name : \t"+empName);
	}

}
