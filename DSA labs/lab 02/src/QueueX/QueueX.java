package QueueX;

public class QueueX {
	
	private int[]queArray;
	private int maxSize;
	private int rear;
	private int front;
	private int nItems;
	
	//constructor
	public QueueX(int s) {
		this.maxSize = s;
		this.queArray = new int[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	//checking queue is full
	public boolean isFull() {
		return(rear==(maxSize-1));
	}
	//checking queue is empty
	public boolean isEmpty() {
		return(nItems==0);
	}
	//isert method
	public void insert(int j) {
		if(!isFull()) {
			rear++;
			queArray[rear] = j;
			nItems++;
		}
		else {
			System.out.println("Queue is already full");
		}
	}
	//remove method
	public int remove() {
		if(!isEmpty()) {
			nItems--;
			return queArray[front++];
			
			
			
		}
		else {
			System.out.println("Queue is already empty");
			return -99;
		}
	
	
	}

}
