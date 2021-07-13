package d0330;

public class d03303 {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,3,4,5};
		for(int i : a)
			System.out.println(i);
		
		float b[] = new float[] {2.1f,3.5f,4.2f};
		float sum = 0;
		for (float val : b) {
			System.out.println(val);
			sum  += val;
		}
		System.out.println("SUM : "+sum);	
		
		
		
		
		String []c = {"seoul","robot","high","school"};
		for (String str : c) {
			str = "TTTTTTTTTTTTT";
			System.out.println(str);
		}
		
		for (String st : c){
			System.out.println(st);
		}
	}

}
