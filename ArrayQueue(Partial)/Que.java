package Arrayqueue;

public class Que {
	int QSIZE;
	private int[]queue;
	private int nItems;

	public Que(int size){
		this.QSIZE= size;
		this.queue = new int[this.QSIZE];
	}

	public Que() {
		// TODO Auto-generated constructor stub
	}

	public void showQueue(){
			for (int i=0; i< this.QSIZE;i++){
			System.out.println("QUEUE["+i+"] = " + this);
		}
	}

	public boolean isFull() {
			if (this.nItems == this.QSIZE) {
				System.out.println ("The Queue is already full");
				return true;
			} else{
				return false;
			}}
			
	public boolean isEmpty() {
			if (this.nItems == 0){
				System.out.println ("The Queue is Empty");
				return true;
			}	else{
				return false;
			}}

	public boolean enqueue (int num) {
			System.out.println("Trying to enqueue" + num + "...");
			if (!this.isFull()){
				this.queue[nItems] = num;
				System.out.println("\t" + "Added" + num);
				this.nItems++;
					return true;
			}	else{
				return false;
			}}

	public int dequeue(int num) {
			System.out.println("Trying to dequeue" + num + "...");
			{ if (!this.isEmpty())
					this.queue[nItems-1]=num;
					System.out.println ("\t" + "Deleted" + num);
					this.nItems--;
					return num;
				}}

	public int peekFront() {
			return this.queue[0];
	}
	public int peekRear() {
			return this.queue[this.nItems-1];
	}

	public static void main(String[]args){
		
		Que queueDemo = new Que();
		  queueDemo.enqueue(1);
		  queueDemo.dequeue(2);
		  queueDemo.dequeue(3);
		  queueDemo.enqueue (4);
		  
	}
}
