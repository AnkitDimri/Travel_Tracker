package com.example.android.traveltracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    private Button Nt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Nt = (Button) findViewById(R.id.next);
        Nt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                /*TODO Auto-generated method stub*/

                /*
                 * Intent is just like glue which helps to navigate one activity
                 * to another.
                 */Intent intent = new Intent(Main2Activity.this,
                        Main3Activity.class);
                startActivity(intent); // startActivity allow you to move
            }
        });
    }
}
