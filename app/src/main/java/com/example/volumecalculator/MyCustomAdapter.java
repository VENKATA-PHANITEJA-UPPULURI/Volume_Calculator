package com.example.volumecalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

//This classwill be responsible for creating the
// view for each item and binding data to it.
public class MyCustomAdapter extends ArrayAdapter<ModelClass> {
    private ArrayList<ModelClass> shapesarraylist;
    Context context;

    public MyCustomAdapter( ArrayList<ModelClass> shapesarraylist, Context context) {
        super(context, R.layout.my_layout,shapesarraylist);
        this.shapesarraylist = shapesarraylist;
        this.context = context;
    }
    private static class myViewHolder{
        TextView shapename;
        ImageView shapeimg;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ModelClass shapes=getItem(position);
        myViewHolder myviewholder;
        if(convertView==null) {  //Create a new View
            myviewholder=new myViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.my_layout,parent,false);
            //Finding the views
            myviewholder.shapename=(TextView) convertView.findViewById(R.id.tagline);
            myviewholder.shapeimg=(ImageView)  convertView.findViewById(R.id.imageView);
            convertView.setTag(myviewholder);




        }
    else{
        myviewholder=(myViewHolder) convertView.getTag();
        }
    //Getting the data from the model class
        myviewholder.shapename.setText(shapes.getShapeName());
    myviewholder.shapeimg.setImageResource(shapes.getImage()   );
    return convertView;
    }
}
