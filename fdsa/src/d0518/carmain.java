package d0518;

public class carmain {
	public static void main(String[] args) {
		
		car car1 = new car();
		car1.carname = "sonata";
		car1.speedup();
		car1.speedup();
		
		car1.speeddown();
		
		
		truck t1 = new truck();
		t1.carname = "����";
		t1.speedup();
		t1.speeddown();
		t1.ton = 3;
		
		car1.print();
		t1.color = "�Ķ���";
		t1.print();
		
		System.out.println(" ----------------------------------- ");
		taxi ta1 = new taxi();
		ta1.carname = "�����ý�";
		ta1.payup();
		ta1.payup();
		ta1.payup();
		ta1.payup();
		ta1.payup();
		ta1.print();
	}

}
