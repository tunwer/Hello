package d0406;

import java.util.Scanner;

public class d04062 {
	public static void main(String[] args) {
		
		int a = 1;
		int s = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("NÀº? : ");
		int n = sc.nextInt();
		while(a <= n) {
			
			if (a % 2 == 0) {               //Â¦¼ö ´õÇÏ±â
				s += a;
				System.out.print("+" + a);
			}
			
			else {                          //È¦¼ö »©±â
				if(a == 1) {                //1ÀÏ¶§ °ýÈ£·Î ¹­±â
					System.out.print("(-" + a + ")");
					s -= a;
				}
				else {                      //1ÀÌ ¾Æ´Ò‹š ¾Õ¿¡ - Ç¥½Ã Ãß°¡
				s -= a;
				System.out.print("-" + a);
				}
			}
			a++;
		}
		System.out.print(" = " + s);
	}
}
