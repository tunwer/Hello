package d0406;

public class d04064 {
	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "Java";

		
		if (str1 == str2)
			System.out.println("�ּҰ� �����ϴ�");
		else
			System.out.println("�ּҰ� �������� �ʴ�");
		
		if (str1.equals(str2))
			System.out.println("���� �����ϴ�");
		else
			System.out.println("���� �������� �ʴ�");
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		if (str3 == str4)
			System.out.println("�ּҰ� �����ϴ�");
		else
			System.out.println("�ּҰ� �������� �ʴ�");
		
		if (str3.equals(str4))
			System.out.println("���� �����ϴ�");
		else
			System.out.println("���� �������� �ʴ�");
	}
}
