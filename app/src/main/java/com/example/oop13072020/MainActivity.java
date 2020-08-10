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
//        Sinhvien sinhVienA = new Sinhvien("Nguyen Van A" , 20 , "Quan 1");
//        Log.d("BBB",sinhVienA.getTen());

//        Animal dog = new Animal();
//        dog.category = "Chó";
//        dog.height = 50;
//        dog.weight = 3;
//
//        dog.eat(Food.MEAT);
        Dog kiki = new Dog();
        kiki.category = "Chó việt nam";
        kiki.height = 50;
        kiki.weight = 3;
        kiki.setSpeed(5);
        kiki.eat(Food.MEAT);
    }
}