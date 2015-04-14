package com.example.admin.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by admin on 4/14/15.
 */
public class ColorWheel {
    public String[] mColors = {
            "#39add1",
            "#3079ab",
            "#c25975",
            "#e15258",
            "#f9845b",
            "#838cc7",
            "#7d669e",
            "#53bbb4",
            "#51b46d",
            "#e0ab18",
            "#637a91",
            "#f092b0",
            "#b7c0c7"
    };
    // method (abilities)

    public int getColor() {


        String color = "";
        // randomly select a color
        Random randomGenerator = new Random(); // construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);


        // convert a number to a string
        color = mColors[randomNumber];

        // take a hexadecimal string and converts to numbers for Android
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
