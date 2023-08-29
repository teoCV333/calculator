package com.self_dev.frontend_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1, num2;
    private TextView textView1;

    int operation;
    private RadioButton radioBtnSuma, radioBtnResta, radioBtnMult, radioBtnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        textView1 = findViewById(R.id.textView1);
    }

    public void suma() {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);
        int result = v1 + v2;
        textView1.setText("Result: " + result);
    }

    public void resta() {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);
        int result = v1 - v2;
        textView1.setText("Result: " + result);
    }

    public void mult() {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);
        int result = v1 * v2;
        textView1.setText("Result: " + result);
    }

    public void div() {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);
        int result = v1 / v2;
        textView1.setText("Result: " + result);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioBtnSuma:
                if (checked)
                    operation = 1;
                    break;
            case R.id.radioBtnResta:
                if (checked)
                    operation = 2;
                    break;
            case R.id.radioBtnMult:
                if (checked)
                    operation = 3;
                break;
            case R.id.radioBtnDiv:
                if (checked)
                    operation = 4;
                break;
        }
    }

    public void operate(View v) {
        switch (operation) {
            case 1: suma();
            break;
            case 2: resta();
            break;
            case 3: mult();
            break;
            case 4: div();
            break;
        }
    }
}