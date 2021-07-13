package d0525;

public class ShoppingMall {
	String code;
	static int total;
	String time;
	
	ShoppingMall(){}
	void addtotal(int q) {
		total+= q;
		System.out.println("현재 재고는 " + total +"개 입니다.");
	}
	
	void subtotal(int q) {
		total-= q;
		System.out.println("현재 재고는 " + total +"개 입니다.");
	}
	
}
