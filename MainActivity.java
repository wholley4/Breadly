package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView.OnItemClickListener;
import java.lang.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView recipes;

   String[] breadname = {"HardTack","WheatBread","MountainBread","YeastBread"};
   Integer[] imageid = {R.drawable.hardtack,R.drawable.wheatbread,R.drawable.mountainbread,R.drawable.yeastbread};

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes= (ListView) findViewById(R.id.listview);
        CustomListview customListview = new CustomListview(this, breadname, imageid);
        recipes.setAdapter(customListview);

        recipes.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent intent = new Intent(getApplicationContext(),HardTack.class);
                    startActivity(intent);
                }

                if(position == 1){
                    Intent intent = new Intent(getApplicationContext(),WheatBread.class);
                    startActivity(intent);
                }

                if(position == 2){
                    Intent intent = new Intent(getApplicationContext(),MountainBread.class);
                    startActivity(intent);
                }

                if(position == 3){
                    Intent intent = new Intent(getApplicationContext(),YeastBread.class);
                    startActivity(intent);
                }
            }
        });


    }
}
