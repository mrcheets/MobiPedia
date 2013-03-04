package com.raccuddasys.mobipedia;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.OrientationEventListener;
import android.widget.Toast;

public class MyOrientationListener extends OrientationEventListener{
	Context context;

	public MyOrientationListener(Context context) {
		super(context);
		this.context = context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onOrientationChanged(int orientation) {
		Log.v("MyOrientationListener", "OrientationChanged to " + orientation);
		Toast toast = Toast.makeText(context, "changed orientation", 200);
		toast.show();
	}

}
