package Tree;

public class Tree {
	
	private Node root;

	public Tree() {
		
		root = null;
		
	}
	
	public void insertNode(int eNo, String eName) {
		//cretae a new Node
		Node newNode = new Node();
		newNode.empNo = eNo;
		newNode.empName = eName;
		
		//if there is no any node in tree
		if(root == null) {
			//insert newNode as root
			root = newNode;
		}
		else {//if there is a tree with nodes
			Node cur = root;
			Node parent;
			
			while(true) {
				parent = cur;
			
				
				if(eNo<cur.empNo) {//insert as a left child
					cur = cur.leftChild;
					
					if(cur==null) {
						parent.leftChild = newNode;
						break; // exit the loop when the new node is inserted
					}
				}
				else {//insert as a right child
					cur = cur.rightChild;
					if(cur==null) {
						parent.rightChild = newNode;
						break; // exit the loop when the new node is inserted
						
					}
				}
			}
			
		}
		
		
	}
	
	public void inOrder(Node localRoot) {//left,root,right
		if(localRoot!=null) {
			inOrder(localRoot.leftChild);//left
			localRoot.displayNode();//root
			inOrder(localRoot.rightChild);//right
		}
	}
	
	public void traverseinOrder() {
		inOrder(root);
	}
	
	public void preOrder(Node localRoot) {//root,left,right
		if(localRoot != null) {
			localRoot.displayNode();//root
			preOrder(localRoot.leftChild);//left
			preOrder(localRoot.rightChild);//right
		}
	}
	
	public void traversepreOrder() {
		preOrder(root);
	}
	
	public void postOrder(Node localRoot) {//left, right, root
		preOrder(localRoot.leftChild);//left
		preOrder(localRoot.rightChild);//right
		localRoot.displayNode();//root
		
	}
	public void traversepostOrder() {
		postOrder(root);
	}
	//searches for a node in a binary tree based on an employee number (empNo)
	public Node findRecursive(Node localRoot,int empNo) {//localRoot - current node being processed
		
		if(localRoot == null ) {//reached the end of the tree without finding the desired node
			return null;
		}
		//checks if the employee number of the current node (localRoot.empNo) matches the desired empNo
		else if(localRoot.empNo == empNo ) {
			//prints the employee's name (localRoot.empName) and returns the current node (localRoot)
			    System.out.println(localRoot.empName);
				return localRoot;
				
		}
		 //desired empNo is less than the employee number of the current node
		else if(empNo<localRoot.empNo ) {
			/* the method calls itself recursively, passing the left child of the current node (localRoot.leftChild) 
			 as the new localRoot, and empNo remains the same.*/
			 
			return findRecursive(localRoot.leftChild,empNo);

		}
		//desired empNo is greater than the employee number of the current node
		else {
			return findRecursive(localRoot.rightChild,empNo);
			
		}
	
}
	//call the findRecursive
	public Node callRecursive(int eNo) {
		
		return findRecursive(root,eNo);
		
		
	}
	
	public Node find(int empNo) {
		
		Node cur = root;
		//this loop occurs until desired empNo get equals to current empNO
		while(cur.empNo != empNo ) {
			if(empNo<cur.empNo) {
				cur = cur.leftChild;
			}
			else {
				cur = cur.rightChild;
			}
			if(cur == null) {
				System.out.println("The employee tree is null");
			}
		}
		//if desired empNo found, print the empName of that empNo
		System.out.print("Employee Name : " + cur.empName);
		return cur;
		
	}
	
	public void deleteAll() {//when deletinh whole tree, the root becomes null
		root = null;
	}
}
