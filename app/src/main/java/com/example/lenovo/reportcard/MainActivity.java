package com.example.lenovo.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showCard = (Button) findViewById(R.id.show_card);

        showCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showCard = new Intent(MainActivity.this,Report.class);
                startActivity(showCard);
            }
        });


    }
}
