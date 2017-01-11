package com.thenewboston.showmethebio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageBethoven ,imageBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageBethoven = (ImageView) findViewById(R.id.imageViewBethoven);
        imageBack = (ImageView) findViewById(R.id.imageViewBack);

        imageBethoven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this ,Bethoven.class);
                startActivity(intent);
            }
        });
        imageBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentX = new Intent(MainActivity.this ,Back.class);
                startActivity(intentX);
            }
        });
    }
}
