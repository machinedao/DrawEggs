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
 * Context Menu ��ʹ�� (����)
 * �ڲ����ļ������Button�ؼ���Ȼ���߼�������ΪButtonע��Context Menu
 */

public class ContextMenuActivity extends Activity {
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_context_menu);
		button = (Button)findViewById(R.id.button1);
		// Ϊ Button ע�� ContextMenu
		registerForContextMenu(button);
	}
	
	@Override
	// ÿ��Ϊ View ������������Ĳ˵�ʱ���ø÷���
	public void onCreateContextMenu(ContextMenu menu, View v, 
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		// ���� ContextMenu �Ĳ˵�ͷ���˵���
		if(v==button){
			menu.setHeaderTitle("��ѡ����ϲ���Ե�ˮ��");
			menu.add(200,200,200,"ƻ��");
			menu.add(201,201,201,"�㽶");
		}
	};
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		// ͨ���ж� itemId ����˵�ѡ���¼��޸� Button �ı�����
		if(item.getItemId()==200) {
			button.setText("ƻ��");
		} else if (item.getItemId()==201) {
			button.setText("�㽶");
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
