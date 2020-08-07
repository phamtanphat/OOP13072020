package com.example.oop13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Object : cá thể
        // Class : tập thể


        // Tạo 1 cá thể từ tập thể Sinhvien
        Sinhvien sinhVienA = new Sinhvien();
        sinhVienA.setTen("Nguyen Van A");
        Log.d("BBB",sinhVienA.getTen());
    }
}