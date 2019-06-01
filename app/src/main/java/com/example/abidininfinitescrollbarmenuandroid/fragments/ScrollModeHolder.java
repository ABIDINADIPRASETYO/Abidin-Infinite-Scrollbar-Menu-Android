package com.example.abidininfinitescrollbarmenuandroid.fragments;

import com.example.abidininfinitescrolllibrary.widget.LoopBarView;

final class ScrollModeHolder {
    @LoopBarView.ScrollAttr
    private final int mScrollMode;
    private final String mDescription;

    ScrollModeHolder(@LoopBarView.ScrollAttr int scrollMode, String description) {
        mScrollMode = scrollMode;
        mDescription = description;
    }
    @LoopBarView.ScrollAttr
    int getScrollMode() {
        return mScrollMode;
    }

    @Override
    public String toString() {
        return mDescription;
    }
}
