package com.transposesolutions.customlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CustomLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_layout);
    }
    public void next(View view){
        Intent intent= new Intent (this,Next.class);
        startActivity(intent);
    }

    public void toast_message(View view) {
        Toast.makeText(CustomLayout.this,"You got it!", Toast.LENGTH_SHORT).show();

    }
}