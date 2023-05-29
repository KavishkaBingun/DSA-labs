package LinkedList;

public class linkedList {
	
	private Link first;

	public linkedList() {
		
		first = null;
		
	}
	
	public boolean isEmpty() {
		return(first==null);
	}
	
	//insert first method
	public void insertFirst(String name, double avg) {
		
		Link newLink = new Link(name,avg);//creating a new link
		newLink.next = first;//link new link to existing link
		first = newLink;//assign new link an first
		
	}
	
	//delete first method
	public Link deleteFirst() {
		Link temp = first; //save the reference of first in to temp
		first = first.next; //change the first reference to next available link
		return temp;//return the temp link
	}
	
	public void displayList() {
		Link cur = first;
		
		while(cur != null) {
			cur.DisplayDetails();//printing the links
			cur = cur.next;//moving to next link
			
		}
	}

   public Link deleteLink(String name) {
	    Link cur = first;
	    Link previous = null;

	    if (cur == null) { // check whether the linked list is empty
	        return null;
	    }

	    while (cur != null && cur.name.equals(name)) {//delete first link if first link idate == key and cur != null
	        first = cur.next;
	        cur = first;
	    }

	    while (cur != null) {//delete middle link if first link idate == key
	        if (cur.name.equals(name)) {
	        	previous.next = cur.next;
	        }
 
	        else {
	            previous = cur;
	        }
	        cur = cur.next;
	    }

	    return cur;
	}  
}


		

	
		
	










