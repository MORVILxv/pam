package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int count = 0;
    public void handlebutton1(View view) {
        count++;
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button2.setText("Counter: " + count);

        if (count <= 0) {
            button2.setEnabled(false);
            button3.setEnabled(false);
        }
        else {
            button2.setEnabled(true);
            button3.setEnabled(true);
        }

    }

    public void handlebutton2(View view) {
//        Button button2 = findViewById(R.id.button2);
//        button2.setText(count);
        Toast.makeText(this, "" + count, Toast.LENGTH_SHORT).show();
    }

    public void handlebutton3(View view) {
        count--;
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);

        button2.setText("Counter: " + count);

        if (count <= 0) {
            button2.setEnabled(false);
            button3.setEnabled(false);
        }
        else {
            button2.setEnabled(true);
            button3.setEnabled(true);
        }
    }
}