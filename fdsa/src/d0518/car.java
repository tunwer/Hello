package d0518;

public class car {
	String carname;
	String color = "������";
	int velocity;
	
	car(String name){
		System.out.println("car ������"+name);
	}
	car(){}
	
	void speedup() {
		velocity += 5;
		System.out.println(carname+"�� ����ӵ� : "+velocity);
	}
	
	void speeddown() {
		velocity -= 5;
		System.out.println(carname+"�� ����ӵ� : "+velocity);
	}
	
	void print() {
		System.out.println(carname+color);
	}

	
	
}
