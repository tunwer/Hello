package d0511;

import java.util.Scanner;

public class d05112 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String kind;
		String name;
		int age;
		String toy;
		
		System.out.print("���� ���� : ");
		kind = sc.next();
		System.out.print("���� �̸� : ");
		name = sc.next();
		System.out.print("���� ���� : ");
		age = sc.nextInt();
		
		d05111 animal1 = new d05111(kind,name,age);
		animal1.printcount();
		animal1.print(name);
		animal1.print(name, age);
		
		System.out.print("���� ���� : ");
		kind = sc.next();
		System.out.print("���� �̸� : ");
		name = sc.next();
		System.out.print("���� ���� : ");
		age = sc.nextInt();
		System.out.print("�峭�� : ");
		toy = sc.next();
		
		d05111 animal2 = new d05111(kind,name,age,toy);
		animal2.printcount();
	}

}
