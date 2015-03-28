package com.example.c54contextmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ContextMenu;
import android.view.ContextMenu.*;
import android.view.View;
import android.widget.Button;

/*
 * Context Menu 的使用 (长按)
 * 在布局文件中添加Button控件，然后逻辑代码中为Button注册Context Menu
 */

public class ContextMenuActivity extends Activity {
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_context_menu);
		button = (Button)findViewById(R.id.button1);
		// 为 Button 注册 ContextMenu
		registerForContextMenu(button);
	}
	
	@Override
	// 每次为 View 对象呼出上下文菜单时调用该方法
	public void onCreateContextMenu(ContextMenu menu, View v, 
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		// 设置 ContextMenu 的菜单头及菜单项
		if(v==button){
			menu.setHeaderTitle("请选择您喜欢吃的水果");
			menu.add(200,200,200,"苹果");
			menu.add(201,201,201,"香蕉");
		}
	};
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// 通过判断 itemId 处理菜单选中事件修改 Button 文本内容
		if(item.getItemId()==200) {
			button.setText("苹果");
		} else if (item.getItemId()==201) {
			button.setText("香蕉");
		}
		return super.onContextItemSelected(item);
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.context_menu, menu);
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
