package d;

public class baseball extends Sports{
	baseball(String name, int player){
		super(name,player);
	}
	public void rule(){
		System.out.println("야구는 9이닝 동안 진행된다");
	}
	public static void main(String[] args) {
		
		baseball b1 = new baseball("야구",9);
		System.out.println("경기 종목 : " + b1.getName());
		System.out.println("선수 인원 : " + b1.getPlayer());
		System.out.print("경기 규칙 : ");
		b1.rule();
		b1.rule();
		
	}
}
