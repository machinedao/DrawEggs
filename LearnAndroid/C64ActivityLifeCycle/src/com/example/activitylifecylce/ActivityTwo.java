package com.example.activitylifecylce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityTwo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity_two);
		Button button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(ActivityTwo.this, ActivityLifeCycleActivity.class);
				startActivity(intent);
			}
		});
		
		System.out.println("============== ActivityTwo onCreate");
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		System.out.println("============== ActivityTwo onStart");
	};
	
	@Override
	protected void onResume() {
		super.onResume();
		System.out.println("============== ActivityTwo onResume");
	};
	
	@Override
	protected void onPause() {
		super.onPause();
		System.out.println("============== ActivityTwo onPause");
	};
	
	@Override
	protected void onStop() {
		super.onStop();
		System.out.println("============== ActivityTwo onStop");
	};
	
	@Override
	protected void onRestart() {
		super.onRestart();
		System.out.println("============== ActivityTwo onRestart");
	};
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.out.println("============== ActivityTwo onDestroy");	
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_two, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
