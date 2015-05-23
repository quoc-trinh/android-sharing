package com.example.mvcpatternandroid;

import com.example.mvcpatternandroid.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.ViewGroup;

/**
 * @author QuocTrinh
 * copyright (c) jbohn
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final JModel myModel = new JModel();
		final JView myView = new JView(this);

		JController myController = new JController(myModel, myView);

		ViewGroup viewGroup = (ViewGroup) findViewById(R.id.myLayout);
		viewGroup.addView(myView);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
