package com.example.viewpager.adapter;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.viewpager.Fragment.FragmentFirst;
import com.example.viewpager.Fragment.FragmentSecond;

import java.util.ArrayList;
import java.util.List;

public class MyPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                return new FragmentFirst();
            case 1:
                return new FragmentSecond();
        }
        return null;            }

    @Override
    public int getCount() {

        return 2;
    }

    public void sam(Fragment fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);


    }
    @Override
    public CharSequence getPageTitle(int position) {

        return mFragmentTitleList.get(position);
    }
}
