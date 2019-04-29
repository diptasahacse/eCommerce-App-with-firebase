package com.example.blogapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class Laptop extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_laptop, container, false);

        final String[] laplist = getResources().getStringArray(R.array.laptoplistname);
        final String[] lapfrontdes = getResources().getStringArray(R.array.laptopfrontdes);
        final String[] lapprice = getResources().getStringArray(R.array.laptopnprice);
        int [] lapimg = {

                R.drawable.l1,
                R.drawable.l2,
                R.drawable.l3,
                R.drawable.l4,
                R.drawable.l5,
                R.drawable.l6,
                R.drawable.l7,
                R.drawable.l8,
                R.drawable.l9,
                R.drawable.l10

        };


        ListView listView = view.findViewById(R.id.laptoplistviewid);
        LaptopCustomAdapder laptopCustomAdapder = new LaptopCustomAdapder(getActivity(),laplist,lapfrontdes,lapprice,lapimg);



        listView.setAdapter(laptopCustomAdapder);


//listview with listener

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = laplist[position];

                Intent intent = new Intent(getActivity(),ItemDescription.class);
                intent.putExtra("item",value);
                startActivity(intent);












            }
        });










        // Inflate the layout for this fragment
        return view;
    }


}
