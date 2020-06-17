package com.example.todomvvm.tasks;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todomvvm.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CompletedFragement extends Fragment {


    public CompletedFragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_completed_fragement, container, false);
    }

}
