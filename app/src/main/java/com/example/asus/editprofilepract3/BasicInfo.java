package com.example.asus.editprofilepract3;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BasicInfo extends Fragment {


    public BasicInfo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getContext(), "Basic Info!", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_basic_info2, container, false);
    }

}
