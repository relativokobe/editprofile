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
        getSupportActionBar().show();
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        //setupViewPager(viewPager);
        TabLayout tas = (TabLayout) findViewById(tabs);
        tas.addTab(tas.newTab().setText("General"));
        tas.addTab(tas.newTab().setText("Basic Info"));
        tas.addTab(tas.newTab().setText("Essentials"));
        tas.setupWithViewPager(viewPager);

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.menu_frame,new GeneralFragment()).commit();//Para una magpakita ang GeneralFragment

        tas.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                FragmentManager fm = getSupportFragmentManager();
                if(tab.getPosition() == 0){
                    fm.beginTransaction().replace(R.id.menu_frame,new GeneralFragment()).commit();
                }
                else if(tab.getPosition() == 1){
                    fm.beginTransaction().replace(R.id.menu_frame,new BasicInfo()).commit();
                }
                else if(tab.getPosition() == 2){
                    fm.beginTransaction().replace(R.id.menu_frame,new Skills()).commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                FragmentManager fm = getSupportFragmentManager();
                if(tab.getPosition() == 0){
                    fm.beginTransaction().replace(R.id.menu_frame,new GeneralFragment()).commit();
                }
                else if(tab.getPosition() == 1){
                    fm.beginTransaction().replace(R.id.menu_frame,new BasicInfo()).commit();
                }
                else if(tab.getPosition() == 2){
                    fm.beginTransaction().replace(R.id.menu_frame,new Skills()).commit();
                }
            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        // Adapter adapter = new Adapter(getSupportFragmentManager());

        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment(new GeneralFragment(), "General");
        adapter.addFragment(new BasicInfo(), "Basic Info");
        adapter.addFragment(new Skills(), "Essentials");

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
