package com.example.davachat5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PainSignFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PainSignFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    public static Path tracer;
    public static Bitmap bitmapSign;
    public static Canvas interfaceSign;
    public static Paint pinceau, canvasPaint;

    // TODO: Rename and change types of parameters


    public PainSignFragment() {
        super();
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



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PainSignFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PainSignFragment newInstance(String param1, String param2) {
        PainSignFragment fragment = new PainSignFragment();
        Bundle args = new Bundle();

        return fragment;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pain_sign, container, false);

    }


}