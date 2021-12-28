package com.example.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomeView extends View {
    public int SQURE_SIZE=100;
    private Rect rect;
    private Paint paint;
    public CustomeView(Context context) {
        super(context);
        init(null);
    }

    public CustomeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public CustomeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }
    private  void init(@Nullable AttributeSet set){
      rect=new Rect();
        paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.GREEN);
    }
    public  void swapcolor(){
        paint.setColor(paint.getColor()==Color.GREEN? Color.RED:Color.GREEN);
        postInvalidate();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        //give color for draw
       /// canvas.drawColor(Color.RED);
        //Draw rectangle

        rect.left=10;
        rect.top=10;
        rect.right=rect.left+SQURE_SIZE;
        rect.bottom=rect.top+SQURE_SIZE;

       /// paint.setColor(Color.BLUE);
        canvas.drawRect(rect,paint);
    }
}
