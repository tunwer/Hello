package d0615;

public class Animal {
	// �����ϴ� ������ Ű��� Ŭ����

	//������ - �����ε�---------------------------
	Animal(){}
	
	Animal(String kind, String name, int age , String toy){
		this(kind, name, age);
		System.out.println(name + toy + "�� �����մϴ�.");		
	}
		
	Animal( String kind, String name, int age   ){
		this.kind = kind ;
		this.name = name ; 
		this.age = age;
		count++;
	}
	
	//��� ����-----------------------------------
	private String kind ; 	//��, �����, �ܽ���
	String name ;   //�ǻ�
	private int age ; 
	private static int count;  // ���� ���� - ���� 
	private String toy;
	
	
	//�޼ҵ�---------------------------------------
	//��� ��� �ִ��� ī��Ʈ
	static void printCount() {
		System.out.println("���� �� " + count + "������ �ֽ��ϴ�.");
	}
	
	//������ �̸��� ���̸� ��� - �����ε�
	void print(String name, int age) {
		System.out.println(name  + age);
	}
	
	//������ ǰ���� ���̿� �̸��� ��� - �����ε�
	void print(String name) {
		System.out.println(kind + name + age  );
	}
	
	void print() {
		System.out.println("�� ������ �̸���" + name );
	}
	//private ������ ����� �� �ִ� ��ΰ� �Ǵ� �޼ҵ�
	// set : � ���� �����Ҷ�
	// get : � ���� �ҷ��Ë�
	
	void setToy(String toy) {
		this.toy = toy;
	}
	
	String getToy() {
		return toy;		
	}
	
	//������ ���̸� �����ϴ� �޼ҵ�
	void setAge(int age) {
		this.age = age;
	}
	
	//������ ���̸� �˷��ִ� �޼ҵ�
	int getAge() {
		return this.age;		
	}
	
	void toPrint() {
		System.out.println("�� ������ �̸��� " + name);
	}
	
	
}




















