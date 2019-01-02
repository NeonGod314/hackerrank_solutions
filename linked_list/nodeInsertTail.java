import java.util.Scanner;

class node{
	protected int data = 0;
	protected node next = null;
	public node(int data){
		this.data = data;
		this.next = null; 
	}
}

class linkedList{
	Scanner in = new Scanner(System.in);
	protected node start;
	protected node end;
	public int size;

	protected linkedList(){
		this.start = null;
		this.end = null;
		this.size = 0;
	}
	private boolean isEmpty(){
		return start == null;
	}
	protected void insertNodeEnd(int data){
		node noode = new node(data);
		if(this.start == null){
			this.start = noode;
			this.end = noode;
			this.size = 1;	
		}
		else{
			this.end.next = noode;
			this.end = noode;
			this.size = this.size + 1; 
		}
	}
	private void printInfo(){
		System.out.println("start node: "+this.start.data);
		System.out.println("end node: "+this.end.data);
	}
	protected void printLL(){
		node currentNode= this.start; 
		for(int i=0; i<this.size;i++){
			System.out.println(currentNode.data);
			currentNode = currentNode.next;
		}
	}

	protected void cycleDetection(){
		node slow_pointer = this.start;
		node fast_pointer = this.start;
		boolean x = true;
		while(true){
			System.out.println("fast_pointer: "+fast_pointer.data);
			System.out.println("slow_pointer: "+slow_pointer.data);
			in.nextInt();
			fast_pointer = fast_pointer.next;
			if (x == false){
				slow_pointer = slow_pointer.next;
			}
			if (slow_pointer.data == fast_pointer.data){
				System.out.println("Cycle detected");
				break;
			}
			if (fast_pointer.next == null){
				System.out.println("no cycle detected");
				break;
			}
			x = !x;	
			System.out.println("x: "+x);

		}
	}
	
}

public class nodeInsertTail{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		linkedList ll = new linkedList();  
		int size = in.nextInt();
		for(int i= 0; i<size; i++){
			ll.insertNodeEnd(in.nextInt());
		}
		ll.printLL();
		ll.end.next = ll.start.next.next;
		ll.cycleDetection();
	}
}