package d0330;

import java.util.Scanner;

public class d03301 {

	public static void main(String[] args) {
		
		int a,b;
		String o;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			a = sc.nextInt();
			if(a==0) break;
			
			System.out.print("숫자 : ");
			b = sc.nextInt();
			if(b==0) break;
			
			System.out.print("연산자 : ");
			o = sc.next();
		
			if(o.equals("+"))
				System.out.print(a + "+" + b + "=" + (a+b) );
			else if(o.equals("-"))
				System.out.print(a + "-" + b + "=" + (a-b) );
			else if(o.equals("*"))
				System.out.print(a + "*" + b + "=" + (a*b) );
			else if(o.equals("/"))
				System.out.print(a + "/" + b + "=" + (a/b) );
			
		}
	}

}
