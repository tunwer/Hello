package d0615;

public class pizza {

	private int size;
	private String type;
	
	pizza(){}
	pizza(String type){
		this.type = type;
	}
	pizza(int size,String type){
		this(type);
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	void toPrint() {
		System.out.println("����:" + type + " ũ��:" + size);
	}
}
