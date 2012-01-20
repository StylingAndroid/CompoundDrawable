package com.stylingandroid.compounddrawable;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CompoundDrawableActivity extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );
		setContentView( R.layout.main );

		TextView tv = (TextView) findViewById( R.id.textView );
		tv.setCompoundDrawablesWithIntrinsicBounds( 0, R.drawable.ic_launcher,
				0, 0 );
	}
}