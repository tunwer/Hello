package d0525;

public class ShoppingMall {
	String code;
	static int total;
	String time;
	
	ShoppingMall(){}
	void addtotal(int q) {
		total+= q;
		System.out.println("���� ���� " + total +"�� �Դϴ�.");
	}
	
	void subtotal(int q) {
		total-= q;
		System.out.println("���� ���� " + total +"�� �Դϴ�.");
	}
	
}
