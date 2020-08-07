package com.example.oop13072020;

public class Sinhvien {
    // Thuộc tính
    private String ten;
    private int tuoi;
    private String quequan;


    // Phương thức
//    public void setTen(String ten){
//        if (!ten.isEmpty()){
//           this.ten = ten;
//        }
//    }
//    public String getTen(){
//        return ten;
//    }
    // alt + insert
    // constructor : Phương thức khởi tạo
    public Sinhvien(String ten,int tuoi , String quequan){
        this.ten = ten;
        this.tuoi = tuoi;
        this.quequan = quequan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        if (!ten.isEmpty()){
            this.ten = ten;
        }
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
}
