package com.ra.btvn;

import java.util.Scanner;

public class HinhCN {
    // thuộc tính
    private float chieuDai;
    private float chieuRong;

    public HinhCN() {
    }

    public HinhCN(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    // phương thức inputdata
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào chiều dài");
        chieuDai = Float.parseFloat(sc.nextLine());
        System.out.println("Mời nhập vào chiều rộng");
        chieuRong = Float.parseFloat(sc.nextLine());
    }
    // phương thức tính dieen tich
    public void dienTich(){
        float dienTich = chieuDai * chieuRong;
        System.out.println("Dien tic hinh chu nhat la : "+dienTich);
    }
    // phuonwg thuc tinh chu vi
    public void  chuVi(){
        float chuVi = (chieuDai + chieuRong) * 2;
        System.out.println("Chu vi hinh chu nhat la "+chuVi);
    }
}
