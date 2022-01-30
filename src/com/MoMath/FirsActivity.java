package com.MoMath;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class FirsActivity extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);
		Thread logoTimer = new Thread(){
			public void run(){
				try{
					sleep(5000);
					Intent menuIntent = new Intent("com.MoMath.MENU");
					startActivity(menuIntent);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					finish();
				}
			}
		};
		logoTimer.start();
	}
}
