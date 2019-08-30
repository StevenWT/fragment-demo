package com.steven.fragment;


import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * Steven
 * 2019.8.29
 */
public class BaseFragment extends Fragment {
    public static int position=0;
    private int realPosition;


    public BaseFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        realPosition=++position;
        logTag();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logTag();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        logTag();
    }

    @Override
    public void onStart() {
        super.onStart();
        logTag();
    }

    @Override
    public void onResume() {
        super.onResume();
        logTag();
    }

    @Override
    public void onPause() {
        super.onPause();
        logTag();
    }

    @Override
    public void onStop() {
        super.onStop();
        logTag();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        logTag();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        logTag();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        logTag();
    }


    protected String getPosition(){
        return getClass().getName()+ " "+realPosition;
    }

    private void logTag(){
        String methodName=Thread.currentThread().getStackTrace()[3].getMethodName();
        Log.e("fragment",getPosition()+" : "+methodName);
    }
}
