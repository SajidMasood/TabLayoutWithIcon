package com.mr_abdali.tablayoutwithicon;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mr-Abdali on 4/20/2018.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentList = new ArrayList<>();
    private final List<String> fragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }


    @Override
    public int getCount() {
        return fragmentTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //return fragmentTitleList.get(position);
        return null;
    }

    // initialize list
    public void addFragment(Fragment fragment, String title){
        //
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }

}
