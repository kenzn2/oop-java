package rectangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cd, cr ;
		
		
		System.out.println("nhap chieu dai:");
		cd = sc.nextDouble();
		
		System.out.println("nhap chieu rong:");
		cr = sc.nextDouble();
		Rectangle r = new Rectangle(cd,cr);
		System.out.println("dien tich: " + r.getArea());
		System.out.println("chu vi: " + r.getPerimeter());
		
	} 

}
