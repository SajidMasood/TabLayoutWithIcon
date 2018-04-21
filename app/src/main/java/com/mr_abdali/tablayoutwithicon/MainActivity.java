package com.mr_abdali.tablayoutwithicon;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        toolbar = (Toolbar) findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewPager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //if you want title if no then txt should be null
        adapter.addFragment(new RecentsFragment(), "RECENTS");
        adapter.addFragment(new FavoritesFragment(), "FAVORITES");
        adapter.addFragment(new NearbyFragment(), "NEARBY");

        viewPager.setAdapter(adapter);

        //tablayout object
        tabLayout = (TabLayout) findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.phone);
        tabLayout.getTabAt(1).setIcon(R.drawable.heart);
        tabLayout.getTabAt(2).setIcon(R.drawable.account);
    }
}
