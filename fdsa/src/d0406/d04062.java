package d0406;

import java.util.Scanner;

public class d04062 {
	public static void main(String[] args) {
		
		int a = 1;
		int s = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N��? : ");
		int n = sc.nextInt();
		while(a <= n) {
			
			if (a % 2 == 0) {               //¦�� ���ϱ�
				s += a;
				System.out.print("+" + a);
			}
			
			else {                          //Ȧ�� ����
				if(a == 1) {                //1�϶� ��ȣ�� ����
					System.out.print("(-" + a + ")");
					s -= a;
				}
				else {                      //1�� �ƴҋ� �տ� - ǥ�� �߰�
				s -= a;
				System.out.print("-" + a);
				}
			}
			a++;
		}
		System.out.print(" = " + s);
	}
}
