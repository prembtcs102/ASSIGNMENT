package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpager.Fragment.FragmentFirst;
import com.example.viewpager.Fragment.FragmentSecond;
import com.example.viewpager.adapter.MyPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private  TabLayout tabLayout ;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tabLayout = (TabLayout) findViewById(R.id.tabs);
         viewPager = (ViewPager) findViewById(R.id.pager);
         tabLayout.setupWithViewPager(viewPager);
         setupViewPager();


    }

    private void setupViewPager() {
        MyPagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        adapter.sam(new FragmentFirst(),"ONE");
        adapter.sam(new FragmentSecond(),"TWO");
        viewPager.setAdapter(adapter);
    }

}
