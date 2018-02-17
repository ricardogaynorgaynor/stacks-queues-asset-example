
public class Queue {
	
	Node front;
	
	public Queue() {
		front = null;
	}
	
    public boolean isEmpty() {
    	return front == null;
    }
    
    public boolean isFull() {
    	Node temp = new Node();
    	if(temp == null) {
    		return true;
    	}else {
    		temp = null;//delete temp
    		return false;
    	}
    }
    
    public void enqueue(Asset asset) {
    	if(isFull()) {
    		System.out.println("Unable to add asset,Queue is full");
    	}else {
    		Node temp = new Node(asset);
    		if(isEmpty()) {
    			front = temp;
    		}else {
    			Node current = front;
    			while(current.getLink() != null) {
    				current = current.getLink();
    			}
    			current.setLink(temp);
    		}
    	}
    }
    
    public Asset dequeue() {
    	Asset asset = null;
    	if(isEmpty()) {
    		System.out.println("Queue is empty, nothin to dequeue");
    	}else {
    		Node temp = front;
    		front = front.getLink();
    		asset = temp.getData();
    		temp = null;//delete temp
    	}
		return asset;
    }
    
    public void destroy() {
    	while(dequeue() != null);
    }

}
