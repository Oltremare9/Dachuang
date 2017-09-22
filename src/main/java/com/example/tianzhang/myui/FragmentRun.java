package com.example.tianzhang.myui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

import com.example.tianzhang.jsonandroid.R;


public class FragmentRun extends Fragment{
	//运动模式选择
    Spinner spinner;
	//运动按钮 开始按钮

	//TextView
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {



//		View v = inflater.inflate(R.layout.fragment_home, container, false);
//		spinner= (Spinner)v.findViewById(R.id.run_model_spinner);
//		spinner.setOnClickListener(new View.OnClickListener()
//		{
//			@Override
//			public void onClick(View v)
//			{
//				Toast.makeText(getActivity(),
//						"i am an ImageButton in TitleFragment ! ",
//						Toast.LENGTH_SHORT).show();
//			}
//		});
	return inflater.inflate(R.layout.fragment_home, container, false);
	}



}
