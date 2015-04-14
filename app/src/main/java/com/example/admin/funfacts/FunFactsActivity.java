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

    private FactBook mFactBook = new FactBook();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // create activity and hook up to main screen
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our view variables and assign view from layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener(){

            @Override
            public void onClick(View view){
                String fact = mFactBook.getFact();
                // update the label with our dynamic fact
                factLabel.setText(fact);


            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
