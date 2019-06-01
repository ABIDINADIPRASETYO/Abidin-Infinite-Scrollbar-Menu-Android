package com.example.abidininfinitescrollbarmenuandroid.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;


import com.example.abidininfinitescrolllibrary.adapter.SimpleCategoriesAdapter;
import com.example.abidininfinitescrolllibrary.model.MockedItemsFactory;
import com.example.abidininfinitescrolllibrary.widget.LoopBarView;

public class CategoriesAdapterLoopBarFragment extends AbstractLoopBarFragment {
    public static CategoriesAdapterLoopBarFragment newInstance(int orientation) {
        Bundle args = new Bundle();
        args.putInt(EXTRA_ORIENTATION, orientation);

        CategoriesAdapterLoopBarFragment fragment = new CategoriesAdapterLoopBarFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        LoopBarView loopBarView = getLoopBarView();
        loopBarView.setCategoriesAdapter(new SimpleCategoriesAdapter(MockedItemsFactory.getCategoryItems(getContext())));
    }

    @Override
    protected Fragment getNewInstance(int orientation) {
        return newInstance(orientation);
    }
}
