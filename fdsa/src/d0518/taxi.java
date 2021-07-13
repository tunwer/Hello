package d0518;

public class taxi extends car{
	int pay = 3000;
	
	void payup() {
		pay += 100;
		System.out.println("현재 요금은 " + pay + "입니다.");
	}
	void print() {
		System.out.println(carname+", "+color+", 요금 : "+pay);
	}
}
