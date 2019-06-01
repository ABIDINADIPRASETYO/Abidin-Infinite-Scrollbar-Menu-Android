package com.example.abidininfinitescrolllibrary.model;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import com.example.abidininfinitescrolllibrary.R;
import com.example.abidininfinitescrolllibrary.adapter.ICategoryItem;

import java.util.ArrayList;
import java.util.List;

public class MockedItemsFactory {

    private MockedItemsFactory() {}

    public static List<ICategoryItem> getCategoryItems(Context context) {
        List<ICategoryItem> items = new ArrayList<>();
        items.add(new CategoryItem(ContextCompat.getDrawable(context, R.drawable.enls_ic_local_taxi), "Grab"));
        items.add(new CategoryItem(ContextCompat.getDrawable(context, R.drawable.enls_ic_account_balance), "Kantor"));
        items.add(new CategoryItem(ContextCompat.getDrawable(context, R.drawable.enls_ic_alarm), "Alarm"));
        items.add(new CategoryItem(ContextCompat.getDrawable(context, R.drawable.enls_vector_brush_white_24dp), "Brush"));
        items.add(new CategoryItem(ContextCompat.getDrawable(context, R.drawable.enls_vector_camera_alt_white_24dp), "Kamera"));
        items.add(new CategoryItem(ContextCompat.getDrawable(context, R.drawable.enls_vector_landscape_white_24dp), "Panorama"));
        items.add(new CategoryItem(ContextCompat.getDrawable(context, R.drawable.enls_vector_palette_white_24dp), "Palette"));
        items.add(new CategoryItem(ContextCompat.getDrawable(context, R.drawable.enls_vector_moon_white_24dp), "Malam"));
        return items;
    }
}
