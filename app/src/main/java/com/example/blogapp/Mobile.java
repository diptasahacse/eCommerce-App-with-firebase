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
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mobile extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_mobile, container, false);

        final String[] phnlist = getResources().getStringArray(R.array.phonelistname);
        final String[] phnfrontdes = getResources().getStringArray(R.array.phonefrontdes);
        final String[] phnprice = getResources().getStringArray(R.array.phoneprice);
        int [] phnimg = {

                R.drawable.p1,
                R.drawable.p2,
                R.drawable.p3,
                R.drawable.p4,
                R.drawable.p5,
                R.drawable.p6,
                R.drawable.p7,
                R.drawable.p8,
                R.drawable.p9,
                R.drawable.p10

        };


        ListView listView = view.findViewById(R.id.phonelistviewid);
        PhnCustomAdapder phnCustomAdapder = new PhnCustomAdapder(getActivity(),phnlist,phnfrontdes,phnprice,phnimg);



        listView.setAdapter(phnCustomAdapder);


        //listview with listener

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = phnlist[position];

                    Intent intent = new Intent(getActivity(),ItemDescription.class);
                    intent.putExtra("item",value);
                    startActivity(intent);












            }
        });





        return view;
    }

}
