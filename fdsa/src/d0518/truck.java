package d0518;

public class truck extends car{
	int ton;
	
	void print() {
		System.out.println(carname+" "+color +" : "+ton);
	}
	
	truck (){
		System.out.println("Ʈ�� ������");
	}
	truck (String name){
		System.out.println("Ʈ�� ������" + name);
	}
	public static void main(String[] args) {
		truck ���� = new truck("����");
	}
}
