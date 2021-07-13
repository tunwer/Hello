package d0406;

public class d04064 {
	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "Java";

		
		if (str1 == str2)
			System.out.println("주소가 동일하다");
		else
			System.out.println("주소가 동일하지 않다");
		
		if (str1.equals(str2))
			System.out.println("값이 동일하다");
		else
			System.out.println("값이 동일하지 않다");
		
		String str3 = new String("java");
		String str4 = new String("java");
		
		if (str3 == str4)
			System.out.println("주소가 동일하다");
		else
			System.out.println("주소가 동일하지 않다");
		
		if (str3.equals(str4))
			System.out.println("값이 동일하다");
		else
			System.out.println("값이 동일하지 않다");
	}
}
