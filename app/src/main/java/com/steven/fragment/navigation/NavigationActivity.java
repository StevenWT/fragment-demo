package com.steven.fragment.navigation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.steven.fragment.R;
import com.steven.fragment.navigation.fragment.NavigationFragment;


public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_layout);
        initListener();
    }

    private void initListener(){
        NavigationFragment.position=0;

    }

}
