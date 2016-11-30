package com.example.asus.editprofilepract3;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class GeneralFragment extends Fragment {

View v;
    public GeneralFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         v = inflater.inflate(R.layout.fragment_general, container, false);






        ImageView Work = (ImageView)v.findViewById(R.id.pen3);
        ImageView education = (ImageView)v.findViewById(R.id.pen2);
        ImageView Skills = (ImageView)v.findViewById(R.id.pen4);
        final ImageView BasicInfo = (ImageView)v.findViewById(R.id.pen1);
        BasicInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "BasicInfo", Toast.LENGTH_SHORT).show();
                FragmentManager fm = getFragmentManager();
                BasicInfoDialogFragment dialog = new BasicInfoDialogFragment();
                dialog.show(fm,"EDIT BASIC INFO");
            }
        });
        education.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Education", Toast.LENGTH_SHORT).show();
                FragmentManager fm = getFragmentManager();
                EducationDialogFragment e = new EducationDialogFragment();
                e.show(fm,"EDIT EDUCATION");
            }
        });
        Work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Work", Toast.LENGTH_SHORT).show();
                FragmentManager fm = getFragmentManager();
                Work e = new Work();
                e.show(fm,"EDIT WORK");
            }
        });
        Skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Skills", Toast.LENGTH_SHORT).show();
                FragmentManager fm = getFragmentManager();
                SkillsandHobbiesFragment s = new SkillsandHobbiesFragment();
                s.show(fm,"Skills and hobbies");
            }
        });
        return v;

    }


}
