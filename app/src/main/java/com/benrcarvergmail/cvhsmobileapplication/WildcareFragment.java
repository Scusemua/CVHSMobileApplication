package com.benrcarvergmail.cvhsmobileapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by CvilleRobotics-2 on 3/8/2016.
 */

public class WildcareFragment extends Fragment {

    // Required default constructor
    public WildcareFragment() {

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_wildcare, container, false);

        return rootView;
    }
}
