package d0506;

public class d05061 {
	public static void main(String[] args) {
		
		student a = new student();
		a.grade = 1;
		a.name = "Kim";
		a.print();
		
		student b = new student();
		b.grade = 2;
		b.name = "Lee";
		b.school = "서울고";
		b.print();
		
		student c = new student();
		c.grade = 3;
		c.name = "Hong";
		c.school = "중동고";
		c.print();
		
		a.print();
		b.print();
		c.print();
	}
}
