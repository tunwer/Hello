package d0615;

public class pizzamain {

	public static void main(String[] args) {
		
		pizza p1 = new pizza();
		p1.setSize(12);
		p1.setType("���۽�Ʈ��");
		
		pizza p2 = new pizza("��������");
		p2.setSize(24);
		
		pizza p3 = new pizza(12,"�Ұ��");
		
		p1.toPrint();
		p2.toPrint();
		p3.toPrint();
	}
}
