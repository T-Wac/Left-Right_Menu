package com.twac.mymenu;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {
	private MenuUI menuUI;
	private LeftMenu leftMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		menuUI = new MenuUI(this);
		setContentView(menuUI);
		leftMenu = new LeftMenu();
		FragmentManager fm=getFragmentManager();
		fm.beginTransaction().add(MenuUI.LEFT_ID, leftMenu).commit();
		
		
	}

}
