package com.origami;

import android.app.Activity;
import android.os.Bundle;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;
public  class  ActivitySwitchByButtonActivity  extends  Activity implements  OnGestureListener , OnDoubleTapListener  {  
    private  ViewFlipper mViewFlipper;  
    @Override   
    public  void  onCreate(Bundle savedInstanceState) {  
        super .onCreate(savedInstanceState);  
        setContentView(R.layout.main);  
          
        Button buttonNext1 = (Button) findViewById(R.id.Button_next1);  
        mViewFlipper = (ViewFlipper) findViewById(R.id.details);  
        buttonNext1.setOnClickListener(new  View.OnClickListener() {  
            public  void  onClick(View view) {  
                //在layout中定义的属性，也可以在代码中指定   
//             mViewFlipper.setInAnimation(getApplicationContext(), R.anim.push_left_in);   
//             mViewFlipper.setOutAnimation(getApplicationContext(), R.anim.push_left_out);   
//             mViewFlipper.setPersistentDrawingCache(ViewGroup.PERSISTENT_ALL_CACHES);   
//             mViewFlipper.setFlipInterval(1000);   
                mViewFlipper.showNext();  
                //调用下面的函数将会循环显示mViewFlipper内的所有View。   
//             mViewFlipper.startFlipping();   
        }  
        });  
   
        Button buttonNext2 = (Button) findViewById(R.id.Button_next2);  
        buttonNext2.setOnClickListener(new  View.OnClickListener() {  
            public  void  onClick(View view) {  
                mViewFlipper.showNext();  
        }  
   
        });     
        Button buttonNext3 = (Button) findViewById(R.id.Button_next3);  
        buttonNext3.setOnClickListener(new  View.OnClickListener() {  
            public  void  onClick(View view) {  
                mViewFlipper.showNext();  
        }  
   
        });  
   
    }
	@Override
	public boolean onSingleTapConfirmed(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onDoubleTap(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onDoubleTapEvent(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onDown(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		// TODO Auto-generated method stub
		if (e1.getX() > e2.getX()) { //move to left   
	           mViewFlipper.showNext();  
	       }else  if (e1.getX() < e2.getX()) {  
	           mViewFlipper.setInAnimation(getApplicationContext(), R.anim.push_left_in);  
	           mViewFlipper.setOutAnimation(getApplicationContext(), R.anim.push_left_out);  
	           mViewFlipper.showPrevious();  
	           mViewFlipper.setInAnimation(getApplicationContext(), R.anim.push_left_in);  
	           mViewFlipper.setOutAnimation(getApplicationContext(), R.anim.push_left_out);  
	       }else  {  
	           return  false ;  
	       }  
	       return  true ; 
	}  
    } 