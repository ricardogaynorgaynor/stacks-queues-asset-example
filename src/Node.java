
public class Node{
	private Asset data;
	private Node link;
	
	public Node() {
		this(null);
	}
	
	public Node(Asset data) {
		this(data,null);
	}
	public Node(Asset data, Node link) {
		super();
		this.data = data;
		this.link = link;
	}
	public Asset getData() {
		return data;
	}
	public void setData(Asset data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", link=" + link + "]";
	}
	
	
	
	

}
