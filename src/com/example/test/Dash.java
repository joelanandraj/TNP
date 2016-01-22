package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnCreateContextMenuListener;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Dash extends Activity {
 Spinner sp1;
 Button bt1;
 TextView tv1;
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.sam);
	tv1=(TextView)findViewById(R.id.textView1);
	sp1=(Spinner)findViewById(R.id.spinner1);
    bt1=(Button)findViewById(R.id.button3);
	
	Intent i=getIntent();
	String st=i.getStringExtra("text");
	tv1.setText(st);
	tv1.setEnabled(false);
}
	
	
}
