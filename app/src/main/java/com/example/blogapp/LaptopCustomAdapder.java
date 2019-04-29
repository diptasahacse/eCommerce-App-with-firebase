package com.example.blogapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class LaptopCustomAdapder extends BaseAdapter {


    Context context;
    String[] name,des,price;
    int[] photo;
    LayoutInflater layoutInflater;

    public LaptopCustomAdapder(Context context, String[] name, String[] des, String[] price, int[] photo) {
        this.context = context;
        this.name = name;
        this.des = des;
        this.price = price;
        this.photo = photo;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null)
        {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInflater.inflate(R.layout.itemdemo,parent,false);

        }
        ImageView limageView =  convertView.findViewById(R.id.frontimageid);
        TextView lname =  convertView.findViewById(R.id.frontnameid);
        TextView ldes =  convertView.findViewById(R.id.frontdesid);
        TextView lprice =  convertView.findViewById(R.id.frontpriceid);

        limageView.setImageResource(photo[position]);
        lname.setText(name[position]);
        ldes.setText(des[position]);
        lprice.setText(price[position]);




        return convertView;
    }
}
