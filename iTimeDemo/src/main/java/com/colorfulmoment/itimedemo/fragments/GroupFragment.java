package com.colorfulmoment.itimedemo.fragments;

import com.colorfulmoment.itimedemo.R;
import com.colorfulmoment.itimedemo.R.layout;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GroupFragment extends Fragment {
	public static GroupFragment newInstance() {
		GroupFragment fragment = new GroupFragment();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}

	public GroupFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_group, container, false);
	}
}
