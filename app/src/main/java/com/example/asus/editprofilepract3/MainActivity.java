package com.example.asus.editprofilepract3;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;
import java.util.List;

import static com.example.asus.editprofilepract3.R.id.tabs;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        TabLayout tas = (TabLayout) findViewById(tabs);
        tas.addTab(tas.newTab().setText("General"));
        tas.addTab(tas.newTab().setText("Personal"));
        tas.addTab(tas.newTab().setText("Skills"));

        tas.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        // Adapter adapter = new Adapter(getSupportFragmentManager());
        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new GeneralFragment(), "General");
        adapter.addFragment(new BasicInfo(), "Personal");
        adapter.addFragment(new Skills(), "Skills");

        viewPager.setAdapter(adapter);

    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }
}
