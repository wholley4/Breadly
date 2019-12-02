package com.example.breadlyquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

    public class QuestionOne extends AppCompatActivity {
        // placeholder that you will be updating with the database data

        public static int tally = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.firstquestion);
            // find the screen element that you need
            TextView question = (TextView) findViewById(R.id.question);
            Button A = (Button) findViewById(R.id.A);
            Button B = (Button) findViewById(R.id.B);
            Button C = (Button) findViewById(R.id.C);
            Button D = (Button) findViewById(R.id.D);

            //set the onClick listener for the button
            A.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         tally = tally + 1;
                                         startActivity(new Intent(QuestionOne.this, QuestionTwo.class));
                                     }//end getDataFromDatabase
                                 }//end OnClickListener
            );//end loadDataButton.setOnClickListener
            B.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         tally = tally + 2;
                                         startActivity(new Intent(QuestionOne.this, QuestionTwo.class));
                                     }//end getDataFromDatabase
                                 }//end OnClickListener
            );//end loadDataButton.setOnClickListener
            C.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         tally = tally + 3;
                                         startActivity(new Intent(QuestionOne.this, QuestionTwo.class));
                                     }//end getDataFromDatabase
                                 }//end OnClickListener
            );//end loadDataButton.setOnClickListener
            D.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         tally = tally + 4;
                                         startActivity(new Intent(QuestionOne.this, QuestionTwo.class));
                                     }//end getDataFromDatabase
                                 }//end OnClickListener
            );//end loadDataButton.setOnClickListener
        }

        public static int getTally() {
            return tally;
        }
    }
