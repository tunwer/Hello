package d0511;

import java.util.Scanner;

public class Phonemain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Phone phone1 = new Phone();
		System.out.print("폰의 가격 : ");
		phone1.price = sc.nextInt();
		System.out.print("폰의 기종 : ");
		phone1.model = sc.next();
		
		Phone phone2 = new Phone();
		System.out.print("폰의 가격 : ");
		phone2.price = sc.nextInt();
		System.out.print("폰의 기종 : ");
		phone2.model = sc.next();
		
		phone1.toPrint();
		phone2.toPrint();
		
		Phone phone3 = new Phone("S20",10);
		phone3.toPrint();
		
		phone3.printTotal();
	}

}
