package com.rewieer.brostagram.view.fragment.tabs.add;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rewieer.brostagram.R;
import com.rewieer.brostagram.view.fragment.ViewPagerFragmentLifecycle;

public class CameraAddTab extends Fragment {
    public CameraAddTab() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_tab_add_camera, container, false);
        return view;
    }
}
