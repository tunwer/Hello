package d0525;

class fatherclass {
	
	String name;
	//fatherclass(){}
	fatherclass(String name){
		this.name = name;
		System.out.println("Father ������ " + this.name);
	}
}


public class myclass extends fatherclass{
	
	myclass(String name){
		super(name);
		System.out.println("myclass ������ " + super.name);
	}
	
	public static void main(String[] args) {
		
		myclass a = new myclass("ȫ�浿");
		
	}
}
