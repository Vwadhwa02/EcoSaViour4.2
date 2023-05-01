package com.vips.ecosaviour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bu1=findViewById(R.id.button3);
        Button bu2=findViewById(R.id.button2);
        bu2.setOnClickListener((View view) ->{
            Intent view2 = new Intent(MainActivity.this,Home.class);
            startActivity(view2);
        });
        bu1.setOnClickListener((View view) ->{
            Intent view2 = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(view2);
        });
    }
}