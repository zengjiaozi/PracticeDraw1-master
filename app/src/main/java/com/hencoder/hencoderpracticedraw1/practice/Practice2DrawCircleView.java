package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {


    public Practice2DrawCircleView(Context context) {
        super(context, null);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(120, 120, 100, paint);

        Paint paint1 = new Paint();
        paint1.setColor(Color.BLACK);
        paint1.setStrokeWidth(4);
        paint1.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(450, 120, 100, paint1);


        Paint paint2 = new Paint();
        paint.setColor(Color.BLACK);
        paint2.setStrokeWidth(34);
        paint2.setStyle(Paint.Style.STROKE);
//        canvas.drawCircle(400, 340, 80, paint2);
        canvas.drawCircle(380, 320, 100, paint2);

    }


}
