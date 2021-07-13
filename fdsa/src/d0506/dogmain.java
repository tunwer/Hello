package d0506;

public class dogmain {
	public static void main(String[] args) {
		
		dog a = new dog();
		a.breed = "골든리트리버";
		a.age = 3;
		a.color = "brown";
		
		a.barking();
		a.sleeping();
		a.hungry();
		
		dog b = new dog("푸들",2,"white");
		
		b.barking();
		b.sleeping();
		b.hungry();
		
		String str = b.toPrint("말티즈", 3, "white");
		System.out.println(str);
	}
}
