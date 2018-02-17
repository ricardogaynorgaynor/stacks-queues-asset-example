
public class Driver {

	public static void main(String[] args) {
       runStackExample();
       runQueueExample();
       
	}
	
	public static void runQueueExample() {
		System.out.println("Queue Example");
		final int AMOUNT = 3;
		Asset[] assets = new Asset[AMOUNT];
		for(int i=1;i<=AMOUNT;i++) {
			assets[i-1]=new Asset(i,"Asset "+i,i*300);
		}
		
		Queue queue = new Queue();//create a Queue
		for(int i=0;i<AMOUNT;i++) {
			queue.enqueue(assets[i]); //enqueue an element onto Queue
			System.out.println("enqueue: ");
			assets[i].display();
		}
		

		Asset temp=null;
		for(int i=0;i<AMOUNT+1;i++) {
			temp = queue.dequeue();
			if(temp == null) {
				System.out.println("Did not dequeue an asset from the Queue");
			}else {
				System.out.println("dequeue : ");
				temp.display();
			}
		}
		
		queue.destroy();
		
		
		
		
	}
	
	public static void runStackExample() {
		System.out.println("Stack Example");
		final int AMOUNT = 3;
		Asset[] assets = new Asset[AMOUNT];
		for(int i=1;i<=AMOUNT;i++) {
			assets[i-1]=new Asset(i,"Asset "+i,i*300);
		}
		
		Stack stack = new Stack();//create a stack
		for(int i=0;i<AMOUNT;i++) {
			stack.push(assets[i]); //push an element onto stack
			System.out.println("Pushed ");
			assets[i].display();
		}
		
		Node top = stack.getTop();
		if(top == null) {
			System.out.println("No elements in stack");
		}else {
			System.out.println("Top of stack: ");
			top.getData().display();
		}
		Asset temp=null;
		for(int i=0;i<AMOUNT+1;i++) {
			temp = stack.pop();
			if(temp == null) {
				System.out.println("Did not pop an asset from the stack");
			}else {
				System.out.println("Popped : ");
				temp.display();
			}
		}
		
		
		
		
	}

}
