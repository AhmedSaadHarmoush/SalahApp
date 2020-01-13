package com.example.android.salah;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ahmed.khaled on 5/6/2016.
 */
public class Adabtor extends ArrayAdapter<String> {
    private Context context;
    private final String[] itemname;
    private final Integer[] imgid;

    public Adabtor(Context context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.list_ietm, itemname);
        this.context = context;
        this.itemname = itemname;
        this.imgid = imgid;
    }

    public View getView(int position, View view, ViewGroup parent) {
        if (view==null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view= layoutInflater.inflate(R.layout.list_ietm,parent,false);
        }
        TextView t = (TextView)view.findViewById(R.id.list_text);
        ImageView i =(ImageView)view.findViewById(R.id.list_image);
        t.setText(itemname[position]);
        i.setImageResource(imgid[0]);
        return view;
    }
}