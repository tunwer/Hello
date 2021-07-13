package d0511;

public class Phone {
	String model;
	int price;
	static int total;
	
	Phone(){
		total++;
	}
	Phone (String model,int price){
		this();
		this.model = model;
		this.price = price;
	}
	
	void toPrint() {
		System.out.println(price + "만원 짜리 " + model+ " 스마트폰");
	}
	void printTotal() {
		System.out.println("총 "+ total+"대의 스마트폰을 가지고있습니다");
	}
}
