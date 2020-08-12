package com.example.oop13072020;

import android.util.Log;

public class Dog extends Animal{
    String backgroundColor;
    String speed;

    // primary constructor
    public Dog(String category, int height, int weight){
        super(category,height,weight);
    }

    //secondary constructor
    public Dog(String category, int height, int weight,String speed , String backgroundColor){
        super(category,height,weight);
        this.backgroundColor = backgroundColor;
        this.speed = speed;
    }

    public void setSpeed(Integer speed){
        this.speed = speed+"km/h";
    }

    @Override
    public void eat(Food food) {
        switch (food){
            case MEAT:
                Log.d("BBB","Loài chó ăn thịt");
                break;
            case GRASS:
                Log.d("BBB","Loài chó ăn chay");
                break;
        }
    }
}
