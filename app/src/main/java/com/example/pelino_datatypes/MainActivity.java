package com.example.pelino_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displaytxt);

        String FirstName = "Alexia Kathleen";
        char middleInitial = 'J';
        String lastname = "Pelino";
        int myAge = 18;
        float myDreamTVLGrade = 100.0f;
        double myMoney = 100000;

        display.setText("My name is " + FirstName + " " + String.valueOf(middleInitial) + " " + lastname + ".\nMy age is also " + myAge + " " + "and my dream TVL grade is " + myDreamTVLGrade +
                ".\nI wish to earn " + myMoney + "php someday.");


    }
}