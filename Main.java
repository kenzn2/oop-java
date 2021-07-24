package songuyento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int a;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("nhap so can kiem tra ");
		 a = sc.nextInt();
		 Songuyento snt = new Songuyento(a);
		 
		 if(snt.checksnt(a)==true)
			{
				System.out.printf(a+ " la so nguyen to");
				System.out.println("\nsnt tiep theo la: "+snt.nextSonguyento());
			}
			else {System.out.println(a + " khong la so nguyen to");}
	}

}
