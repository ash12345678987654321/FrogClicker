package com.example.frog_clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    private static long frogs=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add_frog(View view){
        TextView counter = (TextView) findViewById(R.id.text_counter);

        frogs++;
        counter.setText("Frogs: "+frogs);
    }
}
