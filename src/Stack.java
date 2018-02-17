
public class Stack {
	
	private Node top;
	
	public Stack() {
		top = null;
	}
	
	public boolean isEmpty(){
		if(top==null) 
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		Node temp=new Node();
		if(temp==null) {
			return true;
		}else {
			temp=null;//delete temp
			return false;
		}
	}
	
	public Node getTop() {
		return top;
	}
	
	public void push(Asset asset) {
		if(isFull()) {
			System.out.println("Unable to push asset, stack is full.");
		}else {
			Node temp = new Node(asset);
			if(isEmpty()) {
				top = temp;
			}else {
				temp.setLink(top);
				top = temp;
			}
		}
	}
	
	public Asset pop() {
	   Asset asset = null;
	   if(isEmpty()) {
		   System.out.println("Stack is empty, nothing to pop");
	   }else {
		   Node temp = top;
		   top = top.getLink();
		   asset = temp.getData();
		   temp=null;//delete temp;
	   }
	   return asset;
	}
	
	void destroy() {
		while(pop()!=null);
	}


}
