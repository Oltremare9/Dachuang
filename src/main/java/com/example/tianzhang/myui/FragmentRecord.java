package com.example.tianzhang.myui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tianzhang.android.PulldownViewActivity;
import com.example.tianzhang.jsonandroid.R;

public class FragmentRecord extends Fragment {

public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	View view1 =inflater.inflate(R.layout.fragment_record, container, false);

	Button button1=(Button) view1.findViewById(R.id.pulldown_scrollview_btn);
	button1.setOnClickListener(new View.OnClickListener() {
		@Override
		public void onClick(View v) {

			Intent intent = new Intent(getActivity(), PulldownViewActivity.class);
			startActivity(intent);
		}
	});

return inflater.inflate(R.layout.fragment_record, container, false);
}
}
