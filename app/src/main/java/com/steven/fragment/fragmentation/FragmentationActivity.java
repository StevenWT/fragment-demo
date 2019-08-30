package com.steven.fragment.fragmentation;

import android.os.Bundle;

import com.steven.fragment.R;
import com.steven.fragment.fragmentation.fragment.FragmentationFragment;
import com.steven.fragment.original.fragment.OriginalFragment;

import me.yokeyword.fragmentation.SupportActivity;

public class FragmentationActivity extends SupportActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_original_fragment);
        initListener();
    }

    private void initListener(){
        OriginalFragment.position=0;
        loadRootFragment(R.id.content_root,FragmentationFragment.newInstance());

    }


}
