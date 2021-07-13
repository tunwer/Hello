package d0518;

public class truck extends car{
	int ton;
	
	void print() {
		System.out.println(carname+" "+color +" : "+ton);
	}
	
	truck (){
		System.out.println("트럭 생성자");
	}
	truck (String name){
		System.out.println("트럭 생성자" + name);
	}
	public static void main(String[] args) {
		truck 봉고 = new truck("봉고");
	}
}
