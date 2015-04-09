package com.example.finishactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class FinishActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        System.out.println("============= onCreate");
        Button finishButton = (Button)findViewById(R.id.button1);
        finishButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	System.out.println("============= onPause");
    };
    
    @Override
    protected void onStop() {
    	super.onStop();
    	System.out.println("============= onStop");
    };
    
    @Override
    protected void onRestart() {
    	System.out.println("============ onRestart");
    };
    
    @Override
    protected void onDestroy() {
    	super.onDestroy();
    	System.out.println("============ onDestroy");
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.finish, menu);
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
