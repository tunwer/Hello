package d0615;

public class pizzamain {

	public static void main(String[] args) {
		
		pizza p1 = new pizza();
		p1.setSize(12);
		p1.setType("슈퍼스트링");
		
		pizza p2 = new pizza("포테이토");
		p2.setSize(24);
		
		pizza p3 = new pizza(12,"불고기");
		
		p1.toPrint();
		p2.toPrint();
		p3.toPrint();
	}
}
