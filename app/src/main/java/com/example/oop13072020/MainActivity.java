package com.example.oop13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Object : cá thể
        // Class : tập thể


        // Tạo 1 cá thể từ tập thể Sinhvien
//        Sinhvien sinhVienA = new Sinhvien("Nguyen Van A" , 20 , "Quan 1");
//        Log.d("BBB",sinhVienA.getTen());

//        Animal dog = new Animal();
//        dog.category = "Chó";
//        dog.height = 50;
//        dog.weight = 3;
//
//        dog.eat(Food.MEAT);
//        Dog kiki = new Dog("Chó việt nam",50,3,"5","Nâu");
//
//        kiki.eat(Food.MEAT);
        showToast(R.id.bottom);
    }
    // Override : ghi đè
//        + Ngữ cảnh : Khi sử dụng kế thừa
//        + Cách nhận biết
//            - Có annotation @Override
//            - Phương thức lop cha dinh nghia va lop con goi lai de thay doi
    // OverLoad : nạp chồng
    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void showToast(Integer resId){
        Toast.makeText(this, resId.toString(), Toast.LENGTH_SHORT).show();
    }
}