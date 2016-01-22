package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ImageView;

public class Basic extends Activity {
	ImageView im;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basic);
		im=(ImageView) findViewById(R.id.imageView1);
		im.setImageResource(R.drawable.tp1);
		new Handler().postDelayed(new Runnable() {
		
							public void run() {
				// TODO Auto-generated method stub
				Intent fst=new Intent(getBaseContext(),MainActivity.class);
				startActivity(fst);
				finish();
				
			}
		}, 2500);
		
	}

}
