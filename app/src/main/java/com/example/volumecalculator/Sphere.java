package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sphere extends AppCompatActivity {
    TextView Result;
    EditText Radius;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        Radius=findViewById(R.id.sphere_edittext);
        Result=findViewById(R.id.result);
        Submit=findViewById(R.id.submit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rad=Radius.getText().toString();
                double rad1=Double.parseDouble(rad);
                double volume=(4/3)*3.14159*rad1*rad1*rad1;
                Result.setText("Volume is " + volume + " m^3");
            }
        });


    }


}