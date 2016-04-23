package com.example.demo01;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;

public class MainActivity extends Activity {

	public void fun(View view) {
		// public void fan() {

		Button bt = (Button) findViewById(R.id.b1);
		View view2 = getLayoutInflater().inflate(R.layout.login, null);

		PopupWindow pw = new PopupWindow(view2, LayoutParams.MATCH_PARENT,
				LayoutParams.MATCH_PARENT);
		// PopupWindow pw = new PopupWindow(view2, LayoutParams.WRAP_CONTENT,
		// LayoutParams.WRAP_CONTENT);
		pw.showAsDropDown(bt, 0, -100);

	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Timer timer = new Timer();      //线程
		//
		// TimerTask tt = new TimerTask() {    //子线程
		//
		// @Override
		// public void run() {
		// runOnUiThread(new Runnable() {
		// public void run() {
		// fan();              //安卓中所有更改界面显示的代码都必须写到主线程中
		// }
		// });
		// }
		// };
		// timer.schedule(tt, 5000);  //延时时间

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
