package d0518;

public class leader extends student {
	
	boolean leader = false;
	
	leader(String name, String hakbun, boolean leader){
		this.name = name;
		this.hakbun = hakbun;
		this.leader = leader;
	}
	
	boolean isleader() {
		if(this.leader == true) {
			System.out.println(name + "��(��) �����Դϴ�.");
		}
		else {
			System.out.println(name + "��(��) ������ �ƴմϴ�.");
		}
		
		return this.leader;
	}
}
