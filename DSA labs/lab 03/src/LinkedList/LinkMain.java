package LinkedList;

public class LinkMain {



	public static void main(String[] args) {
		
		Link Nipuna = new Link("Nipuna",53.5);
		Link Aravinda = new Link("Aravinda",78.0);
		Link Prashani = new Link("Prashani",69.5);
		
		Nipuna.next = Aravinda;
		Aravinda.next = Prashani;
		Prashani.next = null;
		
		Nipuna.DisplayDetails();
		Aravinda.DisplayDetails();
		Prashani.DisplayDetails();
		

	}

}
