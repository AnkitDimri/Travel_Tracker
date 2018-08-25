package com.example.android.traveltracker;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.net.Uri;


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


    public void OpenIrctc(View view) {
        goToUrl("https://www.irctc.co.in/nget/train-search");
    }

    public void OpenRedBus(View view) {
        goToUrl("https://www.redbus.in/");
    }

    public void OpenMetro(View view) {
        goToUrl("http://www.delhimetrorail.com/");
    }

    public void OpenOla(View view) {
        goToUrl("https://www.olacabs.com/");
    }

    public void OpenUber(View view) {
        goToUrl("https://www.uber.com/en-IN/");
    }

    public void OpenMakemytrip(View view) {
        goToUrl("https://www.makemytrip.com/");
    }

    public void OpenTrivago(View view) {
        goToUrl("https://www.trivago.in/");
    }

    public void OpenOyo(View view) {
        goToUrl("https://www.oyorooms.com/");
    }

    public void OpenGoibio(View view) {
        goToUrl("http://www.ibibo.com/");
    }

    public void OpenUts(View view) {
        goToUrl("https://www.utsonmobile.indianrail.gov.in/RDS/login?1");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}