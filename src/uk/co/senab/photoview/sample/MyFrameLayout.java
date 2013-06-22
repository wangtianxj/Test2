package uk.co.senab.photoview.sample;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class MyFrameLayout extends FrameLayout {

	public MyFrameLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		Log.v("touch","=========onTouchEvent============ev:"+event.getAction());
		return super.onTouchEvent(event);
	}
	
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		Log.v("touch","=========onInterceptTouchEvent============ev:"+ev.getAction());
		return super.onInterceptTouchEvent(ev);
	}
	
	
	
}
