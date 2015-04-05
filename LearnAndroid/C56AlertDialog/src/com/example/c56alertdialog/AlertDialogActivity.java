package com.example.c56alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AlertDialogActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 创建 AlertDialog 对象
		AlertDialog.Builder builder =  new AlertDialog.Builder(this);
		// 设置 Dialog 图标
		builder.setIcon(android.R.drawable.ic_dialog_info);
		// 设置 Dialog 标题
		builder.setTitle("AlertDiglog");
		// 设置 AlertDialog 内容
		builder.setMessage("确定删除？");
		// 添加确定按钮
		builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				setTitle("OKK");
			}
		});
		// 取消按钮
		builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				setTitle("CCancel");
			}
		});
		// 显示 AlertDialog
		builder.show();
		
//		setContentView(R.layout.activity_alert_dialog);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.alert_dialog, menu);
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
