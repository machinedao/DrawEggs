package com.example.c51optionsmenu;

import android.R.menu;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {
	private static int FIRST = Menu.FIRST;
	private static int SECOND = Menu.FIRST + 1;
	private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView1);        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,FIRST,1,"开始游戏");
        menu.add(0,SECOND,2,"暂停游戏");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == 1) {
            textView.setText("开始游戏");
        }
        if (id == 2) {
        	textView.setText("暂停游戏");
        }
        return super.onOptionsItemSelected(item);
    }
}
