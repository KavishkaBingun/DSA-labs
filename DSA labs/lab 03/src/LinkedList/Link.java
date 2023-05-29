package LinkedList;

public class Link {
	
	public String name;
	private double avg;
	public Link next;

	public Link(String name, double avg) {
		
		this.name=name;
		this.avg=avg;
		this.next=null;
		
	}
	
	public void DisplayDetails() {
		System.out.println("Name : \t" + name + "\tAverage : \t"+avg);
	}



}
