package com.example.breadlyquiz;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class Result extends Activity {
        // placeholder that you will be updating with the database data
        @Override
        protected void onCreate(Bundle savedInstanceState) {

            int finaltally = QuestionFour.getTally();
            String finalbread = "Hardtack";

            if (finaltally > 6)
                finalbread = "Hardtack";


            if (finaltally >=6 && finaltally <= 9 ) {
                finalbread = "Ciabatta";
            }

            if (finaltally >9 && finaltally <= 12 ) {
                finalbread = "Mountain Bread";
            }

            if (finaltally >= 13 ){
                finalbread = "Hardtack";
            }
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fourthquestion);
            // find the screen element that you need
            TextView result = (TextView) findViewById (R.id.result);
            result.setText("You are " + finalbread);
            Button back = (Button) findViewById(R.id.back);
            Button findrecipes = (Button) findViewById (R.id.findrecipes);

            //set the onClick listener for the button
            back.setOnClickListener(new View.OnClickListener()
                                    {
                                        @Override
                                        public void onClick(View v){
                                            startActivity(new Intent(Result.this, Result.class ));
                                        }//end getDataFromDatabase
                                    }//end OnClickListener
            );//end loadDataButton.setOnClickListener

            findrecipes.setOnClickListener(new View.OnClickListener()
                                           {
                                               @Override
                                               public void onClick(View v){
                                                   startActivity(new Intent(Result.this, Result.class ));
                                               }//end getDataFromDatabase
                                           }//end OnClickListener
            );//end loadDataButton.setOnClickListener
        }//end getDataFromDatabase()
    }
