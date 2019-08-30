package com.steven.fragment.original;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.steven.fragment.R;
import com.steven.fragment.original.fragment.OriginalFragment;


public class OriginalFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_original_fragment);
        initListener();
    }

    private void initListener(){
        OriginalFragment.position=0;
        getSupportFragmentManager().beginTransaction().replace(R.id.content_root,new OriginalFragment()).commit();
    }
}
