package com.example.admin.funfacts;

import android.app.Activity;
//import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;


public class FunFactsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign view from layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String[] facts = {
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
                // the button was clicked so update the fact label with a new fact
                String fact = "";
                // randomly select a fact
                Random randomGenerator = new Random(); // construct a new random number generator
                int randomNumber = randomGenerator.nextInt(facts.length);


                // convert a number to a string
                fact = facts[randomNumber];
                // update the label with our dynamic fact
                factLabel.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
