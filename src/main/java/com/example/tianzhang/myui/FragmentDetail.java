package com.example.tianzhang.myui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tianzhang.jsonandroid.R;

public class FragmentDetail extends Fragment {
	private Button myAdapter;

//	class LocationCheckedListener implements View.OnClickListener {
//		@Override
//		public void onClick(View v) {
//			Intent intent = new Intent();
//			intent.setClass(getActivity(), com.example.tianzhang.android.MyListView4.class);  //从前者跳到后者，特别注意的是，在fragment中，用getActivity()来获取当前的activity
//			getActivity().startActivity(intent);
//		}
//
//	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

//		View view =inflater.inflate(R.layout.fragment_setting, container, false);
//		myAdapter = (Button)  view.findViewById(R.id.myAdapter_btn);
//		System.out.println("123456");
//		myAdapter.setOnClickListener(new LocationCheckedListener());
//		Intent intent = new Intent(getActivity(), PulldownViewActivity.class);
//		startActivity(intent);
    return inflater.inflate(R.layout.fragment_detail, container, false);

    }






}
