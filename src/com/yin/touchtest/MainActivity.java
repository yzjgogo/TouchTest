package com.yin.touchtest;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements OnClickListener{

	private Button bt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt = (Button) findViewById(R.id.bt);
		bt.setOnClickListener(this);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if(event.getAction() == MotionEvent.ACTION_DOWN){
			System.out.println("´¥ÃþÁËÆÁÄ»");
		}
		
//		Toast.makeText(this, "´¥ÃþÁËÆÁÄ»", Toast.LENGTH_SHORT).show();
		return super.onTouchEvent(event);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		System.out.println("µã»÷ÁË°´Å¥");
	}
}
