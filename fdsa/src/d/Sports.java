package d;
public class Sports {
	String name;
	int player;

	public Sports() {}
	public Sports(String name, int player){
		this.player = player;
		this.name = name;
	}

	public int getPlayer(){
		return player;
	}

	public String getName(){
		return name;
	}

	public void rule(){
		System.out.println(" ��� ��Ģ�� �ش� Ŭ�������� �ۼ��Ѵ�.");
	}
}