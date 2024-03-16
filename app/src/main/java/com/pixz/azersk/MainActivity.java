package com.pixz.azersk;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pixz.azersk.infos.MenuActivity;

public class MainActivity extends AppCompatActivity {

    ImageView imageView1, imageView2, imageView3,imageView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find ImageView elements by their IDs
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView11 = findViewById(R.id.imageView11);




        // Set click listeners for each ImageView
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start FirstActivity when imageView1 is clicked
                startActivity(new Intent(MainActivity.this, FirstActivity.class));
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start SecondActivity when imageView2 is clicked
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start ThirdActivity when imageView3 is clicked
                startActivity(new Intent(MainActivity.this, ThirdActivity.class));
            }
        });

        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start ThirdActivity when imageView3 is clicked
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
            }
        });





    }
}
