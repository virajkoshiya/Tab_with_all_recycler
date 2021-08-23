package com.example.tab_with_recycleview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.jetbrains.annotations.NotNull;

public class fragAdapter extends FragmentPagerAdapter {

    int tool_tab;

    public fragAdapter(TabviewPage tabviewPage, @NonNull @NotNull FragmentManager fm, int tool_tab) {
        super(fm);
        this.tool_tab = tool_tab;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                Simple simple=new Simple();
                return simple;

            case 1:
               Grid grid = new Grid();
                return grid;

            case 2:
                Staggerd staggerd = new Staggerd();
                return staggerd;


        }
        return null;
    }

    @Override
    public int getCount() {
        return tool_tab;
    }
}
