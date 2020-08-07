package com.example.oop13072020;

public class Sinhvien {
    // Thuộc tính
    private String ten;
    private int tuoi;
    private String quequan;


    // Phương thức
    public void setTen(String ten){
        if (!ten.isEmpty()){
           this.ten = ten;
        }
    }
    public String getTen(){
        return ten;
    }
}
