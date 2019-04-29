package com.example.blogapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PhnCustomAdapder extends BaseAdapter {
    Context context;
    String[] name,des,price;
    int[] photo;
    LayoutInflater layoutInflater;


    public PhnCustomAdapder(Context context, String[] name, String[] des, String[] price, int[] photo) {
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
        ImageView fimageView =  convertView.findViewById(R.id.frontimageid);
        TextView fname =  convertView.findViewById(R.id.frontnameid);
        TextView fdes =  convertView.findViewById(R.id.frontdesid);
        TextView fprice =  convertView.findViewById(R.id.frontpriceid);

        fimageView.setImageResource(photo[position]);
        fname.setText(name[position]);
        fdes.setText(des[position]);
        fprice.setText(price[position]);




        return convertView;
    }
}
