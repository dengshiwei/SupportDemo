package com.antway.androidsupportdemo.tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.antway.androidsupportdemo.R;

public class TabLayoutActivity extends AppCompatActivity {

    TabLayout tabLayout;
    FrameLayout frameLayout;
    private FragmentManager fragmentManager = null;
    private FragmentTransaction fragmentTransaction = null;
    private HomeFragment homeFragment;
    private AboutFragment aboutFragment;
    private BlogFragment blogFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablayout);
        tabLayout = findViewById(R.id.tablayout);
        frameLayout = findViewById(R.id.frameLayout);
        tabLayout.addTab(tabLayout.newTab().setText("Home"));
        tabLayout.addTab(tabLayout.newTab().setText("About"));
        tabLayout.addTab(tabLayout.newTab().setText("Blog"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        showFrg(homeFragment);
                        break;
                    case 1:
                        showFrg(aboutFragment);
                        break;
                    case 2:
                        showFrg(blogFragment);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        homeFragment = new HomeFragment();
        aboutFragment = new AboutFragment();
        blogFragment = new BlogFragment();
        fragmentTransaction.add(R.id.frameLayout, homeFragment, HomeFragment.class.getSimpleName()).hide(homeFragment);
        fragmentTransaction.add(R.id.frameLayout, aboutFragment, AboutFragment.class.getSimpleName()).hide(aboutFragment);
        fragmentTransaction.add(R.id.frameLayout, blogFragment, BlogFragment.class.getSimpleName()).hide(blogFragment);
        fragmentTransaction.commit();
        showFrg(homeFragment);
    }

    private void showFrg(Fragment fragment) {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.hide(homeFragment);
        fragmentTransaction.hide(aboutFragment);
        fragmentTransaction.hide(blogFragment);
        fragmentTransaction.show(fragment).commit();
    }
}