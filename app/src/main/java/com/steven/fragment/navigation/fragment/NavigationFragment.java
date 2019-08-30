package com.steven.fragment.navigation.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.navigation.Navigation;

import com.steven.fragment.BaseFragment;
import com.steven.fragment.R;

public class NavigationFragment extends BaseFragment {
    private TextView mTvContent;

    public NavigationFragment() {
        // Required empty public constructor
    }

    public static NavigationFragment newInstance() {
        NavigationFragment fragment = new NavigationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
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
        mTvContent.setText(getPosition());
    }

    private void initListener(View root){
        root.findViewById(R.id.fragment_bt_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_navigationFragment_self);
            }
        });

        root.findViewById(R.id.fragment_bt_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_navigationFragment_self);
            }
        });

        root.findViewById(R.id.fragment_bt_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(getView()).navigate(R.id.action_navigationFragment_self);
            }
        });
    }

}
