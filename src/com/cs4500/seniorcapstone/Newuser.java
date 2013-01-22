package com.cs4500.seniorcapstone;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Newuser extends Activity {

	private EditText _password1;
	private EditText _password2;
	private Button _register;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser);
    
        _password1 = (EditText) findViewById(R.id.editTextPassword);
        _password2 = (EditText) findViewById(R.id.editTextPasswordConfirm);
        _register = (Button) findViewById(R.id.buttonRegister);
        
        _register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(_password1.getText().toString().equals(_password2.getText().toString()))
				{
					
				}
				else
				{
					Toast failRegister = Toast.makeText(getApplicationContext(), "Passwords don't match ", Toast.LENGTH_SHORT);
					failRegister.show();
				}
			}
		});
    }

}
