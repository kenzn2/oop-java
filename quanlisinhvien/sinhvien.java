package quanlisinhvien;

import java.util.Scanner;
 
public class sinhvien {
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String sTD;
 

    public sinhvien() {
 
    }

    public sinhvien(int maSV, String hoten, String diaChi, String sTD) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sTD = sTD;
    }

    public int getMaSV() {
        return maSV;
    }
 
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
 
    public String getHoten() {
        return hoTen;
    }
 
    public void setHoten(String hoten) {
        this.hoTen = hoten;
    }
 
    public String getDiaChi() {
        return diaChi;
    }
 
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
 
    public String getsTD() {
        return sTD;
    }
 
    public void setsTD(String sTD) {
        this.sTD = sTD;
    }

    public String toString() {
        return "sinhvien{" +
                "maSV=" + maSV +
                ", hoten='" + hoTen + 
                ", diaChi='" + diaChi + 
                ", sTD='" + sTD + 
                '}';
    }
    //xuat ds sv
    public void hienThiTT() {
        System.out.printf("%-10d %-20s %-20s %-20s \n", maSV, hoTen, diaChi, sTD);
    }
}