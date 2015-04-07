package com.example.c61testactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        System.out.println("============ onCreate");
    }
    
    @Override
    protected void onStart() {
    	super.onStart(); // 必须调用这个，否则程序会“停止运行”
    	System.out.println("============ onStart");
    };

    @Override
    protected void onResume() {
    	super.onResume();
    	System.out.println("============ onResume");
    };
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	System.out.println("============ onRestart");
    };
    
    @Override
    protected void onPause() {
    	super.onPause();
    	System.out.println("============ onPause");
    };
    
    @Override
    protected void onStop() {
    	super.onStop();
    	System.out.println("============ onStop");
    };
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	System.out.println("============ onDestory");
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.test, menu);
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
