package com.example.davachat5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;


public class PaintSign extends View {

    public static Path tracer;
    public static Bitmap bitmapSign;
    public static Canvas interfaceSign;
    public static Paint pinceau, canvasPaint;


    public PaintSign(Context c) {
        super(c);

    }

    public PaintSign(Context context, AttributeSet attrs) {
        super(context, attrs);
        tracer = new Path();
        pinceau = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        pinceau.setStyle(Paint.Style.STROKE);
        pinceau.setColor(Color.BLACK);
        pinceau.setAlpha(0xff);
        pinceau.setStrokeJoin(Paint.Join.ROUND);
        pinceau.setStrokeCap(Paint.Cap.ROUND);
        pinceau.setStrokeWidth(8f);
        pinceau.setDither(true);
        pinceau.setAntiAlias(true);
        canvasPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);

    }


    @Override
    public void onDraw(Canvas interfaceSign) {
        interfaceSign.drawBitmap(bitmapSign, 0, 0, pinceau);
        interfaceSign.drawPath(tracer, pinceau);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        bitmapSign = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        interfaceSign = new Canvas(bitmapSign);
    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {

        float pointX = event.getX();
        float pointY = event.getY();

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                tracer.moveTo(pointX,pointY);
                break;
            case MotionEvent.ACTION_MOVE:
                tracer.lineTo(pointX,pointY);
                break;
            case MotionEvent.ACTION_UP:
                interfaceSign.drawPath(tracer,pinceau);
                tracer.reset();
                break;
        }
        invalidate();
        return true;
    }

    public static void clearCanvas() {
   bitmapSign.eraseColor(Color.TRANSPARENT);
        System.gc();
    }


    public static Bitmap getBitmapSign(){
        return bitmapSign;
    }



    }


