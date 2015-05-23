package com.example.mvcpatternandroid;

import com.example.mvcpatternandroid.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * @author QuocTrinh
 * copyright (c) jbohn
 * 
 */
public class JController implements OnClickListener {

	JModel myModel = null;
	JView myView = null;

	public JController(final JModel myModel, final JView myView) 
	{
		this.myModel = myModel;
		this.myView = myView;
		this.myView.registerListener(this);
	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.button0:
			myModel.setModel('0');
			break;
		case R.id.button1:
			myModel.setModel('1');
			break;
		case R.id.button2:
			myModel.setModel('2');
			break;
		case R.id.button3:
			myModel.setModel('3');
			break;
		case R.id.button4:
			myModel.setModel('4');
			break;
		case R.id.button5:
			myModel.setModel('5');
			break;
		case R.id.button6:
			myModel.setModel('6');
			break;
		case R.id.button7:
			myModel.setModel('7');
			break;
		case R.id.button8:
			myModel.setModel('8');
			break;
		case R.id.button9:
			myModel.setModel('9');
			break;
		case R.id.buttonPlus:
			myModel.setModel('+');
			break;
		case R.id.buttonDivide:
			myModel.setModel('/');
			break;
		case R.id.buttonMinus:
			myModel.setModel('-');
			break;
		case R.id.buttonTimes:
			myModel.setModel('*');
			break;
		case R.id.buttonC:
			myModel.setModel('C');
			break;
		case R.id.buttonEqual:
			myModel.setModel('=');
			break;
		}
		myView.setView(myModel.getModel());
	}
}
