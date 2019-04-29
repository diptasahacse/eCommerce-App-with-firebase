package com.example.blogapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDescription extends AppCompatActivity implements View.OnClickListener {
    TextView phnnam,phnsdes,phnprice,phnbrdes;
    ImageView phnpic;
    Button cart;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_description);

        //recevied data from intent activity
        Bundle bundle = getIntent().getExtras();

        s = bundle.getString("item");

        this.setTitle(s+" Details");

        phnnam = findViewById(R.id.phonenameid);
        phnsdes = findViewById(R.id.shortdesid);
        phnprice = findViewById(R.id.priceid);
        phnbrdes = findViewById(R.id.brieddesid);
        cart = findViewById(R.id.addtocartid);
        phnpic = findViewById(R.id.phonelogoid);



        //phn info
        String[] pphnlist = getResources().getStringArray(R.array.phonelistname);
        String[] pphnfrontdes = getResources().getStringArray(R.array.phonefrontdes);
        String[] pphnprice = getResources().getStringArray(R.array.phoneprice);
        String[] pphnbddes = getResources().getStringArray(R.array.phonebackgrounddes);
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


        //lap info
        String[] laplist = getResources().getStringArray(R.array.laptoplistname);
        String[] lapfrontdes = getResources().getStringArray(R.array.laptopfrontdes);
        String[] lapprice = getResources().getStringArray(R.array.laptopnprice);
        String[] lapbddes = getResources().getStringArray(R.array.laptopbackgrounddes);
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





        if(bundle != null)
        {

//for phone
            if(s.equals("Redmi 6 Pro"))
            {
                phnnam.setText("Redmi 6 Pro");

                phnsdes.setText(pphnfrontdes[0]);
                phnprice.setText(pphnprice[0]);
                phnbrdes.setText(pphnbddes[0]);
                phnpic.setImageResource(pphnimg[0]);








            }
            if(s.equals("OPPO F11 Pro"))
            {
                phnnam.setText("OPPO F11 Pro");


                phnsdes.setText(pphnfrontdes[1]);
                phnprice.setText(pphnprice[1]);
                phnbrdes.setText(pphnbddes[1]);
                phnpic.setImageResource(pphnimg[1]);

            }
            if(s.equals("Redmi Y2"))
            {
                phnnam.setText("Redmi Y2");


                phnsdes.setText(pphnfrontdes[2]);
                phnprice.setText(pphnprice[2]);
                phnbrdes.setText(pphnbddes[2]);
                phnpic.setImageResource(pphnimg[2]);

            }
            if(s.equals("Xiaomi Mi A2"))
            {
                phnnam.setText("Xiaomi Mi A2");


                phnsdes.setText(pphnfrontdes[3]);
                phnprice.setText(pphnprice[3]);
                phnbrdes.setText(pphnbddes[3]);
                phnpic.setImageResource(pphnimg[3]);

            }
            if(s.equals("Vivo Y83 Pro"))
            {
                phnnam.setText("Vivo Y83 Pro");


                phnsdes.setText(pphnfrontdes[4]);
                phnprice.setText(pphnprice[4]);
                phnbrdes.setText(pphnbddes[4]);
                phnpic.setImageResource(pphnimg[4]);

            }
            if(s.equals("Vivo Y95"))
            {
                phnnam.setText("Vivo Y95");


                phnsdes.setText(pphnfrontdes[5]);
                phnprice.setText(pphnprice[5]);
                phnbrdes.setText(pphnbddes[5]);
                phnpic.setImageResource(pphnimg[5]);

            }
            if(s.equals("Samsung Galaxy M20"))
            {
                phnnam.setText("Samsung Galaxy M20");


                phnsdes.setText(pphnfrontdes[6]);
                phnprice.setText(pphnprice[6]);
                phnbrdes.setText(pphnbddes[6]);
                phnpic.setImageResource(pphnimg[6]);

            }
            if(s.equals("Redmi 5"))
            {
                phnnam.setText("Redmi 5");


                phnsdes.setText(pphnfrontdes[7]);
                phnprice.setText(pphnprice[7]);
                phnbrdes.setText(pphnbddes[7]);
                phnpic.setImageResource(pphnimg[7]);

            }
            if(s.equals("Huawei Nova 3i"))
            {
                phnnam.setText("Huawei Nova 3i");

                phnsdes.setText(pphnfrontdes[8]);
                phnprice.setText(pphnprice[8]);
                phnbrdes.setText(pphnbddes[8]);
                phnpic.setImageResource(pphnimg[8]);

            }
            if(s.equals("Vivo V11 Pro"))
            {
                phnnam.setText("Vivo V11 Pro");


                phnsdes.setText(pphnfrontdes[9]);
                phnprice.setText(pphnprice[9]);
                phnbrdes.setText(pphnbddes[9]);
                phnpic.setImageResource(pphnimg[9]);

            }
            //for laptop


            if(s.equals("Apple MacBook Air"))
            {
                phnnam.setText("Apple MacBook Air");

                phnsdes.setText(lapfrontdes[0]);
                phnprice.setText(lapprice[0]);
                phnbrdes.setText(lapbddes[0]);
                phnpic.setImageResource(lapimg[0]);








            }
            if(s.equals("Apple MacBook Pro"))
            {
                phnnam.setText("Apple MacBook Pro");


                phnsdes.setText(lapfrontdes[1]);
                phnprice.setText(lapprice[1]);
                phnbrdes.setText(lapbddes[1]);
                phnpic.setImageResource(lapimg[1]);

            }
            if(s.equals("ASUS TUF FX504 Core i7"))
            {
                phnnam.setText("ASUS TUF FX504 Core i7");


                phnsdes.setText(lapfrontdes[2]);
                phnprice.setText(lapprice[2]);
                phnbrdes.setText(lapbddes[2]);
                phnpic.setImageResource(lapimg[2]);

            }
            if(s.equals("ASUS ROG Strix Hero"))
            {
                phnnam.setText("ASUS ROG Strix Hero");


                phnsdes.setText(lapfrontdes[3]);
                phnprice.setText(lapprice[3]);
                phnbrdes.setText(lapbddes[3]);
                phnpic.setImageResource(lapimg[3]);

            }
            if(s.equals("ASUS ROG Strix GL503GE-EN169T"))
            {
                phnnam.setText("ASUS ROG Strix GL503GE-EN169T");


                phnsdes.setText(lapfrontdes[4]);
                phnprice.setText(lapprice[4]);
                phnbrdes.setText(lapbddes[4]);
                phnpic.setImageResource(lapimg[4]);

            }
            if(s.equals("Asus ROG Zephryrus"))
            {
                phnnam.setText("Asus ROG Zephryrus");


                phnsdes.setText(lapfrontdes[5]);
                phnprice.setText(lapprice[5]);
                phnbrdes.setText(lapbddes[5]);
                phnpic.setImageResource(lapimg[5]);

            }
            if(s.equals("Acer Predator Helios 300"))
            {
                phnnam.setText("Acer Predator Helios 300");


                phnsdes.setText(lapfrontdes[6]);
                phnprice.setText(lapprice[6]);
                phnbrdes.setText(lapbddes[6]);
                phnpic.setImageResource(lapimg[6]);

            }
            if(s.equals("Acer Predator Triton"))
            {
                phnnam.setText("Acer Predator Triton");


                phnsdes.setText(lapfrontdes[7]);
                phnprice.setText(lapprice[7]);
                phnbrdes.setText(lapbddes[7]);
                phnpic.setImageResource(lapimg[7]);

            }
            if(s.equals("MSI GL63 8RE"))
            {
                phnnam.setText("MSI GL63 8RE");

                phnsdes.setText(lapfrontdes[8]);
                phnprice.setText(lapprice[8]);
                phnbrdes.setText(lapbddes[8]);
                phnpic.setImageResource(lapimg[8]);

            }
            if(s.equals("Acer Predator G9-793"))
            {
                phnnam.setText("Acer Predator G9-793");


                phnsdes.setText(lapfrontdes[9]);
                phnprice.setText(lapprice[9]);
                phnbrdes.setText(lapbddes[9]);
                phnpic.setImageResource(lapimg[9]);

            }



        }

        cart.setOnClickListener(this);






























        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
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



    //add to cart listener

    @Override
    public void onClick(View v) {



        Intent intent  =  new Intent(getApplicationContext(),ShoppingCart.class);
        intent.putExtra("shopitem",s);
        startActivity(intent);












    }
}
