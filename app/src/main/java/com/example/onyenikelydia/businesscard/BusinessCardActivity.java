package com.example.onyenikelydia.businesscard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BusinessCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_card);

        Button button = (Button)findViewById(R.id.aboutus);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aboutUsIntent = new Intent(getApplicationContext(), AboutUsActivity.class);
                startActivity(aboutUsIntent);
            }
        });
    }
}
