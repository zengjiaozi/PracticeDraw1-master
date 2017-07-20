package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.R;

public class PracticeBitmapShader extends View {

    public PracticeBitmapShader(Context context) {
        super(context);
    }

    public PracticeBitmapShader(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PracticeBitmapShader(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        用 Bitmap 来着色。其实也就是用 Bitmap 的像素来作为图形或文字的填充

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sample_path);

        Shader shader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(4);
        paint.setStyle(Paint.Style.STROKE);
        paint.setShader(shader);
//        canvas.drawBitmap(bitmap,200,300,paint);

        canvas.drawCircle(50, 50, 20, paint);


    }
}
