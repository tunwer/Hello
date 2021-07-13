package d0615;

public class cat extends Animal{
	
	public static void main(String[] args) {
		
		Animal animal = new cat();
		animal.name = "zz";
		animal.print();
		
		cat cat = (cat)animal;
		cat.print();
		
		cat.name = "zzz";
		cat.print();
		animal.print();
		
	}
	
}
