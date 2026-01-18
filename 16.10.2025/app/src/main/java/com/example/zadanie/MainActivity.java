package com.example.zadanie;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int count = 0;
    public void button1handler(View view) {
        TextView text = findViewById(R.id.text);
        TextView counter = findViewById(R.id.counter);

        text.setText("Clicked button "+"1");
        count++;
        counter.setText("Clicks: "+count);
    }

    public void button2handler(View view) {
        TextView text = findViewById(R.id.text);
        TextView counter = findViewById(R.id.counter);

        text.setText("Clicked button "+"2");
        count++;
        counter.setText("Clicks: "+count);
    }

    public void button3handler(View view) {
        TextView text = findViewById(R.id.text);
        TextView counter = findViewById(R.id.counter);

        text.setText("Clicked button "+"3");
        count++;
        counter.setText("Clicks: "+count);
    }
}