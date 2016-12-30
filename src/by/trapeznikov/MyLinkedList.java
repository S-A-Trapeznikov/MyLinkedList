package by.trapeznikov;

public class MyLinkedList<T> {
	
	private Node node;
	private Node first;
	private int size;
	
	public MyLinkedList(){
		this.node = new Node();
		this.first = null;
		this.size = 0;
	}
	
	public void add(T t){
		
		if (this.first!=null){node = node.getNext();
							  Node next = new Node();
							  node.set(t, next);
		}
			
		if (this.first==null){	Node next = new Node();
								node = new Node(t, next);
								this.first = node;
		}
		size++;
	}
	
	public Object get(){
		return this.node.get();
	}
	
	public Node getFirst(){
		return this.first;
	}
	
	public int size(){
		return this.size;
	}
	
}
