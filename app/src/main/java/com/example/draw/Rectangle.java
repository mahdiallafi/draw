package com.example.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.View;

public class Rectangle extends View {

    public Rectangle(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        //make circle
        int x=getWidth();
        int y=getHeight();
        int radius=100;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawPaint(paint);
        paint.setColor(Color.parseColor("#CD5C5C"));
        canvas.drawCircle(x/2,y/2,radius,paint);

        ///draw Rectangle
        paint.setColor(Color.parseColor("#FF0000"));
        canvas.drawRect(100,50,300,300,paint);
        ///draw Traingle
        Path path=new Path();
        Point a=new Point(350,50);
        Point b=new Point(350,300);
        Point c=new Point(550,300);
        path.setFillType(Path.FillType.EVEN_ODD);
        path.lineTo(a.x,a.y);
        path.lineTo(b.x,b.y);
        path.lineTo(c.x,c.y);
        path.lineTo(a.x,a.y);
        path.close();

        canvas.drawPath(path,paint);

    }
}
