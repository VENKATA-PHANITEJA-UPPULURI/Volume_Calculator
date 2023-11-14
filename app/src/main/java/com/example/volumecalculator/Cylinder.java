package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Cylinder extends AppCompatActivity {
    EditText Radius,Height;
    TextView Result;
    Button Submit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        Radius=findViewById(R.id.sphere_edittext);
        Result=findViewById(R.id.result);
        Submit=findViewById(R.id.submit);
        Height=findViewById(R.id.height);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rad=Radius.getText().toString();
                double rad1=Double.parseDouble(rad);
                String ht=Height.getText().toString();
                Double ht1=Double.parseDouble(ht);
                Double Volume=3.14*rad1*rad1*ht1;
                Result.setText("Volume " + Volume +" m^3" );
            }
        });
    }
}