package d0506;

public class student {
	
	student(){
		count++;
	}
	
	static int count = 0;
	static String school = "Robot";
	String name ;
	int grade;
	
	void print() {
		System.out.println(count + "��° �л� "+ school+", "+ name + " , " + grade + "�г�");
	}
}
