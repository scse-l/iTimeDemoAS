package com.colorfulmoment.itimedemo.adapters;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainPagerAdapter extends FragmentPagerAdapter {
	public ArrayList<Fragment> list;

    public MainPagerAdapter(FragmentManager fm, ArrayList<Fragment> list) {
    	super(fm);  
        this.list = list;  
    }
    @Override
    public int getCount() {
    	return list.size();
    }

	@Override
	public Fragment getItem(int arg0) {
		return list.get(arg0);
	}
}
