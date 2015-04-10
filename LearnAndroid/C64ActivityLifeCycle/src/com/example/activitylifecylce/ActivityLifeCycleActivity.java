package com.example.activitylifecylce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class ActivityLifeCycleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_life_cycle);
        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Intent
				Intent intent = new Intent();
				// 确定目标组件
				intent.setClass(ActivityLifeCycleActivity.this, ActivityTwo.class);
				// 启动目标组件
				startActivity(intent);
			}
		});
        
        System.out.println("================== ActivityLifeCycle onCreate");
    }
    
    @Override
    protected void onStart() {
    	super.onStart();
    	System.out.println("================== ActivityLifeCycle onStart");
    };
    
    @Override
    protected void onResume() {
    	super.onResume();
    	System.out.println("================== ActivityLifeCycle onResume");
    };
    
    @Override
    protected void onPause() {
    	super.onPause();
    	System.out.println("=================== ActivityLifeCycle onPause");
    };
    
    @Override
    protected void onStop() {
    	super.onStop();
    	System.out.println("=================== ActivityLifeCycle onStop");
    };
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	System.out.println("=================== ActivityLifeCycle onRestart");
    };
    
    @Override
    protected void onDestroy() {
    	super.onRestart();
    	System.out.println("=================== ActivityLifeCycle onDestroy");
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_life_cylce, menu);
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
