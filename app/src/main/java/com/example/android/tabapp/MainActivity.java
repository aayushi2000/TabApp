package com.example.android.tabapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView camera, chat, status;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camera = (TextView) findViewById(R.id.camera);
        chat = (TextView) findViewById(R.id.chat);
        status = (TextView) findViewById(R.id.status);
        viewPager = (ViewPager) findViewById(R.id.fragment_container);
        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdapter);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }


        });
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }


        });
        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }


        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                onChangeTab(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChangeTab(int i) {
        if (i == 0) {
            camera.setTextSize(25);
            camera.setTextColor(getColor(R.color.bright_color));
            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));
            status.setTextSize(20);
            status.setTextColor(getColor(R.color.light_color));
        }
        if (i == 1) {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.light_color));
            chat.setTextSize(25);
            chat.setTextColor(getColor(R.color.bright_color));
            status.setTextSize(20);
            status.setTextColor(getColor(R.color.light_color));
        }
        if (i == 2) {
            camera.setTextSize(20);
            camera.setTextColor(getColor(R.color.light_color));
            chat.setTextSize(20);
            chat.setTextColor(getColor(R.color.light_color));
            status.setTextSize(25);
            status.setTextColor(getColor(R.color.bright_color));
        }
    }
}
