package d0506;

public class dogmain {
	public static void main(String[] args) {
		
		dog a = new dog();
		a.breed = "��縮Ʈ����";
		a.age = 3;
		a.color = "brown";
		
		a.barking();
		a.sleeping();
		a.hungry();
		
		dog b = new dog("Ǫ��",2,"white");
		
		b.barking();
		b.sleeping();
		b.hungry();
		
		String str = b.toPrint("��Ƽ��", 3, "white");
		System.out.println(str);
	}
}
