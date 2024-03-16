package com.pixz.azersk.infos;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.pixz.azersk.R;
import com.pixz.azersk.subscription.SubscribActivity;

public class MenuActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Find button1 by its ID
        button1 = findViewById(R.id.button);

        // Set click listener for button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start SubscibActivity when button1 is clicked
                startActivity(new Intent(MenuActivity.this, SubscribActivity.class));
            }
        });
    }
}
