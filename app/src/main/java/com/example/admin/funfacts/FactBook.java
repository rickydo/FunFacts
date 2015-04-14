package com.example.admin.funfacts;

import java.util.Random;

/**
 * Created by admin on 4/14/15.
 */
public class FactBook {
    // member variable (properties about the object)
    public String[] mFacts = {
            "Children tend to grow faster in the spring",
            "Christopher Columbus brought the first lemon seeds to America",
            "To remove crayon marks from walls, use a hairdryer to heat the wax.",
            "The roadrunner chases after its prey at a blurring speed of up to 25 mph.",
            "Borborygmi is the noise that your stomach makes when you are hungry.",
            "Mongolians invented lemonade around 1299 A.D.",
            "The largest cheesecake ever made weighed 57,508lbs.",
            "Pistol shrimp can make a noise loud enough to break glass.",
            "Bamboo can grow three feet in one day.",
            "Wrapping rubber bands around the ends of hangers can prevent clothes from slipping off.",
            "A strawberry is not an actual berry, but a banana is.",
            "Caterpillars have over 2,000 muscles.",
            "There are more saunas than cars in Finland.",
            "In Germany, the shhh sound literally means hurry up.",
            "Penguins can jump up to 6 feet.",
            "After working out, it takes 5 hours for you body temperature to return to normal."
    };
    // method (abilities)

    public String getFact() {


        String fact = "";
        // randomly select a fact
        Random randomGenerator = new Random(); // construct a new random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);


        // convert a number to a string
        fact = mFacts[randomNumber];

        return fact;
    }
}
