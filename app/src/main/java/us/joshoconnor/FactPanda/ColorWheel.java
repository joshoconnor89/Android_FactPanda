package us.joshoconnor.FactPanda;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by joshuaoconnor on 10/13/14.
 */
public class ColorWheel {

    //Member variable (properties about the object)
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7",  // light gray
            "#996633", // brown
            "#990033",
            "#FF66CC",
            "#0033CC",
            "#009999",
            "#6600CC",
            "#006600",
            "#FF9933",
            "#669900",
            "#800000",
            "#333399",
            "#999966",
            "#0099FF",
            "#FF6666",
            "#333300",
            "#000000",
            "#CC00FF",




    };

    //Method (abilities: things the object can do, in this case, store color
    public int getColor() {



        // The button was clicked, so update the fact label with new color
        String color = "";

        // Randomly select a color
        Random randomGenerator = new Random(); //Construct a new Random number Generator
        int randomNumber = randomGenerator.nextInt(mColors.length);  //.length gives us length of array, or how many items in array


        //choose random item from color array
        color = mColors[randomNumber];
        int colorAsInt = Color.parseColor(color);

        //return the Fun Fact.  return is a keyword which means I'm done with this method, here's the keyword
        return colorAsInt;
    }

}

