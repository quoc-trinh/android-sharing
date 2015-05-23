package com.example.mvcpatternandroid;

import com.example.mvcpatternandroid.R;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;


/**
 * @author QuocTrinh
 * copyright (c) jbohn
 */
public class JView extends LinearLayout {
	private EditText txtDisplay;
	LayoutInflater layoutInflater;
	public JView(Activity activity) 
	{
		super(activity, null);
		
		this.setOrientation(VERTICAL);
		
		getInFlater(activity);
		
		getTxtView();
	}


	private void getInFlater(Activity activity) 
	{
		layoutInflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	private void getTxtView() {
		layoutInflater.inflate(R.layout.display, this);
		txtDisplay = (EditText) findViewById(R.id.editString);
	}

	public void setView(String s) {
		txtDisplay.setText(s);
	}
	
	public void registerListener(OnClickListener onClickListener) {
		
		View view = (View) layoutInflater.inflate(R.layout.keyboard, this);
		
		final Button button0 = (Button) view.findViewById(R.id.button0);
		final Button button1 = (Button) view.findViewById(R.id.button1);
		final Button button2 = (Button) view.findViewById(R.id.button2);
		final Button button3 = (Button) view.findViewById(R.id.button3);
		final Button button4 = (Button) view.findViewById(R.id.button4);
		final Button button5 = (Button) view.findViewById(R.id.button5);
		final Button button6 = (Button) view.findViewById(R.id.button6);
		final Button button7 = (Button) view.findViewById(R.id.button7);
		final Button button8 = (Button) view.findViewById(R.id.button8);
		final Button button9 = (Button) view.findViewById(R.id.button9);
		final Button buttonC = (Button) view.findViewById(R.id.buttonC);
		final Button buttonPlus = (Button) view.findViewById(R.id.buttonPlus);
		final Button buttonEqual = (Button) view.findViewById(R.id.buttonEqual);
		final Button buttonMinus = (Button) view.findViewById(R.id.buttonMinus);
		final Button buttonTimes = (Button) view.findViewById(R.id.buttonTimes);
		final Button buttonDivide = (Button) view
				.findViewById(R.id.buttonDivide);

		button0.setOnClickListener(onClickListener);
		button1.setOnClickListener(onClickListener);
		button2.setOnClickListener(onClickListener);
		button3.setOnClickListener(onClickListener);
		button4.setOnClickListener(onClickListener);
		button5.setOnClickListener(onClickListener);
		button6.setOnClickListener(onClickListener);
		button7.setOnClickListener(onClickListener);
		button8.setOnClickListener(onClickListener);
		button9.setOnClickListener(onClickListener);
		buttonC.setOnClickListener(onClickListener);
		buttonPlus.setOnClickListener(onClickListener);
		buttonEqual.setOnClickListener(onClickListener);
		buttonMinus.setOnClickListener(onClickListener);
		buttonTimes.setOnClickListener(onClickListener);
		buttonDivide.setOnClickListener(onClickListener);
	}

}