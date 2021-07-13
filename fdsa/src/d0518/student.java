package d0518;

public class student {
	student(){}     
	student(String hakbun , String name, int age, String phone){
		this.hakbun = hakbun;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	String hakbun;
	String name;
	int age;
	String phone;
	
	

	void printStudent() {
		System.out.println(name + "," + hakbun + "," + phone);
	}
}
