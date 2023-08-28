package com.self_dev.frontend_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        textView1 = findViewById(R.id.textView1);
    }

    public void click(View v) {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);
        int result = v1 + v2;
        textView1.setText("Result: " + result);
    }
}