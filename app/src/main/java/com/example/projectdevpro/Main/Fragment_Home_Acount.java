package com.example.projectdevpro.Main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.projectdevpro.R;
import com.example.projectdevpro.databinding.FragmentHomeAcountBinding;


public class Fragment_Home_Acount extends Fragment {
    FragmentHomeAcountBinding binding;

    public static Fragment_Home_Acount newInstance(Bundle args){
        Fragment_Home_Acount fragment = new Fragment_Home_Acount();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home_acount, container, false);
        return binding.getRoot();
    }
}
