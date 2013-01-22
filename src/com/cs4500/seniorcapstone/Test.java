package com.cs4500.seniorcapstone;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Test extends Activity{
	TextView getInfo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		getInfo = (TextView) findViewById(R.id.Data);
		GetLoginInfo test = new GetLoginInfo();
		String returned;
		try {
			returned = test.getLoginData();
			getInfo.setText(returned);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
