package com.kentux.portotourguide;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        PagerAdapter adapter = new PagerAdapter(this, getSupportFragmentManager());
        if (viewPager != null) {
            viewPager.setAdapter(adapter);
        }
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager(viewPager);
        }
    }
}
