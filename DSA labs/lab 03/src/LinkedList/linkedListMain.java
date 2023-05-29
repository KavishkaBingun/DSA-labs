package LinkedList;

public class linkedListMain {
	
	public static void main(String[] args) {
		
		linkedList studentList = new linkedList();
		
		studentList.insertFirst("Nipuna",53.5);
		studentList.insertFirst("Aravinda",78.0);
        studentList.insertFirst("Prashani",69.5);
        studentList.insertFirst("Aravinda",78.0);
        studentList.insertFirst("Prashani",69.5);
     
        
        studentList.displayList();
        
        studentList.deleteLink("Aravinda");
        
        System.out.println();
        
        System.out.println("---------------deleted--------------");
        
        System.out.println();
        
        studentList.displayList();
        
        

		

	}

}
