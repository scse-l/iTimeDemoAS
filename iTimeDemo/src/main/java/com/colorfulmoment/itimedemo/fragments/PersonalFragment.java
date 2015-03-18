package com.colorfulmoment.itimedemo.fragments;

import com.alamkanak.weekview.WeekView;
import com.alamkanak.weekview.WeekViewEvent;
import com.colorfulmoment.itimedemo.R;
import com.colorfulmoment.itimedemo.R.layout;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class PersonalFragment extends Fragment {

    private WeekView mWeekView;

	public static PersonalFragment newInstance() {
		PersonalFragment fragment = new PersonalFragment();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}

	public PersonalFragment() {
		// Required empty public constructor
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_personal, container, false);
        mWeekView = (WeekView)view.findViewById(R.id.weekView);

        mWeekView.setOnEventClickListener(new WeekView.EventClickListener(){
            @Override
            public void onEventClick(WeekViewEvent event, RectF eventRect) {

            }
        });
        mWeekView.setMonthChangeListener(new WeekView.MonthChangeListener() {

            @Override
            public List<WeekViewEvent> onMonthChange(int newYear, int newMonth) {
                List<WeekViewEvent> events = new ArrayList<WeekViewEvent>();
                return events;
            }
        });
        mWeekView.setEventLongPressListener(new WeekView.EventLongPressListener(){
            @Override
            public void onEventLongPress(WeekViewEvent e, RectF r){

            }
        });

		return view;
	}
}
