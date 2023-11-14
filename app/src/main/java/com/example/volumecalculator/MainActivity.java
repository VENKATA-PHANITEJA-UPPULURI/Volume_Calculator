package com.example.volumecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //1. Adapter View
    GridView Gridview;
    //2. Data Source
    ArrayList<ModelClass> shapesarraylist;
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gridview=findViewById(R.id.gridview);
        shapesarraylist=new ArrayList<>();
        ModelClass s1=new ModelClass(R.drawable.img_3,"Sphere");
        ModelClass s2=new ModelClass(R.drawable.img,"Cylinder");
        ModelClass s3=new ModelClass(R.drawable.img_4,"Cube");
        ModelClass s4=new ModelClass(R.drawable.img_2,"Prism");
        shapesarraylist.add(s1);
        shapesarraylist.add(s2);shapesarraylist.add(s3);
        shapesarraylist.add(s4);
        adapter=new MyCustomAdapter(shapesarraylist,getApplicationContext());
        Gridview.setAdapter(adapter);
        Gridview.setNumColumns(2);
        Gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0) {
                    Intent i = new Intent(getApplicationContext(), Sphere.class);
                    startActivity(i);
                }
                else if(position==1){
                    Intent i = new Intent(getApplicationContext(), Cylinder.class);
                    startActivity(i);

                }
                else if(position==2){
                    Intent i = new Intent(getApplicationContext(), Cube.class);
                    startActivity(i);

                }
                else if(position==3){
                    Intent i = new Intent(getApplicationContext(), Prism.class);
                    startActivity(i);

                }

            }
        });



    }
}