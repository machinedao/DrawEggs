package com.example.c514notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class NotificationActivity extends Activity {
	private Notification notification;
	private NotificationManager nManager;
	private Notification.Builder nBuilder;
	private int notification_id = 11;
	
	private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				nManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
				nBuilder = new Notification.Builder(NotificationActivity.this);
				// 默认闪光提示
				nBuilder.setDefaults(Notification.DEFAULT_LIGHTS);
				// 第一次出现在状态栏时的文本
				nBuilder.setTicker("here is notification");
				// 大标题
				nBuilder.setContentTitle("notification content title");
				// 小标题
				nBuilder.setContentText("notification content text, a new message");
				// 图标
				nBuilder.setSmallIcon(R.drawable.ic_launcher);
				// Indent 对象，作为 PendingIntent 参数
				Intent intent = new Intent(NotificationActivity.this,NotificationActivity.class);
				// 一个与 Activity 相关联的 PendingIntent 对象
				PendingIntent pIntent = PendingIntent.getActivity(NotificationActivity.this, 0, intent, 0);
				// 单击状态栏通知打开关联的 Activity，并通过 Intent 传递参数
				nBuilder.setContentIntent(pIntent);
				
				// 创建通知
				notification = nBuilder.build();
				// 发送通知
				nManager.notify(notification_id,notification);
				
			}
        	
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.notification, menu);
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
