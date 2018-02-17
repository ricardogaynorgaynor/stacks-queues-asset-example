
public class Asset {
	private int id;
	private String name;
	private float value;

	public Asset(int id, String name, float value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}

	public Asset() {
		this(0, "", 0.0f);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Asset [id=" + id + ", name=" + name + ", value=" + value + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}

}
