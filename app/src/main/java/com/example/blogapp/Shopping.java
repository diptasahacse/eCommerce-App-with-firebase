package com.example.blogapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class Shopping extends AppCompatActivity{
    TabLayout tabLayout;
    ViewPager viewPager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setTitle("Shundorbon");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        tabLayout = findViewById(R.id.tablayoutid);
        viewPager = findViewById(R.id.viewpagerid);
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);











    }
//convert the menu from xml to java
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menulayout,menu);
        return super.onCreateOptionsMenu(menu);
    }
    //add the listener in menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.profileiconid)
        {
            Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
            startActivity(intent);

        }

        if(item.getItemId() == R.id.feedbackiconid)
        {

        }
        if(item.getItemId() == R.id.calliconid)
        {

        }
        if(item.getItemId() == R.id.shareiconid)
        {

        }
        if(item.getItemId() == R.id.signouticonid)
        {
            Intent intent = new Intent(getApplicationContext(),Signin.class);
            startActivity(intent);
            finish();

        }


        return super.onOptionsItemSelected(item);
    }

    //..............................my page adapter for tablayout..................................//
    class MyPagerAdapter extends FragmentPagerAdapter {
        String item[]={"Phone","Laptop"};


        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {

            if(i == 0)
            {
                return new Mobile();
            }
            if(i == 1)
            {
                return new Laptop();
            }



            return null;
        }

        @Override
        public int getCount() {
            return item.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return item[position];
        }
    }
    //..............................my page adapter for tablayout..................................//


}
