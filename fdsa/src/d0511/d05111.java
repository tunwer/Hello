package d0511;

public class d05111 {
	
	d05111(String kind, String name, int age,String toy){
		this(kind,name,age);
		System.out.println(name + "는(은) " + toy + "를 좋아합니다.");
	}
	
	d05111(String kind, String name, int age){
		this.kind = kind;
		this.name = name;
		this.age = age;
		count++;
	}
	
	private String kind;
	private String name;
	private int age;
	private static int count;
	private String toy;
	
	void printcount(){
		System.out.println("현재 총" + count + "마리가 있습니다.");
		System.out.println(name);
	}
	void print(String name, int age) {
		System.out.println(name + age);
	}
	void print(String name) {
		System.out.println(kind + name + age);
	}
	
	void settoy(String toy) {
		this.toy = toy;
	}
	String gettoy() {
		return toy;
	}
	void setage(int age) {
		this.age = age;
	}
	int getage() {
		return this.age;
	}
	
}
