package d0518;

public class taxi extends car{
	int pay = 3000;
	
	void payup() {
		pay += 100;
		System.out.println("���� ����� " + pay + "�Դϴ�.");
	}
	void print() {
		System.out.println(carname+", "+color+", ��� : "+pay);
	}
}
