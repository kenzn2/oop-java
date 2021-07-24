package quanlisinhvien;

import java.util.Arrays;
import java.util.Scanner;
 
public class main {
    static Scanner sc = new Scanner(System.in);

    static void nhapThongTin(sinhvien sv) {
        System.out.println("nhap ma sv: ");
        sv.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap ho ten sv: ");
        sv.setHoten(sc.nextLine());
        System.out.println("nhap dia chi sv: ");
        sv.setDiaChi(sc.nextLine());
        do {
            System.out.println("nhap sdt ( 7 so ) : ");
            sv.setsTD(sc.nextLine());
        } while (sv.getsTD().length() != 7);
    }
 
    public static void main(String[] args) {
        sinhvien sv[] = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("=================================\n" +
            		"MENU\n"+
            		"1.nhap thong tin sinh vien.\n" +
                    "2.xuat danh sach sinh vien.\n" +
                    "nhap so bat ki de de out!\n" +
            		"=================================\n");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("nhap so luong sinh vien: ");
                    n = sc.nextInt();
                    sv = new sinhvien[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("sinh vien thu " + (i + 1)+": ");
                        sv[i] = new sinhvien();
                        nhapThongTin(sv[i]);
 
                    }
 
                    break;
                case 2:
                    sinhvien temp = sv[0];
                    for (int i = 0; i < sv.length - 1; i++) {
                        for (int j = i + 1; j < sv.length; j++) {
                            if (sv[i].getMaSV() > sv[j].getMaSV()) {
                                temp = sv[j];
                                sv[j] = sv[i];
                                sv[i] = temp;
                            }
                        }
                    }
                    System.out.printf("%-10s %-20s %-20s %-20s \n", "MSSV", "HO TEN", "DIA CHI", "SDT");
                    for (int i = 0; i < n; i++) {
                        sv[i].hienThiTT();
                    }
                    break;
                default:
                    System.out.println("OUT CHUONG TRINH!!!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}