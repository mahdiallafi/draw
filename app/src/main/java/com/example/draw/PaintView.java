package com.example.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

public class PaintView extends View {
    public ViewGroup.LayoutParams params;
    private Path path = new Path();
    private Paint paint = new Paint();

    public PaintView(Context context) {
        super(context);
     ///   init(null);
        ///this part for crerwate painter
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(8f);
        params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float pointx=event.getX();
        float pointy=event.getY();
        switch (event.getAction()){
            case  MotionEvent.ACTION_DOWN:
                path.moveTo(pointx,pointy);
                return true;
            case MotionEvent.ACTION_MOVE:
                path.lineTo(pointx,pointy);
                break;
            default:
                return  false;
        }
        postInvalidate();
        return false;
    }

    @Override
    protected void onDraw(Canvas canvas) {
          canvas.drawPath(path,paint);
        //   paint.setColor(Color.BLUE);
    }
}