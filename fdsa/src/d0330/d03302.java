package d0330;

import java.util.Scanner;

public class d03302 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("N : ");
		n = sc.nextInt();
		int even_sum = 0, odd_sum = 0;
		for (int i = 1;i <= n; i++)
			if (i % 2 == 0) 
				even_sum += i;
			else 
				odd_sum += i;
		
		System.out.println("¦���� ��" + even_sum);
		System.out.println("Ȧ���� ��" + odd_sum);
	}

}
