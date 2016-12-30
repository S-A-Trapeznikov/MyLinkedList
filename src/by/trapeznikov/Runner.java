package by.trapeznikov;

public class Runner {
	
	public static void main(String [] args){
		
		MyLinkedList<String> a =new MyLinkedList<String>();
		
		a.add("a");
		a.add("b");
		a.add("c");
		int size = a.size();
		Node node = a.getFirst();
		for(int i=0; i<size; i++){
			System.out.println(node.get());
			node = node.getNext();
		}
		
	}

}
