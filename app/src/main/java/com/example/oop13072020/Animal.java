package com.example.oop13072020;

import android.util.Log;

public class Animal {
    String category;
    int height;
    int weight;

    public void eat(Food food){
        switch (food){
            case MEAT:
                Log.d("BBB","predator");
                break;
            case GRASS:
                Log.d("BBB","herbivore");
                break;
        }
    }
}
