package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prism extends AppCompatActivity {
    EditText Length,Height,Width;
    TextView Result;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);
        Length=findViewById(R.id.sphere_edittext);
        Result=findViewById(R.id.result);
        Submit=findViewById(R.id.submit);
        Height=findViewById(R.id.height);
        Width=findViewById(R.id.width);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rad=Length.getText().toString();
                double rad1=Double.parseDouble(rad);
                String ht=Height.getText().toString();
                Double ht1=Double.parseDouble(ht);
                String wdth=Width.getText().toString();
                double wdth1=Double.parseDouble(wdth);

                Double Volume=rad1*ht1*wdth1;
                Result.setText("Volume " + Volume +" m^3" );
            }
        });
    }
}