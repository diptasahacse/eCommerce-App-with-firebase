package com.example.blogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ShoppingCart extends AppCompatActivity {
    TextView nam,sdes,price,tprice;
    ImageView pic;
    CheckBox rb;
    Button or;
    ProgressBar progressBar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Shopping Cart");
        setContentView(R.layout.activity_shopping_cart);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        pic = findViewById(R.id.frontimageid);
        nam = findViewById(R.id.frontnameid);
        sdes = findViewById(R.id.frontdesid);
        price = findViewById(R.id.frontpriceid);
        tprice = findViewById(R.id.totalpriceid);
        rb = findViewById(R.id.payonid);
        or = findViewById(R.id.ordernowid);
        progressBar = findViewById(R.id.progressid);












       ////////////////////////////////phone/////////////////////////////////////
        String[] pphnlist = getResources().getStringArray(R.array.phonelistname);
        String[] pphnfrontdes = getResources().getStringArray(R.array.phonefrontdes);
        String[] pphnprice = getResources().getStringArray(R.array.phoneprice);
        int [] pphnimg = {

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


        /////////////////////////////////phone//////////////////////////////////////////



        ////////////////////////////////Laptop/////////////////////////////////////
        String[] laplist = getResources().getStringArray(R.array.laptoplistname);
        String[] lapfrontdes = getResources().getStringArray(R.array.laptopfrontdes);
        String[] lapprice = getResources().getStringArray(R.array.laptopnprice);
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


        /////////////////////////////////Laptop//////////////////////////////////////////



        //recevied data from intent activity
        Bundle bundle = getIntent().getExtras();
        String s;
        s = bundle.getString("shopitem");

        if(bundle != null)
        {

//for phone
            if(s.equals("Redmi 6 Pro"))
            {
                nam.setText("Redmi 6 Pro");
                sdes.setText(pphnfrontdes[0]);
                price.setText(pphnprice[0]);
                tprice.setText(pphnprice[0]);
                pic.setImageResource(pphnimg[0]);









            }
            if(s.equals("OPPO F11 Pro"))
            {
                nam.setText("OPPO F11 Pro");
                sdes.setText(pphnfrontdes[1]);
                price.setText(pphnprice[1]);
                tprice.setText(pphnprice[1]);
                pic.setImageResource(pphnimg[1]);

            }
            if(s.equals("Redmi Y2"))
            {
                nam.setText("Redmi Y2");


                sdes.setText(pphnfrontdes[2]);
                price.setText(pphnprice[2]);
                tprice.setText(pphnprice[2]);
                pic.setImageResource(pphnimg[2]);

            }
            if(s.equals("Xiaomi Mi A2"))
            {
                nam.setText("Xiaomi Mi A2");


                sdes.setText(pphnfrontdes[3]);
                price.setText(pphnprice[3]);
                tprice.setText(pphnprice[3]);
                pic.setImageResource(pphnimg[3]);

            }
            if(s.equals("Vivo Y83 Pro"))
            {
                nam.setText("Vivo Y83 Pro");


                sdes.setText(pphnfrontdes[4]);
                price.setText(pphnprice[4]);
                tprice.setText(pphnprice[4]);
                pic.setImageResource(pphnimg[4]);

            }
            if(s.equals("Vivo Y95"))
            {
                nam.setText("Vivo Y95");


                sdes.setText(pphnfrontdes[5]);
                price.setText(pphnprice[5]);
                tprice.setText(pphnprice[5]);
                pic.setImageResource(pphnimg[5]);

            }
            if(s.equals("Samsung Galaxy M20"))
            {
                nam.setText("Samsung Galaxy M20");


                sdes.setText(pphnfrontdes[6]);
                price.setText(pphnprice[6]);
                tprice.setText(pphnprice[6]);
                pic.setImageResource(pphnimg[6]);

            }
            if(s.equals("Redmi 5"))
            {
                nam.setText("Redmi 5");


                sdes.setText(pphnfrontdes[7]);
                price.setText(pphnprice[7]);
                tprice.setText(pphnprice[7]);
                pic.setImageResource(pphnimg[7]);

            }
            if(s.equals("Huawei Nova 3i"))
            {
                nam.setText("Huawei Nova 3i");

                sdes.setText(pphnfrontdes[8]);
                price.setText(pphnprice[8]);
                tprice.setText(pphnprice[8]);
                pic.setImageResource(pphnimg[8]);

            }
            if(s.equals("Vivo V11 Pro"))
            {
                nam.setText("Vivo V11 Pro");

                sdes.setText(pphnfrontdes[9]);
                price.setText(pphnprice[9]);
                tprice.setText(pphnprice[9]);
                pic.setImageResource(pphnimg[9]);

            }


            //for laptop

            if(s.equals("Apple MacBook Air"))
            {
                nam.setText("Apple MacBook Air");
                sdes.setText(lapfrontdes[0]);
                price.setText(lapprice[0]);
                tprice.setText(lapprice[0]);
                pic.setImageResource(lapimg[0]);


            }
            if(s.equals("Apple MacBook Pro"))
            {
                nam.setText("Apple MacBook Pro");
                sdes.setText(lapfrontdes[1]);
                price.setText(lapprice[1]);
                tprice.setText(lapprice[1]);
                pic.setImageResource(lapimg[1]);

            }
            if(s.equals("ASUS TUF FX504 Core i7"))
            {
                nam.setText("ASUS TUF FX504 Core i7");


                sdes.setText(lapfrontdes[2]);
                price.setText(lapprice[2]);
                tprice.setText(lapprice[2]);
                pic.setImageResource(lapimg[2]);

            }
            if(s.equals("ASUS ROG Strix Hero"))
            {
                nam.setText("ASUS ROG Strix Hero");


                sdes.setText(lapfrontdes[3]);
                price.setText(lapprice[3]);
                tprice.setText(lapprice[3]);
                pic.setImageResource(lapimg[3]);

            }
            if(s.equals("ASUS ROG Strix GL503GE-EN169T"))
            {
                nam.setText("ASUS ROG Strix GL503GE-EN169T");


                sdes.setText(lapfrontdes[4]);
                price.setText(lapprice[4]);
                tprice.setText(lapprice[4]);
                pic.setImageResource(lapimg[4]);

            }
            if(s.equals("Asus ROG Zephryrus"))
            {
                nam.setText("Asus ROG Zephryrus");


                sdes.setText(lapfrontdes[5]);
                price.setText(lapprice[5]);
                tprice.setText(lapprice[5]);
                pic.setImageResource(lapimg[5]);

            }
            if(s.equals("Acer Predator Helios 300"))
            {
                nam.setText("Acer Predator Helios 300");


                sdes.setText(lapfrontdes[6]);
                price.setText(lapprice[6]);
                tprice.setText(lapprice[6]);
                pic.setImageResource(lapimg[6]);

            }
            if(s.equals("Acer Predator Triton"))
            {
                nam.setText("Acer Predator Triton");


                sdes.setText(lapfrontdes[7]);
                price.setText(lapprice[7]);
                tprice.setText(lapprice[7]);
                pic.setImageResource(lapimg[7]);

            }
            if(s.equals("MSI GL63 8RE"))
            {
                nam.setText("MSI GL63 8RE");

                sdes.setText(lapfrontdes[8]);
                price.setText(lapprice[8]);
                tprice.setText(lapprice[8]);
                pic.setImageResource(lapimg[8]);

            }
            if(s.equals("Acer Predator G9-793"))
            {
                nam.setText("Acer Predator G9-793");

                sdes.setText(lapfrontdes[9]);
                price.setText(lapprice[9]);
                tprice.setText(lapprice[9]);
                pic.setImageResource(lapimg[9]);

            }













        }


        or.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rb.isChecked())
                {
                    progressBar.setVisibility(View.VISIBLE);

                    Intent intent = new Intent(ShoppingCart.this,Shopping.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(),"Thanks For Shopping with us",Toast.LENGTH_LONG).show();


                }
                else
                {
                    Toast.makeText(getApplicationContext(),"You have to Check",Toast.LENGTH_LONG).show();
                }

            }
        });






    }





    //back button listener

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home)
        {
            this.finish();
        }


        return super.onOptionsItemSelected(item);
    }
}
