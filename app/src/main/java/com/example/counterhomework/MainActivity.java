package com.example.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int increment = 0;
    private TextView showCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCount =findViewById(R.id.showCount);

        if(savedInstanceState != null){
            increment = savedInstanceState.getInt("count");
            showCount.setText(""+increment);
        }
    }

    public void increment(View view) {
        increment++;

        if(showCount != null){
            showCount.setText(Integer.toString(increment));
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("count", increment);

    }
}