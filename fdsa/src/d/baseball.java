package d;

public class baseball extends Sports{
	baseball(String name, int player){
		super(name,player);
	}
	public void rule(){
		System.out.println("�߱��� 9�̴� ���� ����ȴ�");
	}
	public static void main(String[] args) {
		
		baseball b1 = new baseball("�߱�",9);
		System.out.println("��� ���� : " + b1.getName());
		System.out.println("���� �ο� : " + b1.getPlayer());
		System.out.print("��� ��Ģ : ");
		b1.rule();
		b1.rule();
		
	}
}
