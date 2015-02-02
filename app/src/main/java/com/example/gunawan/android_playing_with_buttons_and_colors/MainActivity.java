package com.example.gunawan.android_playing_with_buttons_and_colors;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textColor = (TextView)findViewById(R.id.textColor);

        Button btnAzureBlue = (Button) findViewById(R.id.btnAzureBlue);

        btnAzureBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor.setTextColor(Color.parseColor("#052FFF"));
                textColor.setText("Azure Blue");
            }
        });

        Button btnBeige = (Button) findViewById(R.id.btnBeige);

        btnBeige.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor.setTextColor(Color.parseColor("#A49480"));
                textColor.setText("Beige");
            }
        });

        Button btnBlue = (Button) findViewById(R.id.btnBlue);

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor.setTextColor(Color.parseColor("#000080"));
                textColor.setText("Blue");
            }
        });

        Button btnGreen = (Button) findViewById(R.id.btnGreen);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor.setTextColor(Color.parseColor("#006633"));
                textColor.setText("Green");
            }
        });

        Button btnGoldenYellow = (Button) findViewById(R.id.btnGoldenYellow);

        btnGoldenYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor.setTextColor(Color.parseColor("#ffdf00"));
                textColor.setText("Golden Yellow");
            }
        });

        Button btnRed = (Button) findViewById(R.id.btnRed);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor.setTextColor(Color.parseColor("#ff0000"));
                textColor.setText("Red");
            }
        });


        Button btnViolet = (Button) findViewById(R.id.btnViolet);

        btnViolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor.setTextColor(Color.parseColor("#663399"));
                textColor.setText("Violet");
            }
        });

        Button btnGrey = (Button) findViewById(R.id.btnGrey);

        btnGrey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor.setTextColor(Color.parseColor("#d3d3d3"));
                textColor.setText("Grey");
            }
        });

        Button btnOlive = (Button) findViewById(R.id.btnOlive);

        btnOlive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textColor.setTextColor(Color.parseColor("#808000"));
                textColor.setText("Olive");
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
