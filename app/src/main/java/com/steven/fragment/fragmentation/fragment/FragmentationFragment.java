package com.steven.fragment.fragmentation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.steven.fragment.R;

import me.yokeyword.fragmentation.SupportFragment;


public class FragmentationFragment extends SupportFragment {
    private TextView mTvContent;


    public FragmentationFragment() {
        // Required empty public constructor
    }

    public static FragmentationFragment newInstance() {
        FragmentationFragment fragment = new FragmentationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_plus_one, container, false);

        mTvContent = (TextView) view.findViewById(R.id.fragment_tv_name);
        initData();
        initListener(view);
        return view;
    }

    private void initData(){
//        mTvContent.setText(getPosition());
    }
    private void initListener(View root){
        root.findViewById(R.id.fragment_bt_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(FragmentationFragment.newInstance());
            }
        });

        root.findViewById(R.id.fragment_bt_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(FragmentationFragment.newInstance());
            }
        });
        root.findViewById(R.id.fragment_bt_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                start(FragmentationFragment.newInstance(),SINGLETASK);
            }
        });
    }

}
