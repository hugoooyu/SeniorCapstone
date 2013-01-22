package com.cs4500.seniorcapstone;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login extends Activity {

	private Button _loginButton;
	private Button _newUserButton;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        _loginButton = (Button) findViewById(R.id.buttonLogin);
        _newUserButton = (Button) findViewById(R.id.buttonNewUser);
        
        //New user registration.
        _newUserButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(Login.this, Newuser.class);
				
				startActivity(intent);
				
			}
		});
        
        //Login
        _loginButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});
        
    }

}
