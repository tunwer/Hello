package d0518;

public class leadermain {
	public static void main(String[] args) {
		leader leader1 = new leader("�輺��","20505",true);
		leader1.isleader();
		
		leader leader2 = new leader("fdsa","30509",false);
		leader1.isleader();
		
		leader1.printStudent();
		leader2.printStudent();
	}
}
