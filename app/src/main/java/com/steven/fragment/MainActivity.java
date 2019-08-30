package com.steven.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.steven.fragment.fragmentation.FragmentationActivity;

import com.steven.fragment.navigation.NavigationActivity;
import com.steven.fragment.original.OriginalFragmentActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initListener();
    }

    private void initListener(){
        findViewById(R.id.fragment_bt_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OriginalFragmentActivity.class));
            }
        });
        findViewById(R.id.fragment_bt_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FragmentationActivity.class));
            }
        });
        findViewById(R.id.fragment_bt_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NavigationActivity.class));
            }
        });
    }
}
