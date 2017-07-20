package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11linearGrident extends View {

    public Practice11linearGrident(Context context) {
        super(context);
    }

    public Practice11linearGrident(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11linearGrident(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        Shader shader = new LinearGradient(100, 100, 500, 500, Color.parseColor("#E91E63"), Color.parseColor("#2196F3"), Shader.TileMode.CLAMP);
        paint.setShader(shader);
        canvas.drawCircle(200, 200, 200, paint);
    }
}
