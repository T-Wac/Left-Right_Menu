package com.twac.mymenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class LeftMenu extends Fragment {
	private Button button;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.left, container, false);
		button = (Button) view.findViewById(R.id.btn_left);
		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				System.out.println("************left*************");

			}
		});
		return view;
	}
}
