package com.antway.androidsupportdemo.tablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.antway.androidsupportdemo.R;
import com.sensorsdata.analytics.android.sdk.SensorsDataFragmentTitle;

@SensorsDataFragmentTitle(title = "HomeFragment")
public class HomeFragment extends Fragment {
    public HomeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}