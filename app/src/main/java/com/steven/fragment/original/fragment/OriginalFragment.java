package com.steven.fragment.original.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.steven.fragment.BaseFragment;
import com.steven.fragment.R;
import com.steven.fragment.fragmentation.fragment.FragmentationFragment;

public class OriginalFragment extends BaseFragment {
    private TextView mTvContent;

    public OriginalFragment() {
        // Required empty public constructor
    }

    public static OriginalFragment newInstance() {
        OriginalFragment fragment = new OriginalFragment();
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
                getFragmentManager().beginTransaction().hide(OriginalFragment.this).add(((ViewGroup)getView().getParent()).getId(),new OriginalFragment()).addToBackStack(getPosition()).commit();
            }
        });

        root.findViewById(R.id.fragment_bt_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.content_root,new OriginalFragment()).addToBackStack(getPosition()).commit();
            }
        });

        root.findViewById(R.id.fragment_bt_three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().hide(OriginalFragment.this).add(((ViewGroup)getView().getParent()).getId(),new OriginalFragment()).addToBackStack(getPosition()).commit();

            }
        });
    }

}
