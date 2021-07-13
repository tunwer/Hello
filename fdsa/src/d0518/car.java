package d0518;

public class car {
	String carname;
	String color = "검정색";
	int velocity;
	
	car(String name){
		System.out.println("car 생성자"+name);
	}
	car(){}
	
	void speedup() {
		velocity += 5;
		System.out.println(carname+"의 현재속도 : "+velocity);
	}
	
	void speeddown() {
		velocity -= 5;
		System.out.println(carname+"의 현재속도 : "+velocity);
	}
	
	void print() {
		System.out.println(carname+color);
	}

	
	
}
