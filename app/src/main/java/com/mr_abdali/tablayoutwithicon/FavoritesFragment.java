package com.mr_abdali.tablayoutwithicon;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mr-Abdali on 4/21/2018.
 */

public class FavoritesFragment extends Fragment {

    View view;

    public FavoritesFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.favorites_layout,container,false);
        return view;
    }
}
